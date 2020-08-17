package com.erp.service.usercenter.impl;

import com.erp.domain.usercenter.MgtRole;
import com.erp.domain.usercenter.MgtUser;
import com.erp.service.usercenter.RoleManagerService;
import com.erp.service.usercenter.UserManagerService;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class UserServiceImpl implements UserDetailsService {

    @Resource
    private UserManagerService userManagerService;
    @Resource
    private RoleManagerService roleManagerService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        org.springframework.security.core.userdetails.User user = null;
        try {
            MgtUser mgtUser = userManagerService.getUserByName(username);

            /*
             * 1.没有角色信息时,账号密码正确也会因为这个配置<security:intercept-url pattern="/**" access="ROLE_USER,ROLE_ADMIN"/>而跳转到failer.jsp
             * 2."{noon}"认证方式 不然报500 there is no PassWordEncoder mapped for the id "null"
             * 3.把用户密码、账户、角色信息封装到User里面去 让spring_security去把查询到的信息及配置文件中的信息和前台用户输入的信息进行对比
             * */
            //Collection<? extends GrantedAuthority> authorities
            List<MgtRole> roles = roleManagerService.getRoleByUserName(username);
            user = new User(mgtUser.getUsername(),mgtUser.getPassword(),mgtUser.getIsDeleted()?false:true,true,true,true,getAuthorities(roles));

        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    private Collection<SimpleGrantedAuthority> getAuthorities(List<MgtRole> roles) {
        List<SimpleGrantedAuthority> list = new ArrayList<>();
        for (MgtRole role:roles) {
            /**
             * 有这个配置<security:intercept-url pattern="/**" access="ROLE_USER,ROLE_ADMIN"/>也可以不写成"ROLE_"+role.getRoleName()
             */
            SimpleGrantedAuthority authority = new SimpleGrantedAuthority("ROLE_"+role.getRoleName());//
            list.add(authority);
        }
        return list;
    }

}

package com.erp.service.usercenter.impl;

import com.erp.domain.usercenter.MgtRole;
import com.erp.mapper.usercenter.MgtRoleMapper;
import com.erp.service.usercenter.RoleManagerService;
import com.erp.utils.EmbedIdAndTime;
import com.erp.utils.Result;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoleManagerServiceImpl implements RoleManagerService {

    @Resource
    private MgtRoleMapper roleMapper;

    @Override
    public Result registerRole(MgtRole mgtRole) {
        MgtRole role = roleMapper.getRoleByRoleName(mgtRole.getRoleName());
        if (StringUtils.isEmpty(role)){
            EmbedIdAndTime<MgtRole> embed = new EmbedIdAndTime<MgtRole>();
            embed.embedIdAndDate(mgtRole);
            int i = roleMapper.registerRole(mgtRole);
            return i>0?new Result("200" ,"生成角色成功"):new Result("201" ,"角色创建失败，请重试");
        } else {
            return new Result("201" ,"角色名重复");
        }
    }

    @Override
    public MgtRole getRoleById(String id) {
        MgtRole role = roleMapper.getRoleById(id);
        return role;
    }

    @Override
    public List<MgtRole> getRoleByCondition(MgtRole mgtRole) {
        List<MgtRole> roles = roleMapper.getRoleByCondition(mgtRole);
        return roles;
    }

    @Override
    public Result deleteRoleById(String[] id) {
        int sum = 0;
        for (int i = 0; i < id.length; i++) {
            sum += roleMapper.deleteRoleById(id[i]);
        }
        return sum==id.length?new Result("200" ,"删除成功"):new Result("201" ,"删除失败，请重试");
    }

    @Override
    public Result updateRole(MgtRole mgtRole) {
        int i = roleMapper.updateRole(mgtRole);
        return i>0?new Result("200" ,"角色信息更新成功"):new Result("201" ,"更新失败，请重试");
    }

    @Override
    public List<MgtRole> getRoleList(Integer page, Integer size) {
        PageHelper.startPage(page ,size);
        List<MgtRole> roles = roleMapper.getRoleByCondition(null);
        return roles;
    }

    @Override
    public List<MgtRole> getRoleByUserName(String username) {
        List<MgtRole> roleList = roleMapper.getRoleByUserName(username);
        return roleList;
    }
}

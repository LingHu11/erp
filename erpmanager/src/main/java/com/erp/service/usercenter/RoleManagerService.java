package com.erp.service.usercenter;

import com.erp.domain.usercenter.MgtRole;
import com.erp.utils.Result;

import java.util.List;

public interface RoleManagerService {

    Result registerRole(MgtRole mgtRole);

    // 通过username 获取用户
    MgtRole getRoleById(String id);

    // 通过条件获取用户列表
    List<MgtRole> getRoleByCondition(MgtRole mgtRole);

    // 删除用户By id
    Result deleteRoleById(String[] id);

    // 更新用户
    Result updateRole(MgtRole mgtRole);

    List<MgtRole> getRoleList(Integer page, Integer size);

    //通过用户姓名获取角色
    List<MgtRole> getRoleByUserName(String username);
}

package com.erp.service.usercenter.impl;


import com.erp.domain.usercenter.MgtUserRole;
import com.erp.mapper.usercenter.MgtUserRoleMapper;
import com.erp.service.usercenter.RoleUserService;
import com.erp.utils.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RoleUserServiceImpl implements RoleUserService {
    @Resource
    private MgtUserRoleMapper userRoleMapper;

    @Override
    public Result addUserRole(MgtUserRole userRole) {
        int i = userRoleMapper.addUserRole(userRole);
        return i>0? new Result("200","添加关联成功" ):new Result("200","添加关联失败");
    }
}

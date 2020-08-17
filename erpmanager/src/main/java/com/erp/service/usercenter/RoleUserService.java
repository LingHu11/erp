package com.erp.service.usercenter;

import com.erp.domain.usercenter.MgtUserRole;
import com.erp.utils.Result;


public interface RoleUserService {

    // 添加用户角色关联表内容
    Result addUserRole(MgtUserRole userRole);

}

package com.erp.domain.usercenter.vo;

import com.erp.domain.usercenter.MgtDepartment;
import com.erp.domain.usercenter.MgtPosition;
import com.erp.domain.usercenter.MgtRole;
import com.erp.domain.usercenter.MgtUser;
import lombok.Data;

@Data
public class UserRoleVo {

    private MgtUser user;

    private MgtRole role;

    private MgtDepartment department;

    private MgtPosition position;
}

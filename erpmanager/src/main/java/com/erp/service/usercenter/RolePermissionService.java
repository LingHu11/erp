package com.erp.service.usercenter;

import com.erp.domain.usercenter.ATreeMenu;
import com.erp.utils.Result;

import java.util.List;

public interface RolePermissionService {

    // 获取treePmn
    List<ATreeMenu> getPmntree();

    Result addpmn(String[] pmnids, String id);
}

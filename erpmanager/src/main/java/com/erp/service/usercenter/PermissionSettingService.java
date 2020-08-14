package com.erp.service.usercenter;

import com.erp.domain.usercenter.MgtPermission;
import com.erp.utils.Result;

import java.util.List;

public interface PermissionSettingService {
    Result registerPermission(MgtPermission mgtPermission);

    // 通过username 显示权限
    MgtPermission getPermissionById(String id);

    // 通过条件获取权限列表
    List<MgtPermission> getPermissionByCondition(MgtPermission mgtPermission);

    // 删除权限，by 权限id
    Result deletePermissionById(String id);

    // 更新权限内容
    Result updatePermission(MgtPermission mgtPermission);

    List<MgtPermission> getPermissionList(Integer page, Integer size);
}

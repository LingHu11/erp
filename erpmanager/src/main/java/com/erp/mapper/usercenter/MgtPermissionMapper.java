package com.erp.mapper.usercenter;


import com.erp.domain.usercenter.MgtPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 权限 Mapper 接口
 * </p>
 *
 * @author myJava
 * @since 2020-08-12
 */
public interface MgtPermissionMapper {

    int registerPermission(MgtPermission mgtPermission);

    // 通过username 显示权限
    MgtPermission getPermissionById(@Param("id") String id);

    // 通过username 显示权限通过name
    MgtPermission getPermissionByPermissionName(@Param("name") String name);

    // 通过条件获取权限列表
    List<MgtPermission> getPermissionByCondition(MgtPermission mgtPermission);

    // 删除权限，by 权限id
    int deletePermissionById(String id);

    // 更新权限内容
    int updatePermission(MgtPermission mgtPermission);

//    List<MgtPermission> loadMenu(@Param("rid") String rid);
//
//    List<MgtPermission> loadMenuTwo(@Param("rid") String rid ,@Param("path") String path);


}

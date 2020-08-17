package com.erp.mapper.usercenter;

import com.erp.domain.usercenter.ATreeMenu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 角色权限 Mapper 接口
 * </p>
 *
 * @author myJava
 * @since 2020-08-12
 */
public interface MgtRolePermissionMapper  {

    // 获取某个父类下级的权限
    List<ATreeMenu> getPmnList(String pid);

    // 获取所有的权限
    List<ATreeMenu> getPmnList();

    //插入权限数据成功
    int addpmn(@Param("id") String id,@Param("rid") String rid,@Param("pmnId") String pmnId);

    int deleteAllpmn(@Param("rid") String rid);
}

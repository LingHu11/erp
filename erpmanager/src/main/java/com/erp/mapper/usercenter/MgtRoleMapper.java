package com.erp.mapper.usercenter;


import com.erp.domain.usercenter.MgtRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author myJava
 * @since 2020-08-12
 */
public interface MgtRoleMapper {

    int registerRole(MgtRole mgtRole);

    // 通过username 获取用户
    MgtRole getRoleById(@Param("id") String id);

    // 通过username 获取用户
    MgtRole getRoleByRoleName(@Param("roleName") String roleName);

    // 通过条件获取用户列表
    List<MgtRole> getRoleByCondition(MgtRole mgtRole);

    // 删除用户By id
    int deleteRoleById(String id);

    // 更新用户
    int updateRole(MgtRole mgtRole);
}

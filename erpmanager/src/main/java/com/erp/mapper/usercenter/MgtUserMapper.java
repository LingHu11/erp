package com.erp.mapper.usercenter;

import com.erp.domain.usercenter.MgtUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author myJava
 * @since 2020-08-12
 */
public interface MgtUserMapper {

    int registerUser(MgtUser mgtUser);

    // 通过username 获取用户
    MgtUser getUserByName(@Param("username") String username);

    // 通过username 获取用户
    MgtUser getUserById(@Param("id") String id);

    // 通过条件获取用户列表
    List<MgtUser> getUserByCondition(MgtUser mgtUser);

    // 删除用户By id
    int deleteUserById(String id);

    // 更新用户
    int updateUser(MgtUser mgtUser);
}

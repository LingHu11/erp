package com.erp.service.usercenter;

import com.erp.domain.usercenter.MgtUser;
import com.erp.utils.Result;

import java.util.List;

public interface UserManagerService {
    Result registerUser(MgtUser mgtUser) throws Exception;

    // 用户登录 username = Email
    Result loginUser(String username, String password);

    List<MgtUser> selectListByCondition(MgtUser mgtUser);

    Result deleteUser(String id) throws Exception;

    MgtUser getUser(String id);

    Result updateUser(MgtUser mgtUser) throws Exception;

    List<MgtUser> selectList(Integer page, Integer size);
}

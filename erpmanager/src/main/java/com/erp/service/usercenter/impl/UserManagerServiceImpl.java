package com.erp.service.usercenter.impl;

import com.erp.domain.usercenter.MgtUser;
import com.erp.mapper.usercenter.MgtUserMapper;
import com.erp.service.usercenter.UserManagerService;
import org.springframework.stereotype.Service;
import com.erp.utils.*;
import com.github.pagehelper.PageHelper;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;


import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@Service
public class UserManagerServiceImpl implements UserManagerService {

    @Resource
    private MgtUserMapper userMapper;
    @Resource
    private JedisClient jedisClient;

    @Override
    @Transactional(rollbackFor = {Exception.class})
    public Result registerUser(MgtUser mgtUser) throws Exception {
        try {
            MgtUser user = userMapper.getUserByName(mgtUser.getUsername());
            if (StringUtils.isEmpty(user)) {
                EmbedIdAndTime<MgtUser> embed = new EmbedIdAndTime<MgtUser>();
                embed.embedIdAndDate(mgtUser);
                // 生成token作为值
                String token = "TOKEN:" + mgtUser.getDepartId() + ":" + UUID.randomUUID().toString().replace("-", "");
                mgtUser.setToken(token);
                mgtUser.setIsDeleted(false);
                mgtUser.setPassword(MD5.encrypt(mgtUser.getPassword()));
                int i = userMapper.registerUser(mgtUser);
                if (i > 0) {
                    jedisClient.set(token, JsonUtils.objectToJson(mgtUser));
                    return new Result("200", token);
                } else {
                    return new Result("201", "注册失败，请重试");
                }
            } else {
                return new Result("201", "用户名重复");
            }
        } catch (Exception e) {
            throw new Exception();
        }
    }

    // TODO 放入缓存，安全控制，cookie
    @Override
    public Result loginUser(String username, String password) {
        MgtUser mgtUser = userMapper.getUserByName(username);
        String encrypt = MD5.encrypt(password);
        if (!StringUtils.isEmpty(mgtUser) && encrypt.equals(mgtUser.getPassword())) {
            return new Result("200", mgtUser.getToken());
        } else {
            return new Result("201", "账号或密码错误");
        }
    }

    @Override
    public List<MgtUser> selectListByCondition(MgtUser mgtUser) {
        List<MgtUser> userList = userMapper.getUserByCondition(mgtUser);
        return userList;
    }

    @Override
    @Transactional(rollbackFor = {Exception.class})
    public Result deleteUser(String id) throws Exception {
        try {
            MgtUser user = getUser(id);
            int i = userMapper.deleteUserById(id);
            if (i > 0) {
                jedisClient.del(user.getToken());
                return new Result("200", "用户信息更新成功");
            } else {
                return new Result("201", "更新失败，请重试");
            }
        } catch (Exception e) {
            throw new Exception();
        }
    }

    @Override
    public MgtUser getUser(String id) {
        MgtUser user = userMapper.getUserById(id);
        return user;
    }

    @Override
    @Transactional(rollbackFor = {Exception.class})
    public Result updateUser(MgtUser mgtUser) throws Exception {
        try {
            MgtUser user = getUser(mgtUser.getId());
            int i = userMapper.updateUser(mgtUser);
            if (i > 0) {
                jedisClient.set(user.getToken(), JsonUtils.objectToJson(mgtUser));
                return new Result("200", "用户信息更新成功");
            } else {
                return new Result("201", "更新失败，请重试");
            }
        } catch (Exception e) {
            throw new Exception();
        }
    }

    @Override
    public List<MgtUser> selectList(Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<MgtUser> users = userMapper.getUserByCondition(null);
        return users;
    }
}

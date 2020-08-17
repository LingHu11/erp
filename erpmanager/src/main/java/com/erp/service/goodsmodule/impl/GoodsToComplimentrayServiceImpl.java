package com.erp.service.goodsmodule.impl;

import com.erp.domain.goodsmodule.GoodsToComplimentray;
import com.erp.domain.goodsmodule.GoodsToComplimentrayExample;
import com.erp.domain.usercenter.MgtUser;
import com.erp.mapper.goodsmodule.GoodsToComplimentrayMapper;
import com.erp.mapper.usercenter.MgtUserMapper;
import com.erp.service.goodsmodule.GoodsToComplimentrayService;
import com.erp.utils.CookieUtils;
import com.erp.utils.JedisClient;
import com.erp.utils.JsonUtils;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Service
public class GoodsToComplimentrayServiceImpl implements GoodsToComplimentrayService {
    @Autowired
    GoodsToComplimentrayMapper goodsToComplimentrayMapper;
    @Autowired
    MgtUserMapper userMapper;
    @Autowired
    JedisClient jedisClient;

    @Override
    public List<GoodsToComplimentray> findAll(Integer page, Integer size, HttpServletRequest request) {
        PageHelper.startPage(page, size);
        //补充用户信息需要做
        String token = CookieUtils.getCookieValue(request, "token");
        MgtUser user = JsonUtils.jsonToPojo(jedisClient.get(token), MgtUser.class);
        GoodsToComplimentrayExample example = new GoodsToComplimentrayExample();
        GoodsToComplimentrayExample.Criteria criteria = example.createCriteria();
        criteria.andApplicantEqualTo(user.getUsername());
        List<GoodsToComplimentray> list = goodsToComplimentrayMapper.selectByExample(example);
        return list;
    }

    @Override
    public Integer insert(GoodsToComplimentray goodsToComplimentray, HttpServletRequest request) {

        //补充用户信息需要做
        String token = CookieUtils.getCookieValue(request, "token");
        MgtUser user = JsonUtils.jsonToPojo(jedisClient.get(token), MgtUser.class);
        MgtUser user1 = new MgtUser();
        user1.setId(user.getSuperId());
        List<MgtUser> userList = userMapper.getUserByCondition(user1);
        goodsToComplimentray.setApplicant(user.getUsername());
        //补充领导信息
        goodsToComplimentray.setApprovalUser(userList.get(0).getUsername());
        goodsToComplimentray.setApprovalStatus("未审核");

        int insert = goodsToComplimentrayMapper.insert(goodsToComplimentray);
        return insert;
    }

    @Override
    public GoodsToComplimentray findById(Integer id) {
        //需要修改
        GoodsToComplimentray goodsToComplimentray = goodsToComplimentrayMapper.selectByPrimaryKey(id);
        return goodsToComplimentray;
    }

    @Override
    public Integer update(GoodsToComplimentray goodsToComplimentray) {
        Integer result = 0;
        //审核结果
        String checkResult = goodsToComplimentray.getApprovalStatus();
        if (checkResult.equals("未审核")) {
            result = goodsToComplimentrayMapper.updateForNoCheck(goodsToComplimentray);
        } else {
            goodsToComplimentray.setApprovalTime(null);
            goodsToComplimentray.setApprovalStatus("未审核");
            goodsToComplimentray.setPerserve1(null);
            result = goodsToComplimentrayMapper.updateForDenied(goodsToComplimentray);
        }
        return result;
    }
    //=====================================================================================领导开始

    @Override
    public List<GoodsToComplimentray> findAll(Integer page, Integer size, String choice) {
        PageHelper.startPage(page, size);
        GoodsToComplimentrayExample example = new GoodsToComplimentrayExample();
        GoodsToComplimentrayExample.Criteria criteria = example.createCriteria();
        //未审核
        if (choice.equals("1")) {
            criteria.andApprovalStatusEqualTo("未审核");
        }
        //已审核
        if (choice.equals("2")) {
            criteria.andApprovalStatusEqualTo("已审核");
        }
        //审核未通过
        if (choice.equals("3")) {
            criteria.andApprovalStatusEqualTo("审核未通过");
        }
        List<GoodsToComplimentray> list = goodsToComplimentrayMapper.selectByExample(example);
        return list;
    }

    @Override
    public Integer updateForBoss(GoodsToComplimentray goodsToComplimentray) {
        Integer result = 0;
        //更新时间
        goodsToComplimentray.setApprovalTime(new Date());
        goodsToComplimentrayMapper.updateByPrimaryKey(goodsToComplimentray);
        return result;
    }
}


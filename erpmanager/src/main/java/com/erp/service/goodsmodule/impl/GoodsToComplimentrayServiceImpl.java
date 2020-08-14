package com.erp.service.goodsmodule.impl;

import com.erp.domain.goodsmodule.GoodsToComplimentray;
import com.erp.mapper.goodsmodule.GoodsToComplimentrayMapper;
import com.erp.service.goodsmodule.GoodsToComplimentrayService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsToComplimentrayServiceImpl implements GoodsToComplimentrayService {
    @Autowired
    GoodsToComplimentrayMapper goodsToComplimentrayMapper;

    @Override
    public List<GoodsToComplimentray> findAll(Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<GoodsToComplimentray> list = goodsToComplimentrayMapper.selectByExample(null);
        return list;
    }

    @Override
    public Integer insert(GoodsToComplimentray goodsToComplimentray) {
        int insert = goodsToComplimentrayMapper.insert(goodsToComplimentray);
        return insert;
    }


    @Override
    public GoodsToComplimentray findById(Integer id) {
        //需要修改
        goodsToComplimentrayMapper.selectByPrimaryKey(id);
        return null;
    }


    @Override
    public Integer update(GoodsToComplimentray goodsToComplimentray) {
        int i = goodsToComplimentrayMapper.updateByPrimaryKey(goodsToComplimentray);
        return i;
    }


}

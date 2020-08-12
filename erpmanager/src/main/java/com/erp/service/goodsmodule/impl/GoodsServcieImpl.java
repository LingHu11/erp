package com.erp.service.goodsmodule.impl;

import com.erp.domain.goodsmodule.TbGoods;
import com.erp.mapper.goodsmodule.TbGoodsMapper;
import com.erp.service.goodsmodule.GoodsServcie;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class GoodsServcieImpl implements GoodsServcie {

    @Autowired
    TbGoodsMapper goodsMapper;

    @Override
    public List<TbGoods> findAll(Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<TbGoods> list = goodsMapper.selectByExample(null);
        return list;
    }
}

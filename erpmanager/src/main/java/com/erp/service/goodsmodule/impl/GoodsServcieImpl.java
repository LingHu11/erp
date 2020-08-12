package com.erp.service.goodsmodule.impl;

import com.erp.domain.goodsmodule.Goods;
import com.erp.mapper.goodsmodule.GoodsMapper;
import com.erp.service.goodsmodule.GoodsServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodsServcieImpl implements GoodsServcie {
    @Autowired
    GoodsMapper goodsMapper;

    @Override
    public List<Goods> findAll() {
        List<Goods> list = goodsMapper.findAll();
        return list;
    }
}

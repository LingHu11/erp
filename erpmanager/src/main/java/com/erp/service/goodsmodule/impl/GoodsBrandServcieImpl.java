package com.erp.service.goodsmodule.impl;

import com.erp.domain.goodsmodule.GoodsBrand;
import com.erp.domain.goodsmodule.GoodsBrandExample;
import com.erp.mapper.goodsmodule.GoodsBrandMapper;
import com.erp.service.goodsmodule.GoodsBrandServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsBrandServcieImpl implements GoodsBrandServcie {
    @Autowired
    GoodsBrandMapper goodsBrandMapper;

    @Override
    public List<GoodsBrand> findAll() {
        List<GoodsBrand> list = goodsBrandMapper.selectByExample(null);
        return list;
    }

}

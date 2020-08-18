package com.erp.service.aftermodule.impl;

import com.erp.mapper.aftermodule.GoodsImeiMapper;
import com.erp.service.aftermodule.GoodsImeiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class GoodsImeiServiceImpl implements GoodsImeiService {

    @Autowired
    private GoodsImeiMapper mapper;

    @Override
    public void delete(String goodsImei) {
        mapper.delete(goodsImei);
    }
}

package com.erp.service.aftermodule.impl;

import com.erp.domain.aftermodule.vo.GoodsVo;
import com.erp.domain.goodsmodule.Goods;
import com.erp.mapper.aftermodule.GoodsImeiMapper;
import com.erp.service.aftermodule.GoodsVoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional(rollbackFor = Exception.class)
public class GoodsVoServiceImpl implements GoodsVoService {

    @Autowired
    private GoodsImeiMapper mapper;

    @Override
    public List<GoodsVo> selectGoods(Goods goods) {
        return mapper.selectGoods(goods);
    }
}

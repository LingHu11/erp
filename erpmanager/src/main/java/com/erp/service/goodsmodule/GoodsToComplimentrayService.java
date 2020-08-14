package com.erp.service.goodsmodule;

import com.erp.domain.goodsmodule.GoodsToComplimentray;

import java.util.List;

public interface GoodsToComplimentrayService {
    Integer insert(GoodsToComplimentray goodsToComplimentray);

    List<GoodsToComplimentray> findAll(Integer page, Integer size);

    GoodsToComplimentray findById(Integer id);

    Integer update(GoodsToComplimentray goodsToComplimentray);


}

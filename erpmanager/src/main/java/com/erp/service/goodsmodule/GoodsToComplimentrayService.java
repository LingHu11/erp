package com.erp.service.goodsmodule;

import com.erp.domain.goodsmodule.GoodsToComplimentray;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface GoodsToComplimentrayService {
    Integer insert(GoodsToComplimentray goodsToComplimentray, HttpServletRequest request);

    List<GoodsToComplimentray> findAll(Integer page, Integer size, HttpServletRequest request);

    GoodsToComplimentray findById(Integer id);

    Integer update(GoodsToComplimentray goodsToComplimentray);

    //===================领导
    public List<GoodsToComplimentray> findAll(Integer page, Integer size, String choice);

    public Integer updateForBoss(GoodsToComplimentray goodsToComplimentray);
}

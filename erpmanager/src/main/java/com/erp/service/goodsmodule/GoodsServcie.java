package com.erp.service.goodsmodule;

import com.erp.domain.goodsmodule.Goods;
import com.github.pagehelper.PageHelper;

import java.util.List;

public interface GoodsServcie {
    List<Goods> findAll(Integer page, Integer size);
    List<Goods> findAll(Integer page, Integer size,Goods good);

    Integer insert(Goods good);

    void reduceById(Integer id,Integer number);
}

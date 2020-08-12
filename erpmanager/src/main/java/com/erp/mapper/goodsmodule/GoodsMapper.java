package com.erp.mapper.goodsmodule;

import com.erp.domain.goodsmodule.Goods;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface GoodsMapper {
    List<Goods> findAll();
}

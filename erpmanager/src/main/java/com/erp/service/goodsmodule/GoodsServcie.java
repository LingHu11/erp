package com.erp.service.goodsmodule;



import com.erp.domain.goodsmodule.TbGoods;

import java.util.List;

public interface GoodsServcie {
    List<TbGoods> findAll(Integer page, Integer size);


}

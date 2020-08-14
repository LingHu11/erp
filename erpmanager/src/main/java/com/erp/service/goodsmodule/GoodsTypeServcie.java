package com.erp.service.goodsmodule;

import com.erp.domain.goodsmodule.GoodsType;

import java.util.List;

public interface GoodsTypeServcie {
    List<GoodsType> findAllParent();

    List<GoodsType> findAllSon(Integer parentId);

    GoodsType getCategoryParentName(String categoryName);
}

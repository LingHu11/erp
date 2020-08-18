package com.erp.service.aftermodule;

import com.erp.domain.aftermodule.vo.GoodsVo;
import com.erp.domain.goodsmodule.Goods;

import java.util.List;

public interface GoodsVoService {

    List<GoodsVo> selectGoods(Goods goods);
}

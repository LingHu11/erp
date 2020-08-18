package com.erp.mapper.aftermodule;

import com.erp.domain.aftermodule.GoodsImei;
import com.erp.domain.aftermodule.GoodsImeiExample;
import com.erp.domain.aftermodule.vo.GoodsVo;
import com.erp.domain.goodsmodule.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsImeiMapper {
    int countByExample(GoodsImeiExample example);

    int deleteByExample(GoodsImeiExample example);

    int deleteByPrimaryKey(String goodsImei);

    int insert(GoodsImei record);

    int insertSelective(GoodsImei record);

    List<GoodsImei> selectByExample(GoodsImeiExample example);

    GoodsImei selectByPrimaryKey(String goodsImei);

    int updateByExampleSelective(@Param("record") GoodsImei record, @Param("example") GoodsImeiExample example);

    int updateByExample(@Param("record") GoodsImei record, @Param("example") GoodsImeiExample example);

    int updateByPrimaryKeySelective(GoodsImei record);

    int updateByPrimaryKey(GoodsImei record);

    void delete(String goodsImei);

    List<GoodsVo> selectGoods(Goods goods);
}
package com.erp.mapper.goodsmodule;

import com.erp.domain.goodsmodule.GoodsToComplimentray;
import com.erp.domain.goodsmodule.GoodsToComplimentrayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsToComplimentrayMapper {
    int countByExample(GoodsToComplimentrayExample example);

    int deleteByExample(GoodsToComplimentrayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsToComplimentray record);

    int insertSelective(GoodsToComplimentray record);

    List<GoodsToComplimentray> selectByExample(GoodsToComplimentrayExample example);

    GoodsToComplimentray selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsToComplimentray record, @Param("example") GoodsToComplimentrayExample example);

    int updateByExample(@Param("record") GoodsToComplimentray record, @Param("example") GoodsToComplimentrayExample example);

    int updateByPrimaryKeySelective(GoodsToComplimentray record);

    int updateByPrimaryKey(GoodsToComplimentray record);
}
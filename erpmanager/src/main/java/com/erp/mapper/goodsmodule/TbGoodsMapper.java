package com.erp.mapper.goodsmodule;

import com.erp.domain.goodsmodule.TbGoods;
import com.erp.domain.goodsmodule.TbGoodsExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface TbGoodsMapper {
    int countByExample(TbGoodsExample example);

    int deleteByExample(TbGoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbGoods record);

    int insertSelective(TbGoods record);

    List<TbGoods> selectByExample(TbGoodsExample example);

    TbGoods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbGoods record, @Param("example") TbGoodsExample example);

    int updateByExample(@Param("record") TbGoods record, @Param("example") TbGoodsExample example);

    int updateByPrimaryKeySelective(TbGoods record);

    int updateByPrimaryKey(TbGoods record);

}
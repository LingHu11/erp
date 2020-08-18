package com.erp.mapper.goodsmodule;

import com.erp.domain.goodsmodule.GoodsBrand;
import com.erp.domain.goodsmodule.GoodsBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsBrandMapper {
    int countByExample(GoodsBrandExample example);

    int deleteByExample(GoodsBrandExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsBrand record);

    int insertSelective(GoodsBrand record);

    List<GoodsBrand> selectByExample(GoodsBrandExample example);

    GoodsBrand selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsBrand record, @Param("example") GoodsBrandExample example);

    int updateByExample(@Param("record") GoodsBrand record, @Param("example") GoodsBrandExample example);

    int updateByPrimaryKeySelective(GoodsBrand record);

    int updateByPrimaryKey(GoodsBrand record);
}
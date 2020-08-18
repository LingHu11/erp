package com.erp.mapper.aftermodule;

import com.erp.domain.aftermodule.AsalesReEx;
import com.erp.domain.aftermodule.AsalesReExExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AsalesReExMapper {
    int countByExample(AsalesReExExample example);

    int deleteByExample(AsalesReExExample example);

    int deleteByPrimaryKey(String id);

    int insert(AsalesReEx record);

    int insertSelective(AsalesReEx record);

    List<AsalesReEx> selectByExample(AsalesReExExample example);

    AsalesReEx selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AsalesReEx record, @Param("example") AsalesReExExample example);

    int updateByExample(@Param("record") AsalesReEx record, @Param("example") AsalesReExExample example);

    int updateByPrimaryKeySelective(AsalesReEx record);

    int updateByPrimaryKey(AsalesReEx record);

    AsalesReEx selectByImei(String goodsImei);

    int delete(String id);
}
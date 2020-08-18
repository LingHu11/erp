package com.erp.mapper.aftermodule;

import com.erp.domain.aftermodule.AReturnStorage;
import com.erp.domain.aftermodule.AReturnStorageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AReturnStorageMapper {
    int countByExample(AReturnStorageExample example);

    int deleteByExample(AReturnStorageExample example);

    int deleteByPrimaryKey(String id);

    int insert(AReturnStorage record);

    int insertSelective(AReturnStorage record);

    List<AReturnStorage> selectByExample(AReturnStorageExample example);

    AReturnStorage selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AReturnStorage record, @Param("example") AReturnStorageExample example);

    int updateByExample(@Param("record") AReturnStorage record, @Param("example") AReturnStorageExample example);

    int updateByPrimaryKeySelective(AReturnStorage record);

    int updateByPrimaryKey(AReturnStorage record);
}
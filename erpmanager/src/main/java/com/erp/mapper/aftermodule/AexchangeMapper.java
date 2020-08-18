package com.erp.mapper.aftermodule;

import com.erp.domain.aftermodule.Aexchange;

public interface AexchangeMapper {
    int deleteByPrimaryKey(String id);

    int insert(Aexchange record);

    int insertSelective(Aexchange record);

    Aexchange selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Aexchange record);

    int updateByPrimaryKey(Aexchange record);

    Aexchange selectById(String id);

    int delete(String id);
}
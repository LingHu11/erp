package com.erp.mapper.goodsmodule;

import com.erp.domain.goodsmodule.Complimentray;
import com.erp.domain.goodsmodule.ComplimentrayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComplimentrayMapper {
    int countByExample(ComplimentrayExample example);

    int deleteByExample(ComplimentrayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Complimentray record);

    int insertSelective(Complimentray record);

    List<Complimentray> selectByExample(ComplimentrayExample example);

    Complimentray selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Complimentray record, @Param("example") ComplimentrayExample example);

    int updateByExample(@Param("record") Complimentray record, @Param("example") ComplimentrayExample example);

    int updateByPrimaryKeySelective(Complimentray record);

    int updateByPrimaryKey(Complimentray record);
}
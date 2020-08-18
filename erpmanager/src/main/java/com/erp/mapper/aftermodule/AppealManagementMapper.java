package com.erp.mapper.aftermodule;

import com.erp.domain.aftermodule.AppealManagement;
import com.erp.domain.aftermodule.AppealManagementExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AppealManagementMapper {
    int countByExample(AppealManagementExample example);

    int deleteByExample(AppealManagementExample example);

    int deleteByPrimaryKey(String id);

    int insert(AppealManagement record);

    int insertSelective(AppealManagement record);

    List<AppealManagement> selectByExample(AppealManagementExample example);

    AppealManagement selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AppealManagement record, @Param("example") AppealManagementExample example);

    int updateByExample(@Param("record") AppealManagement record, @Param("example") AppealManagementExample example);

    int updateByPrimaryKeySelective(AppealManagement record);

    int updateByPrimaryKey(AppealManagement record);

    int delete(String id);
}
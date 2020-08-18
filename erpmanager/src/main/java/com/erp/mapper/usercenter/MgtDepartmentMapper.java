package com.erp.mapper.usercenter;


import com.erp.domain.usercenter.MgtDepartment;

import java.util.List;

/**
 * <p>
 * 部门 Mapper 接口
 * </p>
 *
 * @author myJava
 * @since 2020-08-12
 */
public interface MgtDepartmentMapper {
    // 查询所有的部门
    List<MgtDepartment> getList();

    String depById(String id);
}

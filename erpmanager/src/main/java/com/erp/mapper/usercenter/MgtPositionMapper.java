package com.erp.mapper.usercenter;


import com.erp.domain.usercenter.MgtPosition;

import java.util.List;

/**
 * <p>
 * 职位 Mapper 接口
 * </p>
 *
 * @author myJava
 * @since 2020-08-12
 */
public interface MgtPositionMapper {
    // 查询所有的部门
    List<MgtPosition> getList();
}

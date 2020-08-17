package com.erp.service.usercenter.impl;

import com.erp.domain.usercenter.MgtDepartment;
import com.erp.mapper.usercenter.MgtDepartmentMapper;
import com.erp.service.usercenter.DepartmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Resource
    private MgtDepartmentMapper departmentMapper;

    @Override
    public List<MgtDepartment> getList() {
        List<MgtDepartment> list = departmentMapper.getList();
        return list;
    }
}

package com.erp.controller.usercenter;

import com.erp.domain.usercenter.MgtDepartment;
import com.erp.service.usercenter.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.annotation.security.RolesAllowed;
import java.util.List;

@Controller
@RequestMapping("/depart")
@RolesAllowed({"pmnManager","admin"})
public class DepartmentController {


    @Resource
    private DepartmentService departmentService;

    @GetMapping("/list")
    @ResponseBody
    public List<MgtDepartment> departList(){
        List<MgtDepartment> list = departmentService.getList();
        return list;
    }
}

package com.erp.controller.usercenter;

import com.erp.domain.usercenter.ATreeMenu;
import com.erp.service.usercenter.RolePermissionService;
import com.erp.utils.Result;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.annotation.security.RolesAllowed;
import java.util.List;

@Controller
@RequestMapping("/rolepmn")
@RolesAllowed({"pmnManager","admin"})
public class RolePermissionController {

    @Resource
    private RolePermissionService rolePermissionService;

    @GetMapping("/tree")
    @ResponseBody
    public List<ATreeMenu> getTreePmn(Model model){
        List<ATreeMenu> aTree = rolePermissionService.getPmntree();
        return aTree;
    }

    @GetMapping("/addpmn")
    @ResponseBody
    public String addpmn(String ids,String id){
        String[] pmnids = ids.split(",");
        Result result = rolePermissionService.addpmn(pmnids ,id);
        return "detail page TODO";
    }
}

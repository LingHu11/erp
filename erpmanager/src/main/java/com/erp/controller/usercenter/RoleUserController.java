package com.erp.controller.usercenter;

import com.erp.domain.usercenter.MgtUserRole;
import com.erp.service.usercenter.RoleUserService;
import com.erp.utils.IDUtil;
import com.erp.utils.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.annotation.security.RolesAllowed;

@Controller
@RequestMapping("/roleuser")
@RolesAllowed({"pmnManager","admin"})
public class RoleUserController {

    @Resource
    private RoleUserService roleUserService;

    @PostMapping("/add")
    public String addRoleUser(MgtUserRole userRole){
        String id = IDUtil.getItemId();
        userRole.setId(id);
        Result result = roleUserService.addUserRole(userRole);
        return "redirect:/user/getuser/"+userRole.getUserId();
    }

}

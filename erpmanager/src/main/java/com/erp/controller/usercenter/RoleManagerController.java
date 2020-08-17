package com.erp.controller.usercenter;

import com.erp.domain.usercenter.MgtRole;
import com.erp.domain.usercenter.MgtUser;
import com.erp.service.usercenter.RoleManagerService;
import com.erp.utils.Result;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.annotation.security.RolesAllowed;
import java.util.List;

@Controller
@RequestMapping("/role")
@RolesAllowed({"pmnManager","admin"})
public class RoleManagerController {

    @Resource
    private RoleManagerService roleService;

    @PostMapping("/register")
    public String register(MgtRole mgtRole , Model model){
        Result result = roleService.registerRole(mgtRole);
        if (result.getCode().equals("200")) {
            model.addAttribute("result",result);
            return "redirect:list";
        } else {
            // TODO 待完善，返回错误页面
            return null;
        }
    }

    @PostMapping("/conditionlist")
    public String selectListByCondition(MgtRole mgtRole , Model model){
        List<MgtRole> roles = roleService.getRoleByCondition(mgtRole);
        if (!StringUtils.isEmpty(roles)) {
            model.addAttribute("roles",roles);
            return "/usercenter/rolelist";
        } else {
            // TODO 待完善，返回错误页面
            return null;
        }
    }
    @GetMapping("/list")
    public String selectList(@RequestParam(defaultValue = "1") Integer page ,@RequestParam(defaultValue = "9") Integer size, Model model){
        List<MgtRole> roles = roleService.getRoleList(page,size);
        PageInfo<MgtRole> pageInfo = new PageInfo<MgtRole>(roles);
        if (!StringUtils.isEmpty(roles)) {
            model.addAttribute("pageInfo",pageInfo);
            return "/usercenter/rolelist";
        } else {
            // TODO 待完善，返回错误页面
            return null;
        }
    }
    @GetMapping("/rolelist")
    @ResponseBody
    public List<MgtRole> selectRoleList() {
        List<MgtRole> roleList = roleService.getRoleByCondition(null);
        return roleList;
    }


    @PostMapping("/delete")
    public String deleteRole(String[] ids , Model model) {
        Result result = roleService.deleteRoleById(ids);
        if (result.getCode().equals("200")) {
            model.addAttribute("result",result);
            return "redirect:list";
        } else {
            // TODO 待完善，返回错误页面
            return null;
        }
    }

    @GetMapping("/getrole/{id}")
    public String getRole(@PathVariable String id, Model model){
        MgtRole role = roleService.getRoleById(id);
        if (!StringUtils.isEmpty(role)) {
            model.addAttribute("role",role);
            return "/usercenter/addrole";
        } else {
            // TODO 待完善，返回错误页面
            return null;
        }
    }

    @PostMapping("/update")
    public String updateRole(MgtRole mgtRole , Model model){
        Result result = roleService.updateRole(mgtRole);
        if (result.getCode().equals("200")) {
            model.addAttribute("result",result);
            return "redirect:list";
        } else {
            // TODO 待完善，返回错误页面
            return null;
        }
    }
}

package com.erp.controller.usercenter;

import com.erp.domain.usercenter.MgtPermission;
import com.erp.domain.usercenter.MgtRole;
import com.erp.service.usercenter.PermissionSettingService;
import com.erp.utils.Result;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("permission")
public class PermissionSettingController {

    @Resource
    private PermissionSettingService permissionSettingService;

    @PostMapping("/register")
    public String register(MgtPermission permission , Model model) {
        Result result = permissionSettingService.registerPermission(permission);
        if (result.getCode().equals("200")) {
            model.addAttribute("result",result);
            return "/usercenter/pmnregister";
        } else {
            // TODO 待完善，返回错误页面
            return null;
        }
    }

    @PostMapping("/conditionlist")
    public String selectListByCondition(MgtPermission permission ,Model model){
        List<MgtPermission> permissions = permissionSettingService.getPermissionByCondition(permission);
        if (StringUtils.isEmpty(permissions)) {
            model.addAttribute("permissions",permissions);
            return "/usercenter/pmnlist";
        } else {
            // TODO 待完善，返回错误页面
            return null;
        }
    }
    @GetMapping("/list")
    public String selectList(@RequestParam(defaultValue = "1") Integer page , @RequestParam(defaultValue = "9") Integer size , Model model){
        List<MgtPermission> permissions = permissionSettingService.getPermissionList(page,size);
        PageInfo<MgtPermission> pageInfo = new PageInfo<MgtPermission>(permissions);
        if (!StringUtils.isEmpty(permissions)) {
            model.addAttribute("pageInfo",pageInfo);
            return "/usercenter/pmnlist";
        } else {
            // TODO 待完善，返回错误页面
            return null;
        }
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable String id , Model model) {
        Result result = permissionSettingService.deletePermissionById(id);
        if (result.getCode().equals("200")) {
            model.addAttribute("result",result);
            return "/usercenter/pmnlist";
        } else {
            // TODO 待完善，返回错误页面
            return null;
        }
    }

    @GetMapping("/getuser/{id}")
    public String getUser(@PathVariable String id, Model model){
        MgtPermission permission = permissionSettingService.getPermissionById(id);
        if (StringUtils.isEmpty(permission)) {
            model.addAttribute("permission",permission);
            return "/usercenter/pmndetail";
        } else {
            // TODO 待完善，返回错误页面
            return null;
        }
    }

    @PostMapping("/updateuser")
    public String updateUser(MgtPermission permission, Model model){
        Result result = permissionSettingService.updatePermission(permission);
        if (result.getCode().equals("200")) {
            model.addAttribute("result",result);
            return "/usercenter/pmnlist";
        } else {
            // TODO 待完善，返回错误页面
            return null;
        }
    }
}

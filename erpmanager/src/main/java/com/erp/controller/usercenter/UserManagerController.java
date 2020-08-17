package com.erp.controller.usercenter;

import com.erp.domain.usercenter.MgtUser;
import com.erp.service.usercenter.UserManagerService;
import com.erp.utils.CookieUtils;
import com.erp.utils.JedisClient;
import com.erp.utils.JsonUtils;
import com.erp.utils.Result;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.annotation.security.RolesAllowed;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/user")
@RolesAllowed({"pmnManager","admin"})
public class UserManagerController {

    @Resource
    private UserManagerService userManagerService;
    @Resource
    private JedisClient jedisClient;

    @GetMapping("/redis")
    @ResponseBody
    public MgtUser getuser(HttpServletRequest request){
        String token = CookieUtils.getCookieValue(request, "token");
        String s = jedisClient.get(token);
        MgtUser user = JsonUtils.jsonToPojo(s, MgtUser.class);
        System.out.println(user);
        return user;
    }

    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        HttpServletRequest request, HttpServletResponse response, Model model) {
        Result result = userManagerService.loginUser(username, password);
        if (result.getCode().equals("200")) {
            CookieUtils.setCookie(request, response, "token", result.getMsg());
            return "main";
        } else {
            // TODO 提示错误
            model.addAttribute("result", result);
            return null;
        }
    }

    @PostMapping("/register")
    public String register(MgtUser mgtUser, Model model, HttpServletRequest request) {
        try {
            Result result = userManagerService.registerUser(mgtUser);
            if (result.getCode().equals("200")) {
                return "/usercenter/register";
            } else {
                // TODO 待完善，返回错误页面
                return null;
            }
        } catch (Exception e) {
            //返回错误页面
            e.printStackTrace();
            return null;
        }
    }

    @PostMapping("/conditionlist")
    public String selectListByCondition(MgtUser mgtUser, Model model) {
        List<MgtUser> mgtUsers = userManagerService.selectListByCondition(mgtUser);
        if (StringUtils.isEmpty(mgtUsers)) {
            model.addAttribute("users", mgtUsers);
            return "/usercenter/userlist";
        } else {
            // TODO 待完善，返回错误页面
            return null;
        }
    }

    @GetMapping("/list")
    public String selectList(@RequestParam(defaultValue = "1") Integer page,
                             @RequestParam(defaultValue = "9") Integer size, Model model) {
        List<MgtUser> mgtUsers = userManagerService.selectList(page, size);
        PageInfo<MgtUser> pageInfo = new PageInfo<MgtUser>(mgtUsers);
        if (!StringUtils.isEmpty(mgtUsers)) {
            model.addAttribute("pageInfo", pageInfo);
            return "/usercenter/userlist";
        } else {
            // TODO 待完善，返回错误页面
            return null;
        }
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable String id, Model model) {
        try {

            Result result = userManagerService.deleteUser(id);
            if (result.getCode().equals("200")) {
                model.addAttribute("result", result);
                return "/usercenter/register";
            } else {
                // TODO 待完善，返回错误页面
                return null;
            }
        } catch (Exception e) {
            //返回错误页面
            e.printStackTrace();
            return null;
        }
    }

    @GetMapping("/getuser/{id}")
    public String getUser(@PathVariable String id, Model model) {
        MgtUser user = userManagerService.getUser(id);
        if (!StringUtils.isEmpty(user)) {
            model.addAttribute("user", user);
            return "/usercenter/adduser";
        } else {
            // TODO 待完善，返回错误页面
            return null;
        }
    }

    @PostMapping("/updateuser")
    public String updateUser(MgtUser mgtUser, Model model) {
        try {
            Result result = userManagerService.updateUser(mgtUser);
            if (result.getCode().equals("200")) {
                model.addAttribute("result", result);
                return "/usercenter/register";
            } else {
                // TODO 待完善，返回错误页面
                return null;
            }
        } catch (Exception e) {
            //返回错误页面
            e.printStackTrace();
            return null;
        }
    }

}

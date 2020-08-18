package com.erp.controller.aftermodule;


import com.erp.domain.aftermodule.AReturnStorage;
import com.erp.domain.usercenter.MgtUser;
import com.erp.service.aftermodule.AReturnStorageService;
import com.erp.utils.CookieUtils;
import com.erp.utils.IDUtil;
import com.erp.utils.JedisClient;
import com.erp.utils.JsonUtils;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
@Controller
@Api(tags="返厂入库管理")
@RequestMapping("/areStorage")
public class AReturnStorageController {

    @Autowired
    private JedisClient jedisClient;

    @Autowired
    private AReturnStorageService service;

    @ApiOperation(value="查询入库申请", httpMethod = "GET")
    @RequestMapping("/findAll")
    public ModelAndView findAll(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size){
        List<AReturnStorage> list = service.findAll(page, size);
        PageInfo pageInfo = new PageInfo(list);
        ModelAndView mv = new ModelAndView();
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("areStorage/areStorage-list");
        return mv;
    }

    @ApiOperation(value="新增入库申请", httpMethod = "GET")
    @RequestMapping("/create")
    public ModelAndView create(HttpServletRequest request, String asalesReExId){
        ModelAndView mv = new ModelAndView();
        //存入登录用户和部门
        String token = CookieUtils.getCookieValue(request, "token");
        String s = jedisClient.get(token);


        System.out.println(11);
        MgtUser user = JsonUtils.jsonToPojo(s, MgtUser.class);
        AReturnStorage aReturnStorage = service.saveAsaleReEx(user, asalesReExId);
        mv.addObject("aReturnStorage",aReturnStorage);
        mv.setViewName("areStorage/areStorage-add");
        return mv;
    }

//    @ApiOperation(value="审核入库申请", httpMethod = "GET")
//    @RequestMapping("/audit")
//    public String audit(AReturnStorage aReturnStorage){
//
//        return mv;
//    }
}

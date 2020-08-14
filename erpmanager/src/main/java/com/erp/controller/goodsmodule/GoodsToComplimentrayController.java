package com.erp.controller.goodsmodule;

import com.erp.domain.goodsmodule.Goods;
import com.erp.domain.goodsmodule.GoodsToComplimentray;
import com.erp.domain.goodsmodule.GoodsType;
import com.erp.service.goodsmodule.GoodsToComplimentrayService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Api
@Controller
@RequestMapping("goodstocompli")
public class GoodsToComplimentrayController {

    @Autowired
    GoodsToComplimentrayService goodsToComplimentrayService;

    @Autowired
    GoodsController goodsController;

    @ApiOperation(value = "查询所有接口", httpMethod = "GET")
    @RequestMapping("/findAll")
    public ModelAndView findAll(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "4") Integer size) {
        List<GoodsToComplimentray> list = goodsToComplimentrayService.findAll(page, size);
        PageInfo pageInfo = new PageInfo(list);
        ModelAndView mv = new ModelAndView();
        mv.addObject("pageInfo", pageInfo);
        mv.setViewName("goods/goodstocompli-list");
        return mv;
    }

    @ApiOperation(value = "添加", httpMethod = "POST")
    @RequestMapping("/insert")
    public String insert(GoodsToComplimentray goodsToComplimentray, HttpServletRequest request) {
        //补充用户信息需要做
        goodsToComplimentray.setApplicant("tom");
        //补充领导信息
        goodsToComplimentray.setApplicant("tomboss");
        //补充申请时间
        goodsToComplimentray.setApprovalTime(new Date());
        goodsToComplimentray.setApprovalStatus("未审核");
        Integer result = goodsToComplimentrayService.insert(goodsToComplimentray);
        return "redirect: findAll";
    }

    @ApiOperation(value = "id查找", httpMethod = "GET")
    @RequestMapping("/findById")
    public ModelAndView findById(Integer id) {
        GoodsToComplimentray goodsToComplimentray = goodsToComplimentrayService.findById(id);

        ModelAndView mv = new ModelAndView();
        return mv;
    }


    @ApiOperation(value = "审核不通过修改", httpMethod = "POST")
    @RequestMapping("/update")
    public String update(GoodsToComplimentray goodsToComplimentray) {
        Integer result = goodsToComplimentrayService.update(goodsToComplimentray);
        return "redirect: findAll";
    }






}

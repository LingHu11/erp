package com.erp.controller.goodsmodule;


import com.erp.domain.goodsmodule.TbGoods;
import com.erp.service.goodsmodule.GoodsServcie;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping("/goods")
@Api
public class GoodsController {

    @Autowired
    GoodsServcie  goodsServcie;
    @ApiOperation(value = "测试接口", httpMethod = "GET")
    @RequestMapping("/")
    @ResponseBody
    public String test(){
        return "index";
    }

    @ApiOperation(value = "查询所有商品接口",httpMethod = "GET")
    @RequestMapping("/findAll")
    @ResponseBody
    public ModelAndView findAll(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "4") Integer size){

        List<TbGoods> list = goodsServcie.findAll(page,size);
        PageInfo pageInfo = new PageInfo(list);
        ModelAndView mv = new ModelAndView();
        mv.addObject("pageInfo", pageInfo);
        mv.setViewName("goods/goods-list");
        return mv;
    }

}

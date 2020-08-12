package com.erp.controller.goodsmodule;


import com.erp.domain.goodsmodule.Goods;
import com.erp.service.goodsmodule.GoodsServcie;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("/goods")
@Api
public class GoodsController {

    @Autowired
    GoodsServcie goodsServcie;
    @ApiOperation(value = "测试接口", httpMethod = "GET")
    @RequestMapping("/")
    @ResponseBody
    public String test(){
        return "index";
    }
    @ApiOperation(value = "查询接口",httpMethod = "GET")
    @RequestMapping("/findAll")
    @ResponseBody
    public List<Goods> findAll(){
        List<Goods> list = goodsServcie.findAll();
        return list;
    }

}

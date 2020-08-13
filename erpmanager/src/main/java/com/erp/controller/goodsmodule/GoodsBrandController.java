package com.erp.controller.goodsmodule;

import com.erp.domain.goodsmodule.GoodsBrand;
import com.erp.service.goodsmodule.GoodsBrandServcie;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/goodsBrand")
@Api
public class GoodsBrandController {
    @Autowired
    GoodsBrandServcie goodsBrandServcie;

    @ApiOperation(value = "查询所有商品品牌接口",httpMethod = "GET")
    @RequestMapping("/findAll")
    @ResponseBody
    public List<GoodsBrand> findAll(){
        List<GoodsBrand> list = goodsBrandServcie.findAll();
        return list;
    }

}

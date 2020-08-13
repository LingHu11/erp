package com.erp.controller.goodsmodule;

import com.erp.domain.goodsmodule.GoodsBrand;
import com.erp.domain.goodsmodule.GoodsType;
import com.erp.service.goodsmodule.GoodsBrandServcie;
import com.erp.service.goodsmodule.GoodsTypeServcie;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/goodsType")
@Api
public class GoodsTypeController {

    @Autowired
    GoodsTypeServcie goodsTypeServcie;

    @ApiOperation(value = "查询父类",httpMethod = "GET")
    @RequestMapping("/findAllParent")
    @ResponseBody
    public List<GoodsType> findAllParent(){
        List<GoodsType> list = goodsTypeServcie.findAllParent();
        return list;
    }
    @ApiOperation(value = "查询子类",httpMethod = "GET")
    @RequestMapping("/findAllSon")
    @ResponseBody
    public List<GoodsType> findAllSon(Integer parentId){
        List<GoodsType> list = goodsTypeServcie.findAllSon(parentId);
        return list;
    }





}

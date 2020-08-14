package com.erp.controller.goodsmodule;


import com.erp.domain.goodsmodule.Goods;
import com.erp.domain.goodsmodule.GoodsType;
import com.erp.service.goodsmodule.GoodsServcie;
import com.erp.service.goodsmodule.GoodsTypeServcie;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
@RequestMapping("/goods")
@Api
public class GoodsController {

    @Autowired
    GoodsServcie  goodsServcie;
    @Autowired
    GoodsTypeServcie goodsTypeServcie;

    @ApiOperation(value = "测试接口", httpMethod = "GET")
    @RequestMapping("/test")
    public String test(){
        return "main";
    }

    @ApiOperation(value = "查询所有商品接口",httpMethod = "GET")
    @RequestMapping("/findAll")
    public ModelAndView findAll(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "4") Integer size){
        List<Goods> list = goodsServcie.findAll(page,size);
        PageInfo pageInfo = new PageInfo(list);
        ModelAndView mv = new ModelAndView();
        mv.addObject("pageInfo", pageInfo);
        mv.setViewName("goods/goods-list");
        return mv;
    }

    @ApiOperation(value = "条件查询",httpMethod = "GET")
    @RequestMapping("/findBySelf")
    public ModelAndView findBySelf(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "4") Integer size,Goods good){
        List<Goods> list = goodsServcie.findAll(page,size,good);
        PageInfo pageInfo = new PageInfo(list);
        ModelAndView mv = new ModelAndView();
        mv.addObject("pageInfo", pageInfo);
        mv.setViewName("goods/goods-list");
        return mv;
    }

    @ApiOperation(value = "添加",httpMethod = "POST")
    @RequestMapping("/insert")
    public String insert(Goods good){//
       Integer result = goodsServcie.insert(good);
        return "redirect: findAll";
    }

    @ApiOperation(value = "id查找",httpMethod = "GET")
    @RequestMapping("/findById")
    public ModelAndView findById(Integer id){
        Goods goods = goodsServcie.findById(id);
        //获取二级分类名
        String categoryName = goods.getCategoryName();
        //通过二级分类名获取一级分类信息
        GoodsType goodsType = goodsTypeServcie.getCategoryParentName(categoryName);
        ModelAndView mv = new ModelAndView();
        mv.addObject("goodsType",goodsType);
        mv.addObject("goods", goods);
        mv.setViewName("goods/goods-update");
        return mv;
    }

    @ApiOperation(value = "修改",httpMethod = "POST")
    @RequestMapping("/update")
    public String update(Goods good){
        Integer result = goodsServcie.update(good);
        return "redirect: findAll";
    }



    @ApiOperation(value = "id查找用户转化",httpMethod = "GET")
    @RequestMapping("/findByIdForConvert")
    public ModelAndView findByIdForConvert(Integer id){
        Goods goods = goodsServcie.findById(id);
        //获取二级分类名
        String categoryName = goods.getCategoryName();
        //通过二级分类名获取一级分类信息
        GoodsType goodsType = goodsTypeServcie.getCategoryParentName(categoryName);
        ModelAndView mv = new ModelAndView();
        mv.addObject("goodsType",goodsType);
        mv.addObject("goods", goods);
        mv.setViewName("goods/goodstocompli-add");
        return mv;
    }









}

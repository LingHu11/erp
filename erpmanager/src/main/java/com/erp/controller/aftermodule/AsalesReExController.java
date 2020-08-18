package com.erp.controller.aftermodule;


import com.erp.domain.aftermodule.AsalesReEx;
import com.erp.domain.aftermodule.AsalesReExExample;
import com.erp.domain.goodsmodule.Goods;
import com.erp.service.aftermodule.AsalesReExService;
import com.erp.utils.IDUtil;
import com.erp.utils.Result;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;


@Controller
@Api(tags="退换商品")
@RequestMapping("/asalesReEx")
public class AsalesReExController {

    @Autowired
    private AsalesReExService service;

    @ApiOperation(value="查询所有退换货申请单接口", httpMethod = "GET")
    @RequestMapping("/findAll")
    public ModelAndView findAll(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size){
        List<AsalesReEx>  list= service.findAll(page, size);
        PageInfo pageInfo = new PageInfo(list);
        ModelAndView mv = new ModelAndView();
        mv.addObject("pageInfo", pageInfo);
        mv.setViewName("asalesReEx/asalesReEx-list");
        return mv;
    }

    @ApiOperation(value = "多条件查询接口",httpMethod = "GET")
    @RequestMapping("/findBySelf")
    public ModelAndView findBySelf(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size,
                                   AsalesReEx asalesReEx,@RequestParam(value = "gmtCreate2") Date gmtCreate2,@RequestParam(value = "gmtAudit2") Date gmtAudit2){
        List<AsalesReEx> list = service.findBySelf(page, size, asalesReEx,gmtCreate2,gmtAudit2);
        PageInfo pageInfo = new PageInfo(list);
        ModelAndView mv = new ModelAndView();
        mv.addObject("pageInfo", pageInfo);
        mv.setViewName("goods/goods-list");
        return mv;
    }

    @ApiOperation(value = "新增退换货申请单接口",httpMethod = "post")
    @RequestMapping("/save")
    public String save(AsalesReEx asalesReEx){
        //TODO 保存申请者信息
        Integer result = service.save(asalesReEx);
        return "redirect: asalesReEx/findAll";
    }


    @ApiOperation(value = "批量删除退换货申请的接口",httpMethod = "post")
    @RequestMapping("/deletes")
    @ResponseBody
    public Result deleteByBatch(String[] ids) {
        return service.deleteByBatch(ids);
    }

    @ApiOperation(value = "查看单个申请单详情的接口",httpMethod = "post")
    @RequestMapping("/findById")
    public ModelAndView findById(String id) {
        AsalesReEx asalesReEx = service.findById(id);
        ModelAndView mv = new ModelAndView();
        mv.addObject("asalesReEx", asalesReEx);
        mv.setViewName("asalesReEx/asalesReEx-info");
        return mv;
    }

    @ApiOperation(value = "修改退换货申请单接口",httpMethod = "post")
    @RequestMapping("/update")
    public String update(AsalesReEx asalesReEx){
        service.update(asalesReEx);
        return "redirect: asalesReEx/findAll";
    }

    @ApiOperation(value = "进入退换货申请单接口",httpMethod = "post")
    @RequestMapping("/auditById")
    public ModelAndView auditById(String id){
        AsalesReEx asalesReEx = service.findById(id);
        ModelAndView mv = new ModelAndView();
        mv.addObject("asalesReEx", asalesReEx);
        mv.setViewName("asalesReEx/audit-info");
        return mv;
    }

    @ApiOperation(value = "审核退换货申请单接口",httpMethod = "post")
    @RequestMapping("/auditSave")
    public String auditSave(AsalesReEx asalesReEx){
        //TODO 保存审核者的信息
        service.update(asalesReEx);
        return "redirect: asalesReEx/findAll";
    }


}

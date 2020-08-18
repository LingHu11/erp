package com.erp.controller.aftermodule;

import com.erp.domain.aftermodule.AppealManagement;
import com.erp.service.aftermodule.AppealService;
import com.erp.utils.Result;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@Api(tags="申诉管理")
@RequestMapping("/appeal")
public class AppealController {
    @Autowired
    private AppealService appealService;

    @ApiOperation(value="查询所有申诉", httpMethod = "GET")
    @RequestMapping("/findAll")
    public ModelAndView findAll(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "4") Integer size){
        List<AppealManagement> appealList = appealService.findAll(page, size);
        PageInfo pageInfo = new PageInfo(appealList);
        ModelAndView mv = new ModelAndView();
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("appeal/appeal-list");
        return mv;
    }

    @ApiOperation(value="查询单个申诉详情", httpMethod = "GET")
    @GetMapping("/findById/{id}")
    public ModelAndView findById(@PathVariable String id){
        AppealManagement appeal = appealService.findById(id);
        ModelAndView mv = new ModelAndView();
        mv.addObject("appeal",appeal);
        mv.setViewName("appeal/appeal-info");
        return mv;
    }

    @ApiOperation(value="保存单个申诉", httpMethod = "POST")
    @PostMapping("/save")
    public String save(@RequestBody AppealManagement appeal){
        appealService.save(appeal);
        return "redirect: appeal/findAll";
    }

    @ApiOperation(value="删除单个申诉", httpMethod = "DELETE")
    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public Result delete(@PathVariable String id){
        Result result = appealService.deleteById(id);
        return result;
    }

    @ApiOperation(value="多条件查询", httpMethod = "POST")
    @PostMapping("/findBySelf")
    public ModelAndView findBySelf(AppealManagement appeal,@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "4") Integer size){
        List<AppealManagement> appealList = appealService.findBySelf(appeal,page, size);
        PageInfo pageInfo = new PageInfo(appealList);
        ModelAndView mv = new ModelAndView();
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("appeal/appeal-list");
        return mv;
    }

    @ApiOperation(value="跳转新增退换申请的接口", httpMethod = "GET")
    @GetMapping("/findByAppealId/{id}")
    public ModelAndView findByAppealId(@PathVariable String id){
        AppealManagement appeal = appealService.findById(id);
        ModelAndView mv = new ModelAndView();
        mv.addObject("appeal",appeal);
        mv.setViewName("asalesReEx/asalesReEx-add");
        return mv;
    }


}

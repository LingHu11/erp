package com.erp.controller.goodsmodule;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.erp.controller.usercenter.UserManagerController;
import com.erp.domain.goodsmodule.GoodsToComplimentray;
import com.erp.domain.usercenter.MgtUser;
import com.erp.mapper.goodsmodule.GoodsToComplimentrayMapper;
import com.erp.mapper.usercenter.MgtUserMapper;
import com.erp.service.goodsmodule.GoodsToComplimentrayService;
import com.erp.utils.CookieUtils;
import com.erp.utils.JedisClient;
import com.erp.utils.JsonUtils;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Api
@Controller
@RequestMapping("goodstocompli")
public class GoodsToComplimentrayController {

    @Autowired
    GoodsToComplimentrayService goodsToComplimentrayService;

    @ApiOperation(value = "查询所有接口", httpMethod = "GET")
    @RequestMapping("/findAll")
    public ModelAndView findAll(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "4") Integer size,HttpServletRequest request) {
        List<GoodsToComplimentray> list = goodsToComplimentrayService.findAll(page, size,request);
        PageInfo pageInfo = new PageInfo(list);
        ModelAndView mv = new ModelAndView();
        mv.addObject("pageInfo", pageInfo);
        mv.setViewName("goods/goodstocompli-list");
        return mv;
    }

    @ApiOperation(value = "添加", httpMethod = "POST")
    @RequestMapping("/insert")
    public String insert(GoodsToComplimentray goodsToComplimentray, HttpServletRequest request) {

        Integer result = goodsToComplimentrayService.insert(goodsToComplimentray,request);
        return "redirect: findAll";
    }

    @ApiOperation(value = "id查找用于审核跟踪", httpMethod = "GET")
    @RequestMapping("/findById")
    public ModelAndView findById(Integer id,String whichpage) {
        //whichpage为0就是详情页面  非0为保存页面
        GoodsToComplimentray goodsToComplimentray = goodsToComplimentrayService.findById(id);
        ModelAndView mv = new ModelAndView();
        mv.addObject("goods", goodsToComplimentray);
        mv.addObject("whichpage",whichpage);
        mv.setViewName("goods/goodstocompli-update-detial");
        return mv;
    }
//未通过和未审核的修改
    @ApiOperation(value = "未审核、不通过修改", httpMethod = "POST")
    @RequestMapping(path = "/update",method = {RequestMethod.POST})
    public String update(GoodsToComplimentray goodsToComplimentray) {
        //根据
        Integer result = goodsToComplimentrayService.update(goodsToComplimentray);
        return "redirect: findAll";
    }
    //测试excel导出======================================================================
    @Autowired
    GoodsToComplimentrayMapper goodsToComplimentrayMapper;

    @RequestMapping(value = "/exportExcel")
    @ResponseBody
    public void exportExcel(HttpServletResponse response) throws IOException {
        List<GoodsToComplimentray> list = goodsToComplimentrayMapper.selectByExample(null);
        ServletOutputStream out = response.getOutputStream();
        ExcelWriter writer = new ExcelWriter(out, ExcelTypeEnum.XLSX, true);
        String fileName = "商品转赠品申请记录";
        Sheet sheet = new Sheet(1, 0, GoodsToComplimentray.class);
        //设置自适应宽度
        sheet.setAutoWidth(Boolean.TRUE);
        // 第一个 sheet 名称
        sheet.setSheetName("申请表");
        writer.write(list, sheet);
        //通知浏览器以附件的形式下载处理，设置返回头要注意文件名有中文
        response.setHeader("Content-disposition", "attachment;filename=" + new String(fileName.getBytes("gb2312"), "ISO8859-1") + ".xlsx");
        writer.finish();
        response.setContentType("multipart/form-data");
        response.setCharacterEncoding("utf-8");
        out.flush();
        out.close();
    }
 //======================================================================================接下来是领导的访问权限

    @ApiOperation(value = "查询所有接口", httpMethod = "GET")
    @RequestMapping("/findAllForBoss")
    public ModelAndView findAll(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "4") Integer size,@RequestParam(defaultValue = "1") String choice) {
        List<GoodsToComplimentray> list = goodsToComplimentrayService.findAll(page, size,choice);
        PageInfo pageInfo = new PageInfo(list);
        ModelAndView mv = new ModelAndView();
        mv.addObject("pageInfo", pageInfo);
        mv.addObject("choice",choice);
        mv.setViewName("goods/goodstocompli-list-check");
        return mv;
    }
    @ApiOperation(value = "id查找用于审核跟踪", httpMethod = "GET")
    @RequestMapping("/findByIdForBoss")
    public ModelAndView findByIdForBoss(Integer id,String whichpage) {
        //whichpage为0就是详情页面  非0为保存页面
        GoodsToComplimentray goodsToComplimentray = goodsToComplimentrayService.findById(id);
        ModelAndView mv = new ModelAndView();
        mv.addObject("goods", goodsToComplimentray);
        mv.addObject("whichpage",whichpage);
        mv.setViewName("goods/goodstocompli-check");
        return mv;
    }
    //未通过和未审核的修改
    @ApiOperation(value = "审核", httpMethod = "POST")
    @RequestMapping(path = "/updateForBoss",method = {RequestMethod.POST})
    public String updateForBoss(GoodsToComplimentray goodsToComplimentray) {
        //根据
        Integer result = goodsToComplimentrayService.updateForBoss(goodsToComplimentray);
        return "redirect: findAllForBoss";
    }
}

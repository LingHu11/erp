package com.erp.controller.aftermodule;


import com.erp.domain.aftermodule.Aexchange;
import com.erp.service.aftermodule.AexchangeService;
import com.erp.service.aftermodule.GoodsImeiService;
import com.erp.service.goodsmodule.GoodsServcie;
import com.erp.utils.IDUtil;
import com.erp.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags="退换商品")
@RequestMapping("/aexchange")
public class AexchangeController {

    @Autowired
    private AexchangeService aexchangeService;

    @ApiOperation(value="保存", httpMethod = "GET")
    @RequestMapping("/save")
    @ResponseBody
    public Result save(Aexchange aexchange){
        String aexchangeId = aexchange.getId();
        //如果aexchangeId在aexchane表中不存在，就新增保存
        if(aexchangeService.findByAllId(aexchangeId) == null){
            Result save = aexchangeService.save(aexchange);
            return save;
        }else{
            //如果aexchangeId在aexchane表中存在，就修改
            aexchange.setIsDeleted(0);
            Result update = aexchangeService.update(aexchange);
            return update;
        }
    }

    @ApiOperation(value="删除", httpMethod = "DELETE")
    @RequestMapping("/delete")
    public void delete(String aexchangeId){
        aexchangeService.deleteById(aexchangeId);
    }


}

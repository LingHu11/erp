package com.erp.controller.aftermodule;


import com.erp.domain.aftermodule.Aexchange;
import com.erp.domain.aftermodule.vo.GoodsVo;
import com.erp.domain.goodsmodule.Goods;
import com.erp.service.aftermodule.GoodsVoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags="新商品")
@RequestMapping("/goodsVo")
public class GoodsVoController {

    @Autowired
    private GoodsVoService goodsVoService;

    @ApiOperation(value="多条件查询商品串码信息", httpMethod = "POST")
    @RequestMapping("/select")
    @ResponseBody
    public List<GoodsVo> select(Goods goods){
       return goodsVoService.selectGoods(goods);
    }

}

package com.erp.service.aftermodule.impl;

import com.erp.domain.aftermodule.Aexchange;
import com.erp.domain.aftermodule.GoodsImei;
import com.erp.domain.goodsmodule.Goods;
import com.erp.mapper.aftermodule.AexchangeMapper;
import com.erp.mapper.aftermodule.GoodsImeiMapper;
import com.erp.mapper.goodsmodule.GoodsMapper;
import com.erp.service.aftermodule.AexchangeService;
import com.erp.utils.IDUtil;
import com.erp.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class AexchangeServiceImpl implements AexchangeService {

    @Autowired
    private AexchangeMapper mapper;

    @Autowired
    private GoodsImeiMapper goodsImeiMapper;

    @Autowired
    private  GoodsMapper goodsMapper;

    //查询非删除状态的Aexchange
    @Override
    public Aexchange findById(String id) {
        return mapper.selectById(id);
    }

    //查询所有状态下的Aexchange
    @Override
    public Aexchange findByAllId(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public Result save(Aexchange aexchange) {
        aexchange.setId(IDUtil.getItemId());
        int insert = mapper.insert(aexchange);
        // goods_imei表中删除goods_imei让该串码以后不可选，同时减少goods库存number
        goodsImeiMapper.delete(aexchange.getGoodsImei());
        int goodsId = Integer.parseInt(aexchange.getGoodsId());
        Goods goods = goodsMapper.selectByPrimaryKey(goodsId);
        Integer numberGoods = Integer.parseInt(goods.getNumber());
        goods.setNumber(Integer.toString(numberGoods-1));
        goodsMapper.reduceById(goods);
        if (insert>0){
            return new Result("200","保存成功");
        }else {
            return new Result("201","保存失败");
        }
    }

    @Override
    public void deleteById(String id) {
        //如果换货变退货，aexchange为删除状态，解绑商品串码，商品数量增加1
        mapper.delete(id);
        // goods_imei表中解绑goods_imei让该串码可选，
        mapper.selectByPrimaryKey(id);
        String imei = mapper.selectByPrimaryKey(id).getGoodsImei();
        GoodsImei goodsImei = goodsImeiMapper.selectByPrimaryKey(imei);
        goodsImei.setIsDeleted(1);
        goodsImeiMapper.updateByPrimaryKey(goodsImei);
        //同时恢复goods库存number
        String goodsId1 = goodsImei.getGoodsId();
        int goodsId = Integer.parseInt(goodsId1);
        Goods goods = goodsMapper.selectByPrimaryKey(goodsId);
        Integer numberGoods = Integer.parseInt(goods.getNumber());
        goods.setNumber(Integer.toString(numberGoods+1));
        goodsMapper.reduceById(goods);
    }

    @Override
    public Result deleteByBatch(String[] ids) {
        int sum = 0;
        for (int i = 0; i <ids.length ; i++) {
            int delete = mapper.delete(ids[i]);
            sum = sum +delete;
        }
        if (sum == ids.length){
            return new Result("200","删除成功");
        }else {
            return new Result("201","删除失败");
        }
    }

    @Override
    public Result update(Aexchange aexchange) {
        //如果修改原更换商品：三星换华为，aexchange为不删除状态，解绑三星商品串码，三星商品数量增加

        // 绑定华为串码，数量减少


        int update = mapper.updateByPrimaryKeySelective(aexchange);
        if (update>0){
            return new Result("200","保存成功");
        }else {
            return new Result("201","保存失败");
        }
    }
}

package com.erp.service.goodsmodule.impl;

import com.erp.domain.goodsmodule.Goods;
import com.erp.domain.goodsmodule.GoodsExample;
import com.erp.mapper.goodsmodule.GoodsBrandMapper;
import com.erp.mapper.goodsmodule.GoodsMapper;
import com.erp.mapper.goodsmodule.GoodsTypeMapper;
import com.erp.service.goodsmodule.GoodsServcie;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class GoodsServcieImpl implements GoodsServcie {

    @Autowired
    GoodsMapper goodsMapper;

    @Autowired
    GoodsBrandMapper goodsBrandMapper;

    @Autowired
    GoodsTypeMapper goodsTypeMapper;

    @Override
    public List<Goods> findAll(Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<Goods> list = goodsMapper.selectByExample(null);
        return list;
    }
    @Override
    public List<Goods> findAll(Integer page, Integer size,Goods good) {
        PageHelper.startPage(page, size);
        GoodsExample goodsExample = new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        if (!good.getName().equals("")){
            criteria.andNameEqualTo(good.getName());
        }
        if (!good.getModel().equals("")){
            criteria.andModelEqualTo(good.getModel());
        }
        if (!good.getBrandName().equals("-1")){
            criteria.andBrandNameEqualTo(good.getBrandName());
        }
        if(!good.getCategoryName().equals("-1")){
            criteria.andCategoryNameEqualTo(good.getCategoryName());
        }
        List<Goods> list = goodsMapper.selectByExample(goodsExample);
        return list;
    }

    @Override
    public Integer insert(Goods good) {
        goodsMapper.insert(good);
        return null;
    }

    @Override
    public Goods findById(Integer id) {
        Goods goods = goodsMapper.selectByPrimaryKey(id);
        return goods;
    }

    @Override
    public Integer update(Goods good) {
        int i = goodsMapper.updateByPrimaryKey(good);
        return i;
    }


    /**
     * @param id 商品ID
     * @param number 减少的数量
     */
    public void reduceById(Integer id,Integer number){
        Goods goods = new Goods();
        goods.setId(id);
        String numberGoods = Integer.toString(Integer.parseInt(goods.getNumber()) - number);
        goods.setNumber(numberGoods);
        goodsMapper.reduceById(goods);
    }
}

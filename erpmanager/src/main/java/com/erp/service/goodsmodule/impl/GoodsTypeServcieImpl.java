package com.erp.service.goodsmodule.impl;

import com.erp.domain.goodsmodule.GoodsBrand;
import com.erp.domain.goodsmodule.GoodsType;
import com.erp.domain.goodsmodule.GoodsTypeExample;
import com.erp.mapper.goodsmodule.GoodsBrandMapper;
import com.erp.mapper.goodsmodule.GoodsTypeMapper;
import com.erp.service.goodsmodule.GoodsServcie;
import com.erp.service.goodsmodule.GoodsTypeServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GoodsTypeServcieImpl implements GoodsTypeServcie {
    @Autowired
    GoodsTypeMapper goodsTypeMapper;

    @Override
    public List<GoodsType> findAllParent() {

        GoodsTypeExample goodsTypeExample = new GoodsTypeExample();

        GoodsTypeExample.Criteria criteria = goodsTypeExample.createCriteria();
        criteria.andIsParentEqualTo(0);
        List<GoodsType> list = goodsTypeMapper.selectByExample(goodsTypeExample);
        return list;
    }
    @Override
    public List<GoodsType> findAllSon(Integer parentId) {
        GoodsTypeExample goodsTypeExample = new GoodsTypeExample();
        GoodsTypeExample.Criteria criteria = goodsTypeExample.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        List<GoodsType> list = goodsTypeMapper.selectByExample(goodsTypeExample);
        return list;
    }

    @Override
    public GoodsType getCategoryParentName(String categoryName) {
        GoodsTypeExample goodsTypeExample = new GoodsTypeExample();
        GoodsTypeExample.Criteria criteria = goodsTypeExample.createCriteria();
        //通过二级分类名查询二级完整信息
        criteria.andCategoryNameEqualTo(categoryName);
        //得到查询结果
        List<GoodsType> goodsTypes = goodsTypeMapper.selectByExample(goodsTypeExample);
        //获取父类信息
        GoodsType goodsType = goodsTypeMapper.selectByPrimaryKey(goodsTypes.get(0).getParentId());
        return goodsType;
    }
}

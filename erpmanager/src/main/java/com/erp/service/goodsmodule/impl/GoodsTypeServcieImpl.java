package com.erp.service.goodsmodule.impl;

import com.erp.domain.goodsmodule.GoodsBrand;
import com.erp.domain.goodsmodule.GoodsType;
import com.erp.domain.goodsmodule.GoodsTypeExample;
import com.erp.mapper.goodsmodule.GoodsBrandMapper;
import com.erp.mapper.goodsmodule.GoodsTypeMapper;
import com.erp.service.goodsmodule.GoodsServcie;
import com.erp.service.goodsmodule.GoodsTypeServcie;
import com.erp.utils.JedisClient;
import com.erp.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GoodsTypeServcieImpl implements GoodsTypeServcie {
    @Autowired
    GoodsTypeMapper goodsTypeMapper;
    @Autowired
    JedisClient jedisClient;

    @Value("${GOODS_PARENT_TYPE}")
    String goodsParentType;

    @Override
    public List<GoodsType> findAllParent() {
        List<GoodsType> list = null;
//   通过key值去jedis中去取父类列表
        String parentTypeList = jedisClient.get(goodsParentType);
        if (parentTypeList == null) {
            GoodsTypeExample goodsTypeExample = new GoodsTypeExample();
            GoodsTypeExample.Criteria criteria = goodsTypeExample.createCriteria();
            criteria.andIsParentEqualTo(0);
            list = goodsTypeMapper.selectByExample(goodsTypeExample);
            jedisClient.set(goodsParentType, JsonUtils.objectToJson(list));
        } else {
            list = JsonUtils.jsonToList(parentTypeList, GoodsType.class);
        }
        return list;
    }

    @Override
    public List<GoodsType> findAllSon(Integer parentId) {
        List<GoodsType> list = null;
        GoodsTypeExample goodsTypeExample = new GoodsTypeExample();
        GoodsTypeExample.Criteria criteria = goodsTypeExample.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        list = goodsTypeMapper.selectByExample(goodsTypeExample);
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

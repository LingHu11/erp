package com.erp.service.aftermodule.impl;

import com.erp.domain.aftermodule.*;
import com.erp.domain.goodsmodule.Goods;
import com.erp.mapper.aftermodule.AsalesReExMapper;
import com.erp.mapper.aftermodule.GoodsImeiMapper;
import com.erp.mapper.goodsmodule.GoodsMapper;
import com.erp.service.aftermodule.AsalesReExService;
import com.erp.utils.IDUtil;
import com.erp.utils.Result;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class AsalesReExServiceImpl implements AsalesReExService {
    @Autowired
    private AsalesReExMapper asalesReExMapper;

    @Autowired
    private GoodsImeiMapper goodsImeiMapper;

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public List<AsalesReEx> findAll(Integer page, Integer size) {
        PageHelper.startPage(page, size);
        AsalesReExExample asalesReExExample = new AsalesReExExample();
        //Criteria为一个以and连接的条件集
        AsalesReExExample.Criteria criteria = asalesReExExample.createCriteria();
        criteria.andIsDeletedEqualTo(0);
        List<AsalesReEx> asalesReExList = asalesReExMapper.selectByExample(asalesReExExample);
        return asalesReExList;
    }

    //多条件查询
    @Override
    public List<AsalesReEx> findBySelf(Integer page, Integer size, AsalesReEx asalesReEx, Date gmtCreate2,Date gmtAudit2) {
        PageHelper.startPage(page, size);
        AsalesReExExample asalesReExExample = new AsalesReExExample();
        //Criteria为一个以and连接的条件集
        AsalesReExExample.Criteria criteria = asalesReExExample.createCriteria();
        //精确查询订单ID
        criteria.andOrderIdEqualTo(asalesReEx.getOrderId());
        //模糊查询制单人
        criteria.andMakerLike('%'+asalesReEx.getMaker()+'%');
        //模糊查询制单人
        criteria.andAuditorLike('%'+asalesReEx.getAuditor()+'%');
        //精确查询单据状态
        criteria.andDocStatusEqualTo(asalesReEx.getDocStatus());
        //查询制单时间范围
        criteria.andGmtAuditBetween(asalesReEx.getGmtCreate(),gmtCreate2);
        //查询审核时间范围
        criteria.andGmtAuditBetween(asalesReEx.getGmtAudit(),gmtAudit2);
        //查询非删除状态的退换货申请单
        criteria.andIsDeletedEqualTo(0);
        List<AsalesReEx> list = asalesReExMapper.selectByExample(asalesReExExample);
        return list;
    }

    @Override
    public Integer save(AsalesReEx asalesReEx) {
        //TODO 用ID组件自动生成唯一ID
        asalesReEx.setAppealId(IDUtil.getItemId());
        int i = asalesReExMapper.insert(asalesReEx);
        return i;
    }

    @Override
    public Integer deleteById(String id) {
        //判断退还货单是否是初始状态，已进入审核不能删除
//        String auditStatus = asalesReExMapper.selectByPrimaryKey(id).getAuditStatus();
//        if (!auditStatus.equalsIgnoreCase("Init")){
//            return new Result("202","已进入审核状态不能删除");
//        }
        //修改删除状态
//        AsalesReEx asalesReEx = new AsalesReEx();
//        asalesReEx.setIsDeleted(0);
//        asalesReEx.setId(id);
//        int i = asalesReExMapper.updateByPrimaryKeySelective(asalesReEx);
        int delete = asalesReExMapper.delete(id);
//        if (delete>0){
//            return new Result("200","删除成功");
//        }else {
//            return new Result("201","删除失败");
//        }
        return delete;
    }

    @Override
    public Result deleteByBatch(String[] ids) {
        int sum = 0;
        for (int i = 0; i < ids.length; i++) {
            Integer count = deleteById(ids[i]);
            sum = sum + count;
        }
        if (sum == ids.length){
            return new Result("200","删除成功");
        }else {
            return new Result("201","删除失败");
        }
    }

    @Override
    public AsalesReEx findById(String id) {
        return asalesReExMapper.selectByPrimaryKey(id);
    }

    @Override
    public AsalesReEx selectByImei(String goodsImei) {
        return asalesReExMapper.selectByImei(goodsImei);
    }

    @Override
    public Result update(AsalesReEx asalesReEx) {
        int i = asalesReExMapper.updateByPrimaryKeySelective(asalesReEx);
        if (i>0){
            return new Result("200","修改成功");
        }else {
            return new Result("201","修改失败");
        }
    }

    @Override
    public Result updateAudit(AsalesReEx asalesReEx,Aexchange aexchange) {
        //如果审核不通过，aexchange为不删除状态，解绑商品串码，商品数量增加
        if (!asalesReEx.getAuditStatus().equalsIgnoreCase("Yes")){
            asalesReExMapper.delete(asalesReEx.getId());
            // goods_imei表中解绑goods_imei让该串码可选，
            GoodsImei goodsImei = goodsImeiMapper.selectByPrimaryKey(aexchange.getGoodsImei());
            goodsImei.setIsDeleted(1);
            goodsImeiMapper.updateByPrimaryKey(goodsImei);
            //同时恢复goods库存number
            int goodsId = Integer.parseInt(aexchange.getGoodsId());
            Goods goods = goodsMapper.selectByPrimaryKey(goodsId);
            Integer numberGoods = Integer.parseInt(goods.getNumber());
            goods.setNumber(Integer.toString(numberGoods+1));
            goodsMapper.reduceById(goods);
        }
        int i = asalesReExMapper.updateByPrimaryKeySelective(asalesReEx);
        if (i>0){
            return new Result("200","修改成功");
        }else {
            return new Result("201","修改失败");
        }
    }


}

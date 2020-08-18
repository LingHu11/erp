package com.erp.service.aftermodule.impl;

import com.erp.domain.aftermodule.*;
import com.erp.domain.usercenter.MgtUser;
import com.erp.mapper.aftermodule.AReturnStorageMapper;
import com.erp.mapper.aftermodule.AsalesReExMapper;
import com.erp.mapper.usercenter.MgtDepartmentMapper;
import com.erp.service.aftermodule.AReturnStorageService;
import com.erp.utils.IDUtil;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AReturnStorageServiceImpl implements AReturnStorageService {
    @Autowired
    private MgtDepartmentMapper mgtDepartmentMapper;

    @Autowired
    private AsalesReExMapper asalesReExMapper;

    @Autowired
    private AReturnStorageMapper aReturnStorageMapper;

    @Override
    public AReturnStorage saveAsaleReEx(MgtUser user, String asalesReExId) {

        AReturnStorage aReturnStorage = new AReturnStorage();
        //存入登录用户和部门
        aReturnStorage.setMaker(user.getRealName());
        aReturnStorage.setDepartment(mgtDepartmentMapper.depById(user.getDepartId()));
        aReturnStorage.setId("FC"+ IDUtil.getItemId());
        aReturnStorage.setGmtCreate(new Date());
        //存入返厂商品信息
        AsalesReEx asalesReEx = asalesReExMapper.selectByPrimaryKey(asalesReExId);
        aReturnStorage.setGoodsId(asalesReEx.getGoodsId());
        aReturnStorage.setGoodsBrand(asalesReEx.getGoodsBrand());
        aReturnStorage.setGoodsImei(asalesReEx.getGoodsType());
        aReturnStorage.setGoodsType(asalesReEx.getGoodsType());
        aReturnStorage.setConfiguration(asalesReEx.getComponentExchange());
        aReturnStorage.setReason(asalesReEx.getReasonReturn());

        return aReturnStorage;

    }

    @Override
    public List<AReturnStorage> findAll(Integer page, Integer size) {
        PageHelper.startPage(page, size);
        AReturnStorageExample example = new AReturnStorageExample();
        AReturnStorageExample.Criteria criteria = example.createCriteria();
        criteria.andDocStatusEqualTo(0);
        List<AReturnStorage> list = aReturnStorageMapper.selectByExample(example);
        return list;
    }

}

package com.erp.service.aftermodule.impl;

import com.erp.domain.aftermodule.AppealManagement;
import com.erp.domain.aftermodule.AppealManagementExample;
import com.erp.mapper.aftermodule.AppealManagementMapper;
import com.erp.service.aftermodule.AppealService;
import com.erp.utils.IDUtil;
import com.erp.utils.Result;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional(rollbackFor = Exception.class)
public class AppealServiceImpl implements AppealService {

    @Autowired
    private AppealManagementMapper appealManagementMapper;

    @Override
    public List<AppealManagement> findAll(Integer page, Integer size) {
        PageHelper.startPage(page, size);
        AppealManagementExample example = new AppealManagementExample();
        AppealManagementExample.Criteria criteria = example.createCriteria();
        criteria.andIsDeletedEqualTo(0);
        List<AppealManagement> list = appealManagementMapper.selectByExample(example);
        return list;
    }

    @Override
    public AppealManagement findById(String id) {
        AppealManagement appeal = appealManagementMapper.selectByPrimaryKey(id);
        return appeal;
    }

    @Override
    public void save(AppealManagement appeal) {
        appeal.setId(IDUtil.getItemId());
        appealManagementMapper.insert(appeal);
    }

    @Override
    public Result deleteById(String id) {
        //TODO 判断申诉单是否已进入审核阶段

        //修改删除状态
//        AppealManagement appeal = new AppealManagement();
//        appeal.setIsDeleted(0);
//        appeal.setId(id);
//        int i = appealManagementMapper.updateByPrimaryKeySelective(appeal);
        int delete = appealManagementMapper.delete(id);
        if (delete>0){
            return new Result("200","删除成功");
        }else {
            return new Result("201","删除失败");
        }
    }

    @Override
    public Result update(AppealManagement appeal) {
        int i = appealManagementMapper.updateByPrimaryKeySelective(appeal);
        if (i>0){
            return new Result("200","修改成功");
        }else {
            return new Result("201","修改失败");
        }
    }

    @Override
    public List<AppealManagement> findBySelf(AppealManagement appeal, Integer page, Integer size) {
        PageHelper.startPage(page, size);
        AppealManagementExample example = new AppealManagementExample();
        AppealManagementExample.Criteria criteria = example.createCriteria();
        //非删除状态
        criteria.andIsDeletedEqualTo(0);
        //模糊查询描述信息
        criteria.andDescriptionLike('%'+appeal.getDescription()+'%');
        //模糊查询申诉名称
        criteria.andNameLike('%'+appeal.getName()+'%');
        //精确查询申诉时间
        criteria.andGmtCreateEqualTo(appeal.getGmtCreate());
        //精确查询订单号
        criteria.andOrderIdEqualTo(appeal.getOrderId());
        List<AppealManagement> list = appealManagementMapper.selectByExample(example);
        return list;
    }
}

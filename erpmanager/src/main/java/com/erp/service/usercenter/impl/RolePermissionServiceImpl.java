package com.erp.service.usercenter.impl;

import com.erp.domain.usercenter.ATreeMenu;
import com.erp.exception.MyException;
import com.erp.mapper.usercenter.MgtRolePermissionMapper;
import com.erp.service.usercenter.PermissionSettingService;
import com.erp.service.usercenter.RolePermissionService;
import com.erp.utils.IDUtil;
import com.erp.utils.Result;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class RolePermissionServiceImpl implements RolePermissionService {

    @Resource
    private MgtRolePermissionMapper rolePermissionMapper;
    @Resource
    private PermissionSettingService permissionService;

    // 获取treePmn
    @Override
    public List<ATreeMenu> getPmntree() {
        List<ATreeMenu> allATree = rolePermissionMapper.getPmnList();
        List<ATreeMenu> ATree = getPermissionTree(allATree);
        return ATree;
    }

    // 添加用户权限
    @Override
    @Transactional(rollbackFor = {Exception.class})
    public Result addpmn(String[] pmnids, String rid) {
        try {
            rolePermissionMapper.deleteAllpmn(rid);
            int sum = 0;
            for (String pmnId : pmnids){
                String id = IDUtil.getItemId();
                sum += rolePermissionMapper.addpmn(id,rid,pmnId);
            }
            if (sum == pmnids.length){
                return new Result("200","添加权限成功");
            }
            throw new MyException("添加权限错误");
        } catch (Exception e){
            e.printStackTrace();
            return new Result("201","添加权限错误");
        }
    }

    //-------------- 递归查询所有的菜单 -------------------
    public List<ATreeMenu> getPermissionTree(List<ATreeMenu> allATree) {
        List<ATreeMenu> finalTree = new ArrayList<ATreeMenu>();

        for (ATreeMenu aTree : allATree) {
            if (aTree.getPid().equals("0")){
                finalTree.add(selectChildren(aTree,allATree));
            }
        }
        return finalTree;
    }

    public ATreeMenu selectChildren(ATreeMenu aTree,List<ATreeMenu> allATree){
        aTree.setChildren(new ArrayList<ATreeMenu>());
        for (ATreeMenu aTreeChild : allATree){
            if (aTreeChild.getPid().equals(aTree.getId())){

                aTree.getChildren().add(selectChildren(aTreeChild ,allATree));
            }
        }
        return aTree;
    }
}

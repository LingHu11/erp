package com.erp.service.usercenter.impl;

import com.erp.domain.usercenter.MgtPermission;
import com.erp.domain.usercenter.MgtRole;
import com.erp.mapper.usercenter.MgtPermissionMapper;
import com.erp.service.usercenter.PermissionSettingService;
import com.erp.utils.EmbedIdAndTime;
import com.erp.utils.Result;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PermissionSettingServiceImpl implements PermissionSettingService {

    @Resource
    private MgtPermissionMapper permissionMapper;

    @Override
    public Result registerPermission(MgtPermission mgtPermission) {
        MgtPermission name = permissionMapper.getPermissionByPermissionName(mgtPermission.getName());
        if (StringUtils.isEmpty(name)){
            EmbedIdAndTime<MgtPermission> embed = new EmbedIdAndTime<MgtPermission>();
            embed.embedIdAndDate(mgtPermission);
            int i = permissionMapper.registerPermission(mgtPermission);
            return i>0?new Result("200" ,"创建权限成功"):new Result("201" ,"权限创建失败，请重试");
        }else {
            return new Result("201" ,"权限名重复，请重新生成");
        }
    }

    @Override
    public MgtPermission getPermissionById(String id) {
        MgtPermission permission = permissionMapper.getPermissionById(id);
        return permission;
    }

    @Override
    public List<MgtPermission> getPermissionByCondition(MgtPermission mgtPermission) {
        List<MgtPermission> mgtPermissions = permissionMapper.getPermissionByCondition(mgtPermission);
        return mgtPermissions;
    }

    @Override
    public Result deletePermissionById(String id) {
        int i = permissionMapper.deletePermissionById(id);
        return i>0?new Result("200" ,"删除成功"):new Result("201" ,"删除失败，请重试");

    }

    @Override
    public Result updatePermission(MgtPermission mgtPermission) {
        int i = permissionMapper.updatePermission(mgtPermission);
        return i>0?new Result("200" ,"权限信息更新成功"):new Result("201" ,"更新失败，请重试");
    }

    @Override
    public List<MgtPermission> getPermissionList(Integer page, Integer size) {
        PageHelper.offsetPage(page,size);
        List<MgtPermission> permissions = permissionMapper.getPermissionByCondition(null);
        return permissions;
    }
}

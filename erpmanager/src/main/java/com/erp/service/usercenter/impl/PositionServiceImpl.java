package com.erp.service.usercenter.impl;

import com.erp.domain.usercenter.MgtPosition;
import com.erp.mapper.usercenter.MgtPositionMapper;
import com.erp.service.usercenter.PositionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PositionServiceImpl implements PositionService {

    @Resource
    private MgtPositionMapper positionMapper;

    @Override
    public List<MgtPosition> getList() {
        List<MgtPosition> list = positionMapper.getList();
        return list;
    }
}

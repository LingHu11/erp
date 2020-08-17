package com.erp.controller.usercenter;

import com.erp.domain.usercenter.MgtPosition;
import com.erp.service.usercenter.PositionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.annotation.security.RolesAllowed;
import java.util.List;

@Controller
@RequestMapping("/position")
@RolesAllowed({"pmnManager","admin"})
public class PositionController {


    @Resource
    private PositionService positionService;

    @GetMapping("/list")
    @ResponseBody
    public List<MgtPosition> departList(){
        List<MgtPosition> list = positionService.getList();
        return list;
    }
}

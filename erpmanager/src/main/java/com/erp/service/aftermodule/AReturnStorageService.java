package com.erp.service.aftermodule;

import com.erp.domain.aftermodule.AReturnStorage;
import com.erp.domain.usercenter.MgtUser;

import java.util.List;

public interface AReturnStorageService {

    AReturnStorage saveAsaleReEx(MgtUser user,String asalesReExId);

    List<AReturnStorage> findAll(Integer page, Integer size);

}

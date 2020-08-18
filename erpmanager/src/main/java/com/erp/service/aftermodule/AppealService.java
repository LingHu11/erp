package com.erp.service.aftermodule;

import com.erp.domain.aftermodule.AppealManagement;
import com.erp.utils.Result;

import java.util.List;

public interface AppealService {

    List<AppealManagement> findAll(Integer page, Integer size);

    AppealManagement findById(String id);

    void save(AppealManagement appeal);

    Result deleteById(String id);

    Result update(AppealManagement appeal);

    List<AppealManagement> findBySelf(AppealManagement appeal, Integer page, Integer size);
}

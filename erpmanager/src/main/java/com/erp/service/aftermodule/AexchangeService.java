package com.erp.service.aftermodule;

import com.erp.domain.aftermodule.Aexchange;
import com.erp.utils.Result;

public interface AexchangeService {

    Aexchange findByAllId(String id);

    Aexchange findById(String id);

    Result save(Aexchange aexchange);

    void deleteById(String id);

    Result deleteByBatch(String[] ids);

    Result update(Aexchange aexchange);

}

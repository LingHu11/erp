package com.erp.service.aftermodule;

import com.erp.domain.aftermodule.Aexchange;
import com.erp.domain.aftermodule.AppealManagement;
import com.erp.domain.aftermodule.AsalesReEx;
import com.erp.domain.goodsmodule.Goods;
import com.erp.utils.Result;

import java.util.Date;
import java.util.List;

public interface AsalesReExService {

    List<AsalesReEx> findAll(Integer page, Integer size);

    List<AsalesReEx> findBySelf(Integer page, Integer size, AsalesReEx asalesReEx, Date gmtCreate2, Date gmtAudit2);

    Integer save(AsalesReEx asalesReEx);

    Integer deleteById(String id);

    Result deleteByBatch(String[] ids);

    AsalesReEx findById(String id);

    AsalesReEx selectByImei(String goodsImei);

    Result update(AsalesReEx asalesReEx);

    Result updateAudit(AsalesReEx asalesReEx, Aexchange aexchange);


}

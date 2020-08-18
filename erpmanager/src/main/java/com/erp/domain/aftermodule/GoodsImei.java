package com.erp.domain.aftermodule;

public class GoodsImei {
    private String goodsImei;

    private String goodsId;

    private Integer isDeleted;

    public String getGoodsImei() {
        return goodsImei;
    }

    public void setGoodsImei(String goodsImei) {
        this.goodsImei = goodsImei == null ? null : goodsImei.trim();
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }
}
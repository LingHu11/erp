package com.erp.domain.aftermodule;

import java.util.Date;

public class Aexchange {
    private String id;

    private String goodsImei;

    private String goodsId;

    private String goodsName;

    private String goodsType;

    private Date goodsColor;

    private Integer isDeleted;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

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

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType == null ? null : goodsType.trim();
    }

    public Date getGoodsColor() {
        return goodsColor;
    }

    public void setGoodsColor(Date goodsColor) {
        this.goodsColor = goodsColor;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }
}
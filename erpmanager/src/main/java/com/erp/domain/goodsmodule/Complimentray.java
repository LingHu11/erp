package com.erp.domain.goodsmodule;

import java.math.BigDecimal;

public class Complimentray {
    private Integer id;

    private String number;

    private String name;

    private String categoryName;

    private String brandName;

    private String model;

    private BigDecimal purchasePrice;

    private String purchaseDept;

    private BigDecimal marketPrice;

    private BigDecimal mallPrice;

    private String color;

    private String stockFileNumber;

    private String perserve1;

    private String perserve2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getPurchaseDept() {
        return purchaseDept;
    }

    public void setPurchaseDept(String purchaseDept) {
        this.purchaseDept = purchaseDept == null ? null : purchaseDept.trim();
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public BigDecimal getMallPrice() {
        return mallPrice;
    }

    public void setMallPrice(BigDecimal mallPrice) {
        this.mallPrice = mallPrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getStockFileNumber() {
        return stockFileNumber;
    }

    public void setStockFileNumber(String stockFileNumber) {
        this.stockFileNumber = stockFileNumber == null ? null : stockFileNumber.trim();
    }

    public String getPerserve1() {
        return perserve1;
    }

    public void setPerserve1(String perserve1) {
        this.perserve1 = perserve1 == null ? null : perserve1.trim();
    }

    public String getPerserve2() {
        return perserve2;
    }

    public void setPerserve2(String perserve2) {
        this.perserve2 = perserve2 == null ? null : perserve2.trim();
    }
}
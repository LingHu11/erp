package com.erp.domain.goodsmodule;

public class TbGoods {
    private Integer id;

    private String stockFileNumber;

    private String name;

    private Integer categoryId;

    private Integer brandId;

    private String productModel;

    private Double purchasePrice;

    private Double marketPrice;

    private Double mallPrice;

    private String color;

    private String perserve1;

    private String perserve2;

    private String perserve3;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStockFileNumber() {
        return stockFileNumber;
    }

    public void setStockFileNumber(String stockFileNumber) {
        this.stockFileNumber = stockFileNumber == null ? null : stockFileNumber.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getProductModel() {
        return productModel;
    }

    public void setProductModel(String productModel) {
        this.productModel = productModel == null ? null : productModel.trim();
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Double marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Double getMallPrice() {
        return mallPrice;
    }

    public void setMallPrice(Double mallPrice) {
        this.mallPrice = mallPrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
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

    public String getPerserve3() {
        return perserve3;
    }

    public void setPerserve3(String perserve3) {
        this.perserve3 = perserve3 == null ? null : perserve3.trim();
    }
}
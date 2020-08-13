package com.erp.domain.goodsmodule;

import java.math.BigDecimal;
import java.util.Date;

public class GoodsToComplimentray {
    private Integer id;

    private String convertNumber;

    private String name;

    private String categoryName;

    private String brandName;

    private String model;

    private BigDecimal purchasePrice;

    private String purchaseDept;

    private String applicant;

    private String approvalUser;

    private Date approvalTime;

    private String approvalStatus;

    private String perserve1;

    private String perserve2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConvertNumber() {
        return convertNumber;
    }

    public void setConvertNumber(String convertNumber) {
        this.convertNumber = convertNumber == null ? null : convertNumber.trim();
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

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant == null ? null : applicant.trim();
    }

    public String getApprovalUser() {
        return approvalUser;
    }

    public void setApprovalUser(String approvalUser) {
        this.approvalUser = approvalUser == null ? null : approvalUser.trim();
    }

    public Date getApprovalTime() {
        return approvalTime;
    }

    public void setApprovalTime(Date approvalTime) {
        this.approvalTime = approvalTime;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus == null ? null : approvalStatus.trim();
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
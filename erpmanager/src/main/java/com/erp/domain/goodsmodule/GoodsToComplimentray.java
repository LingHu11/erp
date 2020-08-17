package com.erp.domain.goodsmodule;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

public class GoodsToComplimentray extends BaseRowModel {

    private Integer id;
    @ExcelProperty(value = "赠品名称",index = 0 )
    private String name;
    @ExcelProperty(value = "赠品入库数",index = 1 )
    private String convertNumber;
    @ExcelProperty(value = "二级分类",index = 2 )
    private String categoryName;
    @ExcelProperty(value = "品牌名称",index = 3 )
    private String brandName;
    @ExcelProperty(value = "赠品型号",index = 4 )
    private String model;
    @ExcelProperty(value = "采购价",index = 5 )
    private BigDecimal purchasePrice;
    @ExcelProperty(value = "采购部门",index = 6 )
    private String purchaseDept;
    @ExcelProperty(value = "申请人",index = 7 )
    private String applicant;
    @ExcelProperty(value = "审核人",index = 8 )
    private String approvalUser;
    @ExcelProperty(value = "审核时间",index = 9 )
    private Date approvalTime;
    @ExcelProperty(value = "审核状态",index = 10 )
    private String approvalStatus;
    @ExcelProperty(value = "审核意见",index = 11 )
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
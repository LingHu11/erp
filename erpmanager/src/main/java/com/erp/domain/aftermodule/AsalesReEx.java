package com.erp.domain.aftermodule;

import java.util.Date;

public class AsalesReEx {
    private String id;

    private String orderId;

    private String appealId;

    private String maker;

    private Date gmtCreate;

    private String department;

    private String type;

    private String goodsId;

    private String goodsBrand;

    private String goodsImei;

    private String goodsType;

    private String goodsColor;

    private Long goodsPrice;

    private String statusReturn;

    private Integer isDeleted;

    private String inboundId;

    private String componentExchange;

    private String reasonReturn;

    private String auditor;

    private String opinionApprover;

    private String auditStatus;

    private Date gmtAudit;

    private String docStatus;

    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getAppealId() {
        return appealId;
    }

    public void setAppealId(String appealId) {
        this.appealId = appealId == null ? null : appealId.trim();
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker == null ? null : maker.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    public String getGoodsBrand() {
        return goodsBrand;
    }

    public void setGoodsBrand(String goodsBrand) {
        this.goodsBrand = goodsBrand == null ? null : goodsBrand.trim();
    }

    public String getGoodsImei() {
        return goodsImei;
    }

    public void setGoodsImei(String goodsImei) {
        this.goodsImei = goodsImei == null ? null : goodsImei.trim();
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType == null ? null : goodsType.trim();
    }

    public String getGoodsColor() {
        return goodsColor;
    }

    public void setGoodsColor(String goodsColor) {
        this.goodsColor = goodsColor == null ? null : goodsColor.trim();
    }

    public Long getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Long goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getStatusReturn() {
        return statusReturn;
    }

    public void setStatusReturn(String statusReturn) {
        this.statusReturn = statusReturn == null ? null : statusReturn.trim();
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getInboundId() {
        return inboundId;
    }

    public void setInboundId(String inboundId) {
        this.inboundId = inboundId == null ? null : inboundId.trim();
    }

    public String getComponentExchange() {
        return componentExchange;
    }

    public void setComponentExchange(String componentExchange) {
        this.componentExchange = componentExchange == null ? null : componentExchange.trim();
    }

    public String getReasonReturn() {
        return reasonReturn;
    }

    public void setReasonReturn(String reasonReturn) {
        this.reasonReturn = reasonReturn == null ? null : reasonReturn.trim();
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor == null ? null : auditor.trim();
    }

    public String getOpinionApprover() {
        return opinionApprover;
    }

    public void setOpinionApprover(String opinionApprover) {
        this.opinionApprover = opinionApprover == null ? null : opinionApprover.trim();
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus == null ? null : auditStatus.trim();
    }

    public Date getGmtAudit() {
        return gmtAudit;
    }

    public void setGmtAudit(Date gmtAudit) {
        this.gmtAudit = gmtAudit;
    }

    public String getDocStatus() {
        return docStatus;
    }

    public void setDocStatus(String docStatus) {
        this.docStatus = docStatus == null ? null : docStatus.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}
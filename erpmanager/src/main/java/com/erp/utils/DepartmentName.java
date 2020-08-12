package com.erp.utils;



public enum DepartmentName {
    AFTER_SALES_DEPARTMENT("SHB","售后部") ,
    PERSONNEL_DEPARTMENT ("RSB","人事部"),
    SALES_DEPARTMENT ("XSB" , "销售部"),
    COMMODITY_MANAGEMENT_DEPARTMENT ("SGB" , "商品管理部");

    private String abbreviation;
    private String department;

    DepartmentName(String abbreviation ,String department) {
        this.abbreviation = abbreviation;
        this.department = department;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getDepartment() {
        return department;
    }
}

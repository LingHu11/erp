package com.erp.domain.goodsmodule;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ComplimentrayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComplimentrayExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("number like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("number not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNull() {
            addCriterion("category_name is null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNotNull() {
            addCriterion("category_name is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameEqualTo(String value) {
            addCriterion("category_name =", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotEqualTo(String value) {
            addCriterion("category_name <>", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThan(String value) {
            addCriterion("category_name >", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("category_name >=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThan(String value) {
            addCriterion("category_name <", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("category_name <=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLike(String value) {
            addCriterion("category_name like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotLike(String value) {
            addCriterion("category_name not like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIn(List<String> values) {
            addCriterion("category_name in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotIn(List<String> values) {
            addCriterion("category_name not in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameBetween(String value1, String value2) {
            addCriterion("category_name between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotBetween(String value1, String value2) {
            addCriterion("category_name not between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNull() {
            addCriterion("brand_name is null");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNotNull() {
            addCriterion("brand_name is not null");
            return (Criteria) this;
        }

        public Criteria andBrandNameEqualTo(String value) {
            addCriterion("brand_name =", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotEqualTo(String value) {
            addCriterion("brand_name <>", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThan(String value) {
            addCriterion("brand_name >", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThanOrEqualTo(String value) {
            addCriterion("brand_name >=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThan(String value) {
            addCriterion("brand_name <", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThanOrEqualTo(String value) {
            addCriterion("brand_name <=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLike(String value) {
            addCriterion("brand_name like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotLike(String value) {
            addCriterion("brand_name not like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameIn(List<String> values) {
            addCriterion("brand_name in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotIn(List<String> values) {
            addCriterion("brand_name not in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameBetween(String value1, String value2) {
            addCriterion("brand_name between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotBetween(String value1, String value2) {
            addCriterion("brand_name not between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceIsNull() {
            addCriterion("purchase_price is null");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceIsNotNull() {
            addCriterion("purchase_price is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceEqualTo(BigDecimal value) {
            addCriterion("purchase_price =", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceNotEqualTo(BigDecimal value) {
            addCriterion("purchase_price <>", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceGreaterThan(BigDecimal value) {
            addCriterion("purchase_price >", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("purchase_price >=", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceLessThan(BigDecimal value) {
            addCriterion("purchase_price <", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("purchase_price <=", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceIn(List<BigDecimal> values) {
            addCriterion("purchase_price in", values, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceNotIn(List<BigDecimal> values) {
            addCriterion("purchase_price not in", values, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("purchase_price between", value1, value2, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("purchase_price not between", value1, value2, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeptIsNull() {
            addCriterion("purchase_dept is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeptIsNotNull() {
            addCriterion("purchase_dept is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeptEqualTo(String value) {
            addCriterion("purchase_dept =", value, "purchaseDept");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeptNotEqualTo(String value) {
            addCriterion("purchase_dept <>", value, "purchaseDept");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeptGreaterThan(String value) {
            addCriterion("purchase_dept >", value, "purchaseDept");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeptGreaterThanOrEqualTo(String value) {
            addCriterion("purchase_dept >=", value, "purchaseDept");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeptLessThan(String value) {
            addCriterion("purchase_dept <", value, "purchaseDept");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeptLessThanOrEqualTo(String value) {
            addCriterion("purchase_dept <=", value, "purchaseDept");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeptLike(String value) {
            addCriterion("purchase_dept like", value, "purchaseDept");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeptNotLike(String value) {
            addCriterion("purchase_dept not like", value, "purchaseDept");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeptIn(List<String> values) {
            addCriterion("purchase_dept in", values, "purchaseDept");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeptNotIn(List<String> values) {
            addCriterion("purchase_dept not in", values, "purchaseDept");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeptBetween(String value1, String value2) {
            addCriterion("purchase_dept between", value1, value2, "purchaseDept");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeptNotBetween(String value1, String value2) {
            addCriterion("purchase_dept not between", value1, value2, "purchaseDept");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNull() {
            addCriterion("market_price is null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNotNull() {
            addCriterion("market_price is not null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceEqualTo(BigDecimal value) {
            addCriterion("market_price =", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotEqualTo(BigDecimal value) {
            addCriterion("market_price <>", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThan(BigDecimal value) {
            addCriterion("market_price >", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("market_price >=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThan(BigDecimal value) {
            addCriterion("market_price <", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("market_price <=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIn(List<BigDecimal> values) {
            addCriterion("market_price in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotIn(List<BigDecimal> values) {
            addCriterion("market_price not in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("market_price between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("market_price not between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMallPriceIsNull() {
            addCriterion("mall_price is null");
            return (Criteria) this;
        }

        public Criteria andMallPriceIsNotNull() {
            addCriterion("mall_price is not null");
            return (Criteria) this;
        }

        public Criteria andMallPriceEqualTo(BigDecimal value) {
            addCriterion("mall_price =", value, "mallPrice");
            return (Criteria) this;
        }

        public Criteria andMallPriceNotEqualTo(BigDecimal value) {
            addCriterion("mall_price <>", value, "mallPrice");
            return (Criteria) this;
        }

        public Criteria andMallPriceGreaterThan(BigDecimal value) {
            addCriterion("mall_price >", value, "mallPrice");
            return (Criteria) this;
        }

        public Criteria andMallPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mall_price >=", value, "mallPrice");
            return (Criteria) this;
        }

        public Criteria andMallPriceLessThan(BigDecimal value) {
            addCriterion("mall_price <", value, "mallPrice");
            return (Criteria) this;
        }

        public Criteria andMallPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mall_price <=", value, "mallPrice");
            return (Criteria) this;
        }

        public Criteria andMallPriceIn(List<BigDecimal> values) {
            addCriterion("mall_price in", values, "mallPrice");
            return (Criteria) this;
        }

        public Criteria andMallPriceNotIn(List<BigDecimal> values) {
            addCriterion("mall_price not in", values, "mallPrice");
            return (Criteria) this;
        }

        public Criteria andMallPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mall_price between", value1, value2, "mallPrice");
            return (Criteria) this;
        }

        public Criteria andMallPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mall_price not between", value1, value2, "mallPrice");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andStockFileNumberIsNull() {
            addCriterion("stock_file_number is null");
            return (Criteria) this;
        }

        public Criteria andStockFileNumberIsNotNull() {
            addCriterion("stock_file_number is not null");
            return (Criteria) this;
        }

        public Criteria andStockFileNumberEqualTo(String value) {
            addCriterion("stock_file_number =", value, "stockFileNumber");
            return (Criteria) this;
        }

        public Criteria andStockFileNumberNotEqualTo(String value) {
            addCriterion("stock_file_number <>", value, "stockFileNumber");
            return (Criteria) this;
        }

        public Criteria andStockFileNumberGreaterThan(String value) {
            addCriterion("stock_file_number >", value, "stockFileNumber");
            return (Criteria) this;
        }

        public Criteria andStockFileNumberGreaterThanOrEqualTo(String value) {
            addCriterion("stock_file_number >=", value, "stockFileNumber");
            return (Criteria) this;
        }

        public Criteria andStockFileNumberLessThan(String value) {
            addCriterion("stock_file_number <", value, "stockFileNumber");
            return (Criteria) this;
        }

        public Criteria andStockFileNumberLessThanOrEqualTo(String value) {
            addCriterion("stock_file_number <=", value, "stockFileNumber");
            return (Criteria) this;
        }

        public Criteria andStockFileNumberLike(String value) {
            addCriterion("stock_file_number like", value, "stockFileNumber");
            return (Criteria) this;
        }

        public Criteria andStockFileNumberNotLike(String value) {
            addCriterion("stock_file_number not like", value, "stockFileNumber");
            return (Criteria) this;
        }

        public Criteria andStockFileNumberIn(List<String> values) {
            addCriterion("stock_file_number in", values, "stockFileNumber");
            return (Criteria) this;
        }

        public Criteria andStockFileNumberNotIn(List<String> values) {
            addCriterion("stock_file_number not in", values, "stockFileNumber");
            return (Criteria) this;
        }

        public Criteria andStockFileNumberBetween(String value1, String value2) {
            addCriterion("stock_file_number between", value1, value2, "stockFileNumber");
            return (Criteria) this;
        }

        public Criteria andStockFileNumberNotBetween(String value1, String value2) {
            addCriterion("stock_file_number not between", value1, value2, "stockFileNumber");
            return (Criteria) this;
        }

        public Criteria andPerserve1IsNull() {
            addCriterion("perserve1 is null");
            return (Criteria) this;
        }

        public Criteria andPerserve1IsNotNull() {
            addCriterion("perserve1 is not null");
            return (Criteria) this;
        }

        public Criteria andPerserve1EqualTo(String value) {
            addCriterion("perserve1 =", value, "perserve1");
            return (Criteria) this;
        }

        public Criteria andPerserve1NotEqualTo(String value) {
            addCriterion("perserve1 <>", value, "perserve1");
            return (Criteria) this;
        }

        public Criteria andPerserve1GreaterThan(String value) {
            addCriterion("perserve1 >", value, "perserve1");
            return (Criteria) this;
        }

        public Criteria andPerserve1GreaterThanOrEqualTo(String value) {
            addCriterion("perserve1 >=", value, "perserve1");
            return (Criteria) this;
        }

        public Criteria andPerserve1LessThan(String value) {
            addCriterion("perserve1 <", value, "perserve1");
            return (Criteria) this;
        }

        public Criteria andPerserve1LessThanOrEqualTo(String value) {
            addCriterion("perserve1 <=", value, "perserve1");
            return (Criteria) this;
        }

        public Criteria andPerserve1Like(String value) {
            addCriterion("perserve1 like", value, "perserve1");
            return (Criteria) this;
        }

        public Criteria andPerserve1NotLike(String value) {
            addCriterion("perserve1 not like", value, "perserve1");
            return (Criteria) this;
        }

        public Criteria andPerserve1In(List<String> values) {
            addCriterion("perserve1 in", values, "perserve1");
            return (Criteria) this;
        }

        public Criteria andPerserve1NotIn(List<String> values) {
            addCriterion("perserve1 not in", values, "perserve1");
            return (Criteria) this;
        }

        public Criteria andPerserve1Between(String value1, String value2) {
            addCriterion("perserve1 between", value1, value2, "perserve1");
            return (Criteria) this;
        }

        public Criteria andPerserve1NotBetween(String value1, String value2) {
            addCriterion("perserve1 not between", value1, value2, "perserve1");
            return (Criteria) this;
        }

        public Criteria andPerserve2IsNull() {
            addCriterion("perserve2 is null");
            return (Criteria) this;
        }

        public Criteria andPerserve2IsNotNull() {
            addCriterion("perserve2 is not null");
            return (Criteria) this;
        }

        public Criteria andPerserve2EqualTo(String value) {
            addCriterion("perserve2 =", value, "perserve2");
            return (Criteria) this;
        }

        public Criteria andPerserve2NotEqualTo(String value) {
            addCriterion("perserve2 <>", value, "perserve2");
            return (Criteria) this;
        }

        public Criteria andPerserve2GreaterThan(String value) {
            addCriterion("perserve2 >", value, "perserve2");
            return (Criteria) this;
        }

        public Criteria andPerserve2GreaterThanOrEqualTo(String value) {
            addCriterion("perserve2 >=", value, "perserve2");
            return (Criteria) this;
        }

        public Criteria andPerserve2LessThan(String value) {
            addCriterion("perserve2 <", value, "perserve2");
            return (Criteria) this;
        }

        public Criteria andPerserve2LessThanOrEqualTo(String value) {
            addCriterion("perserve2 <=", value, "perserve2");
            return (Criteria) this;
        }

        public Criteria andPerserve2Like(String value) {
            addCriterion("perserve2 like", value, "perserve2");
            return (Criteria) this;
        }

        public Criteria andPerserve2NotLike(String value) {
            addCriterion("perserve2 not like", value, "perserve2");
            return (Criteria) this;
        }

        public Criteria andPerserve2In(List<String> values) {
            addCriterion("perserve2 in", values, "perserve2");
            return (Criteria) this;
        }

        public Criteria andPerserve2NotIn(List<String> values) {
            addCriterion("perserve2 not in", values, "perserve2");
            return (Criteria) this;
        }

        public Criteria andPerserve2Between(String value1, String value2) {
            addCriterion("perserve2 between", value1, value2, "perserve2");
            return (Criteria) this;
        }

        public Criteria andPerserve2NotBetween(String value1, String value2) {
            addCriterion("perserve2 not between", value1, value2, "perserve2");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
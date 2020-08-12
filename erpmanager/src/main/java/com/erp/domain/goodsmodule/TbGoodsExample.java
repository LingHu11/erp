package com.erp.domain.goodsmodule;

import java.util.ArrayList;
import java.util.List;

public class TbGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbGoodsExample() {
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

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Integer value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Integer value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Integer value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Integer value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Integer> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Integer> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(Integer value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Integer value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(Integer value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("brand_id >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Integer value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Integer value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Integer> values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Integer> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Integer value1, Integer value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Integer value1, Integer value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andProductModelIsNull() {
            addCriterion("product_model is null");
            return (Criteria) this;
        }

        public Criteria andProductModelIsNotNull() {
            addCriterion("product_model is not null");
            return (Criteria) this;
        }

        public Criteria andProductModelEqualTo(String value) {
            addCriterion("product_model =", value, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelNotEqualTo(String value) {
            addCriterion("product_model <>", value, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelGreaterThan(String value) {
            addCriterion("product_model >", value, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelGreaterThanOrEqualTo(String value) {
            addCriterion("product_model >=", value, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelLessThan(String value) {
            addCriterion("product_model <", value, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelLessThanOrEqualTo(String value) {
            addCriterion("product_model <=", value, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelLike(String value) {
            addCriterion("product_model like", value, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelNotLike(String value) {
            addCriterion("product_model not like", value, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelIn(List<String> values) {
            addCriterion("product_model in", values, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelNotIn(List<String> values) {
            addCriterion("product_model not in", values, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelBetween(String value1, String value2) {
            addCriterion("product_model between", value1, value2, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelNotBetween(String value1, String value2) {
            addCriterion("product_model not between", value1, value2, "productModel");
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

        public Criteria andPurchasePriceEqualTo(Double value) {
            addCriterion("purchase_price =", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceNotEqualTo(Double value) {
            addCriterion("purchase_price <>", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceGreaterThan(Double value) {
            addCriterion("purchase_price >", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceGreaterThanOrEqualTo(Double value) {
            addCriterion("purchase_price >=", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceLessThan(Double value) {
            addCriterion("purchase_price <", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceLessThanOrEqualTo(Double value) {
            addCriterion("purchase_price <=", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceIn(List<Double> values) {
            addCriterion("purchase_price in", values, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceNotIn(List<Double> values) {
            addCriterion("purchase_price not in", values, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceBetween(Double value1, Double value2) {
            addCriterion("purchase_price between", value1, value2, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceNotBetween(Double value1, Double value2) {
            addCriterion("purchase_price not between", value1, value2, "purchasePrice");
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

        public Criteria andMarketPriceEqualTo(Double value) {
            addCriterion("market_price =", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotEqualTo(Double value) {
            addCriterion("market_price <>", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThan(Double value) {
            addCriterion("market_price >", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("market_price >=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThan(Double value) {
            addCriterion("market_price <", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThanOrEqualTo(Double value) {
            addCriterion("market_price <=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIn(List<Double> values) {
            addCriterion("market_price in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotIn(List<Double> values) {
            addCriterion("market_price not in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceBetween(Double value1, Double value2) {
            addCriterion("market_price between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotBetween(Double value1, Double value2) {
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

        public Criteria andMallPriceEqualTo(Double value) {
            addCriterion("mall_price =", value, "mallPrice");
            return (Criteria) this;
        }

        public Criteria andMallPriceNotEqualTo(Double value) {
            addCriterion("mall_price <>", value, "mallPrice");
            return (Criteria) this;
        }

        public Criteria andMallPriceGreaterThan(Double value) {
            addCriterion("mall_price >", value, "mallPrice");
            return (Criteria) this;
        }

        public Criteria andMallPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("mall_price >=", value, "mallPrice");
            return (Criteria) this;
        }

        public Criteria andMallPriceLessThan(Double value) {
            addCriterion("mall_price <", value, "mallPrice");
            return (Criteria) this;
        }

        public Criteria andMallPriceLessThanOrEqualTo(Double value) {
            addCriterion("mall_price <=", value, "mallPrice");
            return (Criteria) this;
        }

        public Criteria andMallPriceIn(List<Double> values) {
            addCriterion("mall_price in", values, "mallPrice");
            return (Criteria) this;
        }

        public Criteria andMallPriceNotIn(List<Double> values) {
            addCriterion("mall_price not in", values, "mallPrice");
            return (Criteria) this;
        }

        public Criteria andMallPriceBetween(Double value1, Double value2) {
            addCriterion("mall_price between", value1, value2, "mallPrice");
            return (Criteria) this;
        }

        public Criteria andMallPriceNotBetween(Double value1, Double value2) {
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

        public Criteria andPerserve3IsNull() {
            addCriterion("perserve3 is null");
            return (Criteria) this;
        }

        public Criteria andPerserve3IsNotNull() {
            addCriterion("perserve3 is not null");
            return (Criteria) this;
        }

        public Criteria andPerserve3EqualTo(String value) {
            addCriterion("perserve3 =", value, "perserve3");
            return (Criteria) this;
        }

        public Criteria andPerserve3NotEqualTo(String value) {
            addCriterion("perserve3 <>", value, "perserve3");
            return (Criteria) this;
        }

        public Criteria andPerserve3GreaterThan(String value) {
            addCriterion("perserve3 >", value, "perserve3");
            return (Criteria) this;
        }

        public Criteria andPerserve3GreaterThanOrEqualTo(String value) {
            addCriterion("perserve3 >=", value, "perserve3");
            return (Criteria) this;
        }

        public Criteria andPerserve3LessThan(String value) {
            addCriterion("perserve3 <", value, "perserve3");
            return (Criteria) this;
        }

        public Criteria andPerserve3LessThanOrEqualTo(String value) {
            addCriterion("perserve3 <=", value, "perserve3");
            return (Criteria) this;
        }

        public Criteria andPerserve3Like(String value) {
            addCriterion("perserve3 like", value, "perserve3");
            return (Criteria) this;
        }

        public Criteria andPerserve3NotLike(String value) {
            addCriterion("perserve3 not like", value, "perserve3");
            return (Criteria) this;
        }

        public Criteria andPerserve3In(List<String> values) {
            addCriterion("perserve3 in", values, "perserve3");
            return (Criteria) this;
        }

        public Criteria andPerserve3NotIn(List<String> values) {
            addCriterion("perserve3 not in", values, "perserve3");
            return (Criteria) this;
        }

        public Criteria andPerserve3Between(String value1, String value2) {
            addCriterion("perserve3 between", value1, value2, "perserve3");
            return (Criteria) this;
        }

        public Criteria andPerserve3NotBetween(String value1, String value2) {
            addCriterion("perserve3 not between", value1, value2, "perserve3");
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
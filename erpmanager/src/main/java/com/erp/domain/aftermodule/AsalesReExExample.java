package com.erp.domain.aftermodule;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AsalesReExExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AsalesReExExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andAppealIdIsNull() {
            addCriterion("appeal_id is null");
            return (Criteria) this;
        }

        public Criteria andAppealIdIsNotNull() {
            addCriterion("appeal_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppealIdEqualTo(String value) {
            addCriterion("appeal_id =", value, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIdNotEqualTo(String value) {
            addCriterion("appeal_id <>", value, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIdGreaterThan(String value) {
            addCriterion("appeal_id >", value, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIdGreaterThanOrEqualTo(String value) {
            addCriterion("appeal_id >=", value, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIdLessThan(String value) {
            addCriterion("appeal_id <", value, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIdLessThanOrEqualTo(String value) {
            addCriterion("appeal_id <=", value, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIdLike(String value) {
            addCriterion("appeal_id like", value, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIdNotLike(String value) {
            addCriterion("appeal_id not like", value, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIdIn(List<String> values) {
            addCriterion("appeal_id in", values, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIdNotIn(List<String> values) {
            addCriterion("appeal_id not in", values, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIdBetween(String value1, String value2) {
            addCriterion("appeal_id between", value1, value2, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIdNotBetween(String value1, String value2) {
            addCriterion("appeal_id not between", value1, value2, "appealId");
            return (Criteria) this;
        }

        public Criteria andMakerIsNull() {
            addCriterion("maker is null");
            return (Criteria) this;
        }

        public Criteria andMakerIsNotNull() {
            addCriterion("maker is not null");
            return (Criteria) this;
        }

        public Criteria andMakerEqualTo(String value) {
            addCriterion("maker =", value, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerNotEqualTo(String value) {
            addCriterion("maker <>", value, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerGreaterThan(String value) {
            addCriterion("maker >", value, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerGreaterThanOrEqualTo(String value) {
            addCriterion("maker >=", value, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerLessThan(String value) {
            addCriterion("maker <", value, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerLessThanOrEqualTo(String value) {
            addCriterion("maker <=", value, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerLike(String value) {
            addCriterion("maker like", value, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerNotLike(String value) {
            addCriterion("maker not like", value, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerIn(List<String> values) {
            addCriterion("maker in", values, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerNotIn(List<String> values) {
            addCriterion("maker not in", values, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerBetween(String value1, String value2) {
            addCriterion("maker between", value1, value2, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerNotBetween(String value1, String value2) {
            addCriterion("maker not between", value1, value2, "maker");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(String value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(String value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(String value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(String value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(String value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(String value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLike(String value) {
            addCriterion("goods_id like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotLike(String value) {
            addCriterion("goods_id not like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<String> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<String> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(String value1, String value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(String value1, String value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandIsNull() {
            addCriterion("goods_brand is null");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandIsNotNull() {
            addCriterion("goods_brand is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandEqualTo(String value) {
            addCriterion("goods_brand =", value, "goodsBrand");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandNotEqualTo(String value) {
            addCriterion("goods_brand <>", value, "goodsBrand");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandGreaterThan(String value) {
            addCriterion("goods_brand >", value, "goodsBrand");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandGreaterThanOrEqualTo(String value) {
            addCriterion("goods_brand >=", value, "goodsBrand");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandLessThan(String value) {
            addCriterion("goods_brand <", value, "goodsBrand");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandLessThanOrEqualTo(String value) {
            addCriterion("goods_brand <=", value, "goodsBrand");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandLike(String value) {
            addCriterion("goods_brand like", value, "goodsBrand");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandNotLike(String value) {
            addCriterion("goods_brand not like", value, "goodsBrand");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandIn(List<String> values) {
            addCriterion("goods_brand in", values, "goodsBrand");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandNotIn(List<String> values) {
            addCriterion("goods_brand not in", values, "goodsBrand");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandBetween(String value1, String value2) {
            addCriterion("goods_brand between", value1, value2, "goodsBrand");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandNotBetween(String value1, String value2) {
            addCriterion("goods_brand not between", value1, value2, "goodsBrand");
            return (Criteria) this;
        }

        public Criteria andGoodsImeiIsNull() {
            addCriterion("goods_imei is null");
            return (Criteria) this;
        }

        public Criteria andGoodsImeiIsNotNull() {
            addCriterion("goods_imei is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsImeiEqualTo(String value) {
            addCriterion("goods_imei =", value, "goodsImei");
            return (Criteria) this;
        }

        public Criteria andGoodsImeiNotEqualTo(String value) {
            addCriterion("goods_imei <>", value, "goodsImei");
            return (Criteria) this;
        }

        public Criteria andGoodsImeiGreaterThan(String value) {
            addCriterion("goods_imei >", value, "goodsImei");
            return (Criteria) this;
        }

        public Criteria andGoodsImeiGreaterThanOrEqualTo(String value) {
            addCriterion("goods_imei >=", value, "goodsImei");
            return (Criteria) this;
        }

        public Criteria andGoodsImeiLessThan(String value) {
            addCriterion("goods_imei <", value, "goodsImei");
            return (Criteria) this;
        }

        public Criteria andGoodsImeiLessThanOrEqualTo(String value) {
            addCriterion("goods_imei <=", value, "goodsImei");
            return (Criteria) this;
        }

        public Criteria andGoodsImeiLike(String value) {
            addCriterion("goods_imei like", value, "goodsImei");
            return (Criteria) this;
        }

        public Criteria andGoodsImeiNotLike(String value) {
            addCriterion("goods_imei not like", value, "goodsImei");
            return (Criteria) this;
        }

        public Criteria andGoodsImeiIn(List<String> values) {
            addCriterion("goods_imei in", values, "goodsImei");
            return (Criteria) this;
        }

        public Criteria andGoodsImeiNotIn(List<String> values) {
            addCriterion("goods_imei not in", values, "goodsImei");
            return (Criteria) this;
        }

        public Criteria andGoodsImeiBetween(String value1, String value2) {
            addCriterion("goods_imei between", value1, value2, "goodsImei");
            return (Criteria) this;
        }

        public Criteria andGoodsImeiNotBetween(String value1, String value2) {
            addCriterion("goods_imei not between", value1, value2, "goodsImei");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNull() {
            addCriterion("goods_type is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNotNull() {
            addCriterion("goods_type is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeEqualTo(String value) {
            addCriterion("goods_type =", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotEqualTo(String value) {
            addCriterion("goods_type <>", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThan(String value) {
            addCriterion("goods_type >", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_type >=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThan(String value) {
            addCriterion("goods_type <", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThanOrEqualTo(String value) {
            addCriterion("goods_type <=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLike(String value) {
            addCriterion("goods_type like", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotLike(String value) {
            addCriterion("goods_type not like", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIn(List<String> values) {
            addCriterion("goods_type in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotIn(List<String> values) {
            addCriterion("goods_type not in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeBetween(String value1, String value2) {
            addCriterion("goods_type between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotBetween(String value1, String value2) {
            addCriterion("goods_type not between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsColorIsNull() {
            addCriterion("goods_color is null");
            return (Criteria) this;
        }

        public Criteria andGoodsColorIsNotNull() {
            addCriterion("goods_color is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsColorEqualTo(String value) {
            addCriterion("goods_color =", value, "goodsColor");
            return (Criteria) this;
        }

        public Criteria andGoodsColorNotEqualTo(String value) {
            addCriterion("goods_color <>", value, "goodsColor");
            return (Criteria) this;
        }

        public Criteria andGoodsColorGreaterThan(String value) {
            addCriterion("goods_color >", value, "goodsColor");
            return (Criteria) this;
        }

        public Criteria andGoodsColorGreaterThanOrEqualTo(String value) {
            addCriterion("goods_color >=", value, "goodsColor");
            return (Criteria) this;
        }

        public Criteria andGoodsColorLessThan(String value) {
            addCriterion("goods_color <", value, "goodsColor");
            return (Criteria) this;
        }

        public Criteria andGoodsColorLessThanOrEqualTo(String value) {
            addCriterion("goods_color <=", value, "goodsColor");
            return (Criteria) this;
        }

        public Criteria andGoodsColorLike(String value) {
            addCriterion("goods_color like", value, "goodsColor");
            return (Criteria) this;
        }

        public Criteria andGoodsColorNotLike(String value) {
            addCriterion("goods_color not like", value, "goodsColor");
            return (Criteria) this;
        }

        public Criteria andGoodsColorIn(List<String> values) {
            addCriterion("goods_color in", values, "goodsColor");
            return (Criteria) this;
        }

        public Criteria andGoodsColorNotIn(List<String> values) {
            addCriterion("goods_color not in", values, "goodsColor");
            return (Criteria) this;
        }

        public Criteria andGoodsColorBetween(String value1, String value2) {
            addCriterion("goods_color between", value1, value2, "goodsColor");
            return (Criteria) this;
        }

        public Criteria andGoodsColorNotBetween(String value1, String value2) {
            addCriterion("goods_color not between", value1, value2, "goodsColor");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNull() {
            addCriterion("goods_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNotNull() {
            addCriterion("goods_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceEqualTo(Long value) {
            addCriterion("goods_price =", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotEqualTo(Long value) {
            addCriterion("goods_price <>", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThan(Long value) {
            addCriterion("goods_price >", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_price >=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThan(Long value) {
            addCriterion("goods_price <", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThanOrEqualTo(Long value) {
            addCriterion("goods_price <=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIn(List<Long> values) {
            addCriterion("goods_price in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotIn(List<Long> values) {
            addCriterion("goods_price not in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceBetween(Long value1, Long value2) {
            addCriterion("goods_price between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotBetween(Long value1, Long value2) {
            addCriterion("goods_price not between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andStatusReturnIsNull() {
            addCriterion("status_return is null");
            return (Criteria) this;
        }

        public Criteria andStatusReturnIsNotNull() {
            addCriterion("status_return is not null");
            return (Criteria) this;
        }

        public Criteria andStatusReturnEqualTo(String value) {
            addCriterion("status_return =", value, "statusReturn");
            return (Criteria) this;
        }

        public Criteria andStatusReturnNotEqualTo(String value) {
            addCriterion("status_return <>", value, "statusReturn");
            return (Criteria) this;
        }

        public Criteria andStatusReturnGreaterThan(String value) {
            addCriterion("status_return >", value, "statusReturn");
            return (Criteria) this;
        }

        public Criteria andStatusReturnGreaterThanOrEqualTo(String value) {
            addCriterion("status_return >=", value, "statusReturn");
            return (Criteria) this;
        }

        public Criteria andStatusReturnLessThan(String value) {
            addCriterion("status_return <", value, "statusReturn");
            return (Criteria) this;
        }

        public Criteria andStatusReturnLessThanOrEqualTo(String value) {
            addCriterion("status_return <=", value, "statusReturn");
            return (Criteria) this;
        }

        public Criteria andStatusReturnLike(String value) {
            addCriterion("status_return like", value, "statusReturn");
            return (Criteria) this;
        }

        public Criteria andStatusReturnNotLike(String value) {
            addCriterion("status_return not like", value, "statusReturn");
            return (Criteria) this;
        }

        public Criteria andStatusReturnIn(List<String> values) {
            addCriterion("status_return in", values, "statusReturn");
            return (Criteria) this;
        }

        public Criteria andStatusReturnNotIn(List<String> values) {
            addCriterion("status_return not in", values, "statusReturn");
            return (Criteria) this;
        }

        public Criteria andStatusReturnBetween(String value1, String value2) {
            addCriterion("status_return between", value1, value2, "statusReturn");
            return (Criteria) this;
        }

        public Criteria andStatusReturnNotBetween(String value1, String value2) {
            addCriterion("status_return not between", value1, value2, "statusReturn");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Integer value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Integer value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Integer value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Integer value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Integer value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Integer> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Integer> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Integer value1, Integer value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Integer value1, Integer value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andInboundIdIsNull() {
            addCriterion("inbound_id is null");
            return (Criteria) this;
        }

        public Criteria andInboundIdIsNotNull() {
            addCriterion("inbound_id is not null");
            return (Criteria) this;
        }

        public Criteria andInboundIdEqualTo(String value) {
            addCriterion("inbound_id =", value, "inboundId");
            return (Criteria) this;
        }

        public Criteria andInboundIdNotEqualTo(String value) {
            addCriterion("inbound_id <>", value, "inboundId");
            return (Criteria) this;
        }

        public Criteria andInboundIdGreaterThan(String value) {
            addCriterion("inbound_id >", value, "inboundId");
            return (Criteria) this;
        }

        public Criteria andInboundIdGreaterThanOrEqualTo(String value) {
            addCriterion("inbound_id >=", value, "inboundId");
            return (Criteria) this;
        }

        public Criteria andInboundIdLessThan(String value) {
            addCriterion("inbound_id <", value, "inboundId");
            return (Criteria) this;
        }

        public Criteria andInboundIdLessThanOrEqualTo(String value) {
            addCriterion("inbound_id <=", value, "inboundId");
            return (Criteria) this;
        }

        public Criteria andInboundIdLike(String value) {
            addCriterion("inbound_id like", value, "inboundId");
            return (Criteria) this;
        }

        public Criteria andInboundIdNotLike(String value) {
            addCriterion("inbound_id not like", value, "inboundId");
            return (Criteria) this;
        }

        public Criteria andInboundIdIn(List<String> values) {
            addCriterion("inbound_id in", values, "inboundId");
            return (Criteria) this;
        }

        public Criteria andInboundIdNotIn(List<String> values) {
            addCriterion("inbound_id not in", values, "inboundId");
            return (Criteria) this;
        }

        public Criteria andInboundIdBetween(String value1, String value2) {
            addCriterion("inbound_id between", value1, value2, "inboundId");
            return (Criteria) this;
        }

        public Criteria andInboundIdNotBetween(String value1, String value2) {
            addCriterion("inbound_id not between", value1, value2, "inboundId");
            return (Criteria) this;
        }

        public Criteria andComponentExchangeIsNull() {
            addCriterion("component_exchange is null");
            return (Criteria) this;
        }

        public Criteria andComponentExchangeIsNotNull() {
            addCriterion("component_exchange is not null");
            return (Criteria) this;
        }

        public Criteria andComponentExchangeEqualTo(String value) {
            addCriterion("component_exchange =", value, "componentExchange");
            return (Criteria) this;
        }

        public Criteria andComponentExchangeNotEqualTo(String value) {
            addCriterion("component_exchange <>", value, "componentExchange");
            return (Criteria) this;
        }

        public Criteria andComponentExchangeGreaterThan(String value) {
            addCriterion("component_exchange >", value, "componentExchange");
            return (Criteria) this;
        }

        public Criteria andComponentExchangeGreaterThanOrEqualTo(String value) {
            addCriterion("component_exchange >=", value, "componentExchange");
            return (Criteria) this;
        }

        public Criteria andComponentExchangeLessThan(String value) {
            addCriterion("component_exchange <", value, "componentExchange");
            return (Criteria) this;
        }

        public Criteria andComponentExchangeLessThanOrEqualTo(String value) {
            addCriterion("component_exchange <=", value, "componentExchange");
            return (Criteria) this;
        }

        public Criteria andComponentExchangeLike(String value) {
            addCriterion("component_exchange like", value, "componentExchange");
            return (Criteria) this;
        }

        public Criteria andComponentExchangeNotLike(String value) {
            addCriterion("component_exchange not like", value, "componentExchange");
            return (Criteria) this;
        }

        public Criteria andComponentExchangeIn(List<String> values) {
            addCriterion("component_exchange in", values, "componentExchange");
            return (Criteria) this;
        }

        public Criteria andComponentExchangeNotIn(List<String> values) {
            addCriterion("component_exchange not in", values, "componentExchange");
            return (Criteria) this;
        }

        public Criteria andComponentExchangeBetween(String value1, String value2) {
            addCriterion("component_exchange between", value1, value2, "componentExchange");
            return (Criteria) this;
        }

        public Criteria andComponentExchangeNotBetween(String value1, String value2) {
            addCriterion("component_exchange not between", value1, value2, "componentExchange");
            return (Criteria) this;
        }

        public Criteria andReasonReturnIsNull() {
            addCriterion("reason_return is null");
            return (Criteria) this;
        }

        public Criteria andReasonReturnIsNotNull() {
            addCriterion("reason_return is not null");
            return (Criteria) this;
        }

        public Criteria andReasonReturnEqualTo(String value) {
            addCriterion("reason_return =", value, "reasonReturn");
            return (Criteria) this;
        }

        public Criteria andReasonReturnNotEqualTo(String value) {
            addCriterion("reason_return <>", value, "reasonReturn");
            return (Criteria) this;
        }

        public Criteria andReasonReturnGreaterThan(String value) {
            addCriterion("reason_return >", value, "reasonReturn");
            return (Criteria) this;
        }

        public Criteria andReasonReturnGreaterThanOrEqualTo(String value) {
            addCriterion("reason_return >=", value, "reasonReturn");
            return (Criteria) this;
        }

        public Criteria andReasonReturnLessThan(String value) {
            addCriterion("reason_return <", value, "reasonReturn");
            return (Criteria) this;
        }

        public Criteria andReasonReturnLessThanOrEqualTo(String value) {
            addCriterion("reason_return <=", value, "reasonReturn");
            return (Criteria) this;
        }

        public Criteria andReasonReturnLike(String value) {
            addCriterion("reason_return like", value, "reasonReturn");
            return (Criteria) this;
        }

        public Criteria andReasonReturnNotLike(String value) {
            addCriterion("reason_return not like", value, "reasonReturn");
            return (Criteria) this;
        }

        public Criteria andReasonReturnIn(List<String> values) {
            addCriterion("reason_return in", values, "reasonReturn");
            return (Criteria) this;
        }

        public Criteria andReasonReturnNotIn(List<String> values) {
            addCriterion("reason_return not in", values, "reasonReturn");
            return (Criteria) this;
        }

        public Criteria andReasonReturnBetween(String value1, String value2) {
            addCriterion("reason_return between", value1, value2, "reasonReturn");
            return (Criteria) this;
        }

        public Criteria andReasonReturnNotBetween(String value1, String value2) {
            addCriterion("reason_return not between", value1, value2, "reasonReturn");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNull() {
            addCriterion("auditor is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNotNull() {
            addCriterion("auditor is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorEqualTo(String value) {
            addCriterion("auditor =", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotEqualTo(String value) {
            addCriterion("auditor <>", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThan(String value) {
            addCriterion("auditor >", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("auditor >=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThan(String value) {
            addCriterion("auditor <", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThanOrEqualTo(String value) {
            addCriterion("auditor <=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLike(String value) {
            addCriterion("auditor like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotLike(String value) {
            addCriterion("auditor not like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorIn(List<String> values) {
            addCriterion("auditor in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotIn(List<String> values) {
            addCriterion("auditor not in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorBetween(String value1, String value2) {
            addCriterion("auditor between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotBetween(String value1, String value2) {
            addCriterion("auditor not between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andOpinionApproverIsNull() {
            addCriterion("opinion_approver is null");
            return (Criteria) this;
        }

        public Criteria andOpinionApproverIsNotNull() {
            addCriterion("opinion_approver is not null");
            return (Criteria) this;
        }

        public Criteria andOpinionApproverEqualTo(String value) {
            addCriterion("opinion_approver =", value, "opinionApprover");
            return (Criteria) this;
        }

        public Criteria andOpinionApproverNotEqualTo(String value) {
            addCriterion("opinion_approver <>", value, "opinionApprover");
            return (Criteria) this;
        }

        public Criteria andOpinionApproverGreaterThan(String value) {
            addCriterion("opinion_approver >", value, "opinionApprover");
            return (Criteria) this;
        }

        public Criteria andOpinionApproverGreaterThanOrEqualTo(String value) {
            addCriterion("opinion_approver >=", value, "opinionApprover");
            return (Criteria) this;
        }

        public Criteria andOpinionApproverLessThan(String value) {
            addCriterion("opinion_approver <", value, "opinionApprover");
            return (Criteria) this;
        }

        public Criteria andOpinionApproverLessThanOrEqualTo(String value) {
            addCriterion("opinion_approver <=", value, "opinionApprover");
            return (Criteria) this;
        }

        public Criteria andOpinionApproverLike(String value) {
            addCriterion("opinion_approver like", value, "opinionApprover");
            return (Criteria) this;
        }

        public Criteria andOpinionApproverNotLike(String value) {
            addCriterion("opinion_approver not like", value, "opinionApprover");
            return (Criteria) this;
        }

        public Criteria andOpinionApproverIn(List<String> values) {
            addCriterion("opinion_approver in", values, "opinionApprover");
            return (Criteria) this;
        }

        public Criteria andOpinionApproverNotIn(List<String> values) {
            addCriterion("opinion_approver not in", values, "opinionApprover");
            return (Criteria) this;
        }

        public Criteria andOpinionApproverBetween(String value1, String value2) {
            addCriterion("opinion_approver between", value1, value2, "opinionApprover");
            return (Criteria) this;
        }

        public Criteria andOpinionApproverNotBetween(String value1, String value2) {
            addCriterion("opinion_approver not between", value1, value2, "opinionApprover");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNull() {
            addCriterion("audit_status is null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNotNull() {
            addCriterion("audit_status is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusEqualTo(String value) {
            addCriterion("audit_status =", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotEqualTo(String value) {
            addCriterion("audit_status <>", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThan(String value) {
            addCriterion("audit_status >", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThanOrEqualTo(String value) {
            addCriterion("audit_status >=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThan(String value) {
            addCriterion("audit_status <", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThanOrEqualTo(String value) {
            addCriterion("audit_status <=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLike(String value) {
            addCriterion("audit_status like", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotLike(String value) {
            addCriterion("audit_status not like", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIn(List<String> values) {
            addCriterion("audit_status in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotIn(List<String> values) {
            addCriterion("audit_status not in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBetween(String value1, String value2) {
            addCriterion("audit_status between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotBetween(String value1, String value2) {
            addCriterion("audit_status not between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andGmtAuditIsNull() {
            addCriterion("gmt_audit is null");
            return (Criteria) this;
        }

        public Criteria andGmtAuditIsNotNull() {
            addCriterion("gmt_audit is not null");
            return (Criteria) this;
        }

        public Criteria andGmtAuditEqualTo(Date value) {
            addCriterion("gmt_audit =", value, "gmtAudit");
            return (Criteria) this;
        }

        public Criteria andGmtAuditNotEqualTo(Date value) {
            addCriterion("gmt_audit <>", value, "gmtAudit");
            return (Criteria) this;
        }

        public Criteria andGmtAuditGreaterThan(Date value) {
            addCriterion("gmt_audit >", value, "gmtAudit");
            return (Criteria) this;
        }

        public Criteria andGmtAuditGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_audit >=", value, "gmtAudit");
            return (Criteria) this;
        }

        public Criteria andGmtAuditLessThan(Date value) {
            addCriterion("gmt_audit <", value, "gmtAudit");
            return (Criteria) this;
        }

        public Criteria andGmtAuditLessThanOrEqualTo(Date value) {
            addCriterion("gmt_audit <=", value, "gmtAudit");
            return (Criteria) this;
        }

        public Criteria andGmtAuditIn(List<Date> values) {
            addCriterion("gmt_audit in", values, "gmtAudit");
            return (Criteria) this;
        }

        public Criteria andGmtAuditNotIn(List<Date> values) {
            addCriterion("gmt_audit not in", values, "gmtAudit");
            return (Criteria) this;
        }

        public Criteria andGmtAuditBetween(Date value1, Date value2) {
            addCriterion("gmt_audit between", value1, value2, "gmtAudit");
            return (Criteria) this;
        }

        public Criteria andGmtAuditNotBetween(Date value1, Date value2) {
            addCriterion("gmt_audit not between", value1, value2, "gmtAudit");
            return (Criteria) this;
        }

        public Criteria andDocStatusIsNull() {
            addCriterion("doc_status is null");
            return (Criteria) this;
        }

        public Criteria andDocStatusIsNotNull() {
            addCriterion("doc_status is not null");
            return (Criteria) this;
        }

        public Criteria andDocStatusEqualTo(String value) {
            addCriterion("doc_status =", value, "docStatus");
            return (Criteria) this;
        }

        public Criteria andDocStatusNotEqualTo(String value) {
            addCriterion("doc_status <>", value, "docStatus");
            return (Criteria) this;
        }

        public Criteria andDocStatusGreaterThan(String value) {
            addCriterion("doc_status >", value, "docStatus");
            return (Criteria) this;
        }

        public Criteria andDocStatusGreaterThanOrEqualTo(String value) {
            addCriterion("doc_status >=", value, "docStatus");
            return (Criteria) this;
        }

        public Criteria andDocStatusLessThan(String value) {
            addCriterion("doc_status <", value, "docStatus");
            return (Criteria) this;
        }

        public Criteria andDocStatusLessThanOrEqualTo(String value) {
            addCriterion("doc_status <=", value, "docStatus");
            return (Criteria) this;
        }

        public Criteria andDocStatusLike(String value) {
            addCriterion("doc_status like", value, "docStatus");
            return (Criteria) this;
        }

        public Criteria andDocStatusNotLike(String value) {
            addCriterion("doc_status not like", value, "docStatus");
            return (Criteria) this;
        }

        public Criteria andDocStatusIn(List<String> values) {
            addCriterion("doc_status in", values, "docStatus");
            return (Criteria) this;
        }

        public Criteria andDocStatusNotIn(List<String> values) {
            addCriterion("doc_status not in", values, "docStatus");
            return (Criteria) this;
        }

        public Criteria andDocStatusBetween(String value1, String value2) {
            addCriterion("doc_status between", value1, value2, "docStatus");
            return (Criteria) this;
        }

        public Criteria andDocStatusNotBetween(String value1, String value2) {
            addCriterion("doc_status not between", value1, value2, "docStatus");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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
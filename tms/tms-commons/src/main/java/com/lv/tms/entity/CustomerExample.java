package com.lv.tms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        public Criteria andCustomerNameIsNull() {
            addCriterion("customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customer_name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customer_name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customer_name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customer_name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customer_name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customer_name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customer_name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customer_name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customer_name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardIsNull() {
            addCriterion("customer_id_card is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardIsNotNull() {
            addCriterion("customer_id_card is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardEqualTo(String value) {
            addCriterion("customer_id_card =", value, "customerIdCard");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardNotEqualTo(String value) {
            addCriterion("customer_id_card <>", value, "customerIdCard");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardGreaterThan(String value) {
            addCriterion("customer_id_card >", value, "customerIdCard");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("customer_id_card >=", value, "customerIdCard");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardLessThan(String value) {
            addCriterion("customer_id_card <", value, "customerIdCard");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardLessThanOrEqualTo(String value) {
            addCriterion("customer_id_card <=", value, "customerIdCard");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardLike(String value) {
            addCriterion("customer_id_card like", value, "customerIdCard");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardNotLike(String value) {
            addCriterion("customer_id_card not like", value, "customerIdCard");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardIn(List<String> values) {
            addCriterion("customer_id_card in", values, "customerIdCard");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardNotIn(List<String> values) {
            addCriterion("customer_id_card not in", values, "customerIdCard");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardBetween(String value1, String value2) {
            addCriterion("customer_id_card between", value1, value2, "customerIdCard");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardNotBetween(String value1, String value2) {
            addCriterion("customer_id_card not between", value1, value2, "customerIdCard");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardPhotoIsNull() {
            addCriterion("customer_id_card_photo is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardPhotoIsNotNull() {
            addCriterion("customer_id_card_photo is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardPhotoEqualTo(String value) {
            addCriterion("customer_id_card_photo =", value, "customerIdCardPhoto");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardPhotoNotEqualTo(String value) {
            addCriterion("customer_id_card_photo <>", value, "customerIdCardPhoto");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardPhotoGreaterThan(String value) {
            addCriterion("customer_id_card_photo >", value, "customerIdCardPhoto");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("customer_id_card_photo >=", value, "customerIdCardPhoto");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardPhotoLessThan(String value) {
            addCriterion("customer_id_card_photo <", value, "customerIdCardPhoto");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardPhotoLessThanOrEqualTo(String value) {
            addCriterion("customer_id_card_photo <=", value, "customerIdCardPhoto");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardPhotoLike(String value) {
            addCriterion("customer_id_card_photo like", value, "customerIdCardPhoto");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardPhotoNotLike(String value) {
            addCriterion("customer_id_card_photo not like", value, "customerIdCardPhoto");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardPhotoIn(List<String> values) {
            addCriterion("customer_id_card_photo in", values, "customerIdCardPhoto");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardPhotoNotIn(List<String> values) {
            addCriterion("customer_id_card_photo not in", values, "customerIdCardPhoto");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardPhotoBetween(String value1, String value2) {
            addCriterion("customer_id_card_photo between", value1, value2, "customerIdCardPhoto");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardPhotoNotBetween(String value1, String value2) {
            addCriterion("customer_id_card_photo not between", value1, value2, "customerIdCardPhoto");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardPhotoBackIsNull() {
            addCriterion("customer_id_card_photo_back is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardPhotoBackIsNotNull() {
            addCriterion("customer_id_card_photo_back is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardPhotoBackEqualTo(String value) {
            addCriterion("customer_id_card_photo_back =", value, "customerIdCardPhotoBack");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardPhotoBackNotEqualTo(String value) {
            addCriterion("customer_id_card_photo_back <>", value, "customerIdCardPhotoBack");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardPhotoBackGreaterThan(String value) {
            addCriterion("customer_id_card_photo_back >", value, "customerIdCardPhotoBack");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardPhotoBackGreaterThanOrEqualTo(String value) {
            addCriterion("customer_id_card_photo_back >=", value, "customerIdCardPhotoBack");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardPhotoBackLessThan(String value) {
            addCriterion("customer_id_card_photo_back <", value, "customerIdCardPhotoBack");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardPhotoBackLessThanOrEqualTo(String value) {
            addCriterion("customer_id_card_photo_back <=", value, "customerIdCardPhotoBack");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardPhotoBackLike(String value) {
            addCriterion("customer_id_card_photo_back like", value, "customerIdCardPhotoBack");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardPhotoBackNotLike(String value) {
            addCriterion("customer_id_card_photo_back not like", value, "customerIdCardPhotoBack");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardPhotoBackIn(List<String> values) {
            addCriterion("customer_id_card_photo_back in", values, "customerIdCardPhotoBack");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardPhotoBackNotIn(List<String> values) {
            addCriterion("customer_id_card_photo_back not in", values, "customerIdCardPhotoBack");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardPhotoBackBetween(String value1, String value2) {
            addCriterion("customer_id_card_photo_back between", value1, value2, "customerIdCardPhotoBack");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardPhotoBackNotBetween(String value1, String value2) {
            addCriterion("customer_id_card_photo_back not between", value1, value2, "customerIdCardPhotoBack");
            return (Criteria) this;
        }

        public Criteria andCustomerTelIsNull() {
            addCriterion("customer_tel is null");
            return (Criteria) this;
        }

        public Criteria andCustomerTelIsNotNull() {
            addCriterion("customer_tel is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerTelEqualTo(String value) {
            addCriterion("customer_tel =", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelNotEqualTo(String value) {
            addCriterion("customer_tel <>", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelGreaterThan(String value) {
            addCriterion("customer_tel >", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelGreaterThanOrEqualTo(String value) {
            addCriterion("customer_tel >=", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelLessThan(String value) {
            addCriterion("customer_tel <", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelLessThanOrEqualTo(String value) {
            addCriterion("customer_tel <=", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelLike(String value) {
            addCriterion("customer_tel like", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelNotLike(String value) {
            addCriterion("customer_tel not like", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelIn(List<String> values) {
            addCriterion("customer_tel in", values, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelNotIn(List<String> values) {
            addCriterion("customer_tel not in", values, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelBetween(String value1, String value2) {
            addCriterion("customer_tel between", value1, value2, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelNotBetween(String value1, String value2) {
            addCriterion("customer_tel not between", value1, value2, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressIsNull() {
            addCriterion("customer_address is null");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressIsNotNull() {
            addCriterion("customer_address is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressEqualTo(String value) {
            addCriterion("customer_address =", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressNotEqualTo(String value) {
            addCriterion("customer_address <>", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressGreaterThan(String value) {
            addCriterion("customer_address >", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressGreaterThanOrEqualTo(String value) {
            addCriterion("customer_address >=", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressLessThan(String value) {
            addCriterion("customer_address <", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressLessThanOrEqualTo(String value) {
            addCriterion("customer_address <=", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressLike(String value) {
            addCriterion("customer_address like", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressNotLike(String value) {
            addCriterion("customer_address not like", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressIn(List<String> values) {
            addCriterion("customer_address in", values, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressNotIn(List<String> values) {
            addCriterion("customer_address not in", values, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressBetween(String value1, String value2) {
            addCriterion("customer_address between", value1, value2, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressNotBetween(String value1, String value2) {
            addCriterion("customer_address not between", value1, value2, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerJobTitleIsNull() {
            addCriterion("customer_job_title is null");
            return (Criteria) this;
        }

        public Criteria andCustomerJobTitleIsNotNull() {
            addCriterion("customer_job_title is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerJobTitleEqualTo(String value) {
            addCriterion("customer_job_title =", value, "customerJobTitle");
            return (Criteria) this;
        }

        public Criteria andCustomerJobTitleNotEqualTo(String value) {
            addCriterion("customer_job_title <>", value, "customerJobTitle");
            return (Criteria) this;
        }

        public Criteria andCustomerJobTitleGreaterThan(String value) {
            addCriterion("customer_job_title >", value, "customerJobTitle");
            return (Criteria) this;
        }

        public Criteria andCustomerJobTitleGreaterThanOrEqualTo(String value) {
            addCriterion("customer_job_title >=", value, "customerJobTitle");
            return (Criteria) this;
        }

        public Criteria andCustomerJobTitleLessThan(String value) {
            addCriterion("customer_job_title <", value, "customerJobTitle");
            return (Criteria) this;
        }

        public Criteria andCustomerJobTitleLessThanOrEqualTo(String value) {
            addCriterion("customer_job_title <=", value, "customerJobTitle");
            return (Criteria) this;
        }

        public Criteria andCustomerJobTitleLike(String value) {
            addCriterion("customer_job_title like", value, "customerJobTitle");
            return (Criteria) this;
        }

        public Criteria andCustomerJobTitleNotLike(String value) {
            addCriterion("customer_job_title not like", value, "customerJobTitle");
            return (Criteria) this;
        }

        public Criteria andCustomerJobTitleIn(List<String> values) {
            addCriterion("customer_job_title in", values, "customerJobTitle");
            return (Criteria) this;
        }

        public Criteria andCustomerJobTitleNotIn(List<String> values) {
            addCriterion("customer_job_title not in", values, "customerJobTitle");
            return (Criteria) this;
        }

        public Criteria andCustomerJobTitleBetween(String value1, String value2) {
            addCriterion("customer_job_title between", value1, value2, "customerJobTitle");
            return (Criteria) this;
        }

        public Criteria andCustomerJobTitleNotBetween(String value1, String value2) {
            addCriterion("customer_job_title not between", value1, value2, "customerJobTitle");
            return (Criteria) this;
        }

        public Criteria andCustomerAgeIsNull() {
            addCriterion("customer_age is null");
            return (Criteria) this;
        }

        public Criteria andCustomerAgeIsNotNull() {
            addCriterion("customer_age is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerAgeEqualTo(String value) {
            addCriterion("customer_age =", value, "customerAge");
            return (Criteria) this;
        }

        public Criteria andCustomerAgeNotEqualTo(String value) {
            addCriterion("customer_age <>", value, "customerAge");
            return (Criteria) this;
        }

        public Criteria andCustomerAgeGreaterThan(String value) {
            addCriterion("customer_age >", value, "customerAge");
            return (Criteria) this;
        }

        public Criteria andCustomerAgeGreaterThanOrEqualTo(String value) {
            addCriterion("customer_age >=", value, "customerAge");
            return (Criteria) this;
        }

        public Criteria andCustomerAgeLessThan(String value) {
            addCriterion("customer_age <", value, "customerAge");
            return (Criteria) this;
        }

        public Criteria andCustomerAgeLessThanOrEqualTo(String value) {
            addCriterion("customer_age <=", value, "customerAge");
            return (Criteria) this;
        }

        public Criteria andCustomerAgeLike(String value) {
            addCriterion("customer_age like", value, "customerAge");
            return (Criteria) this;
        }

        public Criteria andCustomerAgeNotLike(String value) {
            addCriterion("customer_age not like", value, "customerAge");
            return (Criteria) this;
        }

        public Criteria andCustomerAgeIn(List<String> values) {
            addCriterion("customer_age in", values, "customerAge");
            return (Criteria) this;
        }

        public Criteria andCustomerAgeNotIn(List<String> values) {
            addCriterion("customer_age not in", values, "customerAge");
            return (Criteria) this;
        }

        public Criteria andCustomerAgeBetween(String value1, String value2) {
            addCriterion("customer_age between", value1, value2, "customerAge");
            return (Criteria) this;
        }

        public Criteria andCustomerAgeNotBetween(String value1, String value2) {
            addCriterion("customer_age not between", value1, value2, "customerAge");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelIsNull() {
            addCriterion("customer_level is null");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelIsNotNull() {
            addCriterion("customer_level is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelEqualTo(String value) {
            addCriterion("customer_level =", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelNotEqualTo(String value) {
            addCriterion("customer_level <>", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelGreaterThan(String value) {
            addCriterion("customer_level >", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelGreaterThanOrEqualTo(String value) {
            addCriterion("customer_level >=", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelLessThan(String value) {
            addCriterion("customer_level <", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelLessThanOrEqualTo(String value) {
            addCriterion("customer_level <=", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelLike(String value) {
            addCriterion("customer_level like", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelNotLike(String value) {
            addCriterion("customer_level not like", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelIn(List<String> values) {
            addCriterion("customer_level in", values, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelNotIn(List<String> values) {
            addCriterion("customer_level not in", values, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelBetween(String value1, String value2) {
            addCriterion("customer_level between", value1, value2, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelNotBetween(String value1, String value2) {
            addCriterion("customer_level not between", value1, value2, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceIsNull() {
            addCriterion("customer_source is null");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceIsNotNull() {
            addCriterion("customer_source is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceEqualTo(String value) {
            addCriterion("customer_source =", value, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceNotEqualTo(String value) {
            addCriterion("customer_source <>", value, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceGreaterThan(String value) {
            addCriterion("customer_source >", value, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceGreaterThanOrEqualTo(String value) {
            addCriterion("customer_source >=", value, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceLessThan(String value) {
            addCriterion("customer_source <", value, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceLessThanOrEqualTo(String value) {
            addCriterion("customer_source <=", value, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceLike(String value) {
            addCriterion("customer_source like", value, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceNotLike(String value) {
            addCriterion("customer_source not like", value, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceIn(List<String> values) {
            addCriterion("customer_source in", values, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceNotIn(List<String> values) {
            addCriterion("customer_source not in", values, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceBetween(String value1, String value2) {
            addCriterion("customer_source between", value1, value2, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceNotBetween(String value1, String value2) {
            addCriterion("customer_source not between", value1, value2, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerTradeIsNull() {
            addCriterion("customer_trade is null");
            return (Criteria) this;
        }

        public Criteria andCustomerTradeIsNotNull() {
            addCriterion("customer_trade is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerTradeEqualTo(String value) {
            addCriterion("customer_trade =", value, "customerTrade");
            return (Criteria) this;
        }

        public Criteria andCustomerTradeNotEqualTo(String value) {
            addCriterion("customer_trade <>", value, "customerTrade");
            return (Criteria) this;
        }

        public Criteria andCustomerTradeGreaterThan(String value) {
            addCriterion("customer_trade >", value, "customerTrade");
            return (Criteria) this;
        }

        public Criteria andCustomerTradeGreaterThanOrEqualTo(String value) {
            addCriterion("customer_trade >=", value, "customerTrade");
            return (Criteria) this;
        }

        public Criteria andCustomerTradeLessThan(String value) {
            addCriterion("customer_trade <", value, "customerTrade");
            return (Criteria) this;
        }

        public Criteria andCustomerTradeLessThanOrEqualTo(String value) {
            addCriterion("customer_trade <=", value, "customerTrade");
            return (Criteria) this;
        }

        public Criteria andCustomerTradeLike(String value) {
            addCriterion("customer_trade like", value, "customerTrade");
            return (Criteria) this;
        }

        public Criteria andCustomerTradeNotLike(String value) {
            addCriterion("customer_trade not like", value, "customerTrade");
            return (Criteria) this;
        }

        public Criteria andCustomerTradeIn(List<String> values) {
            addCriterion("customer_trade in", values, "customerTrade");
            return (Criteria) this;
        }

        public Criteria andCustomerTradeNotIn(List<String> values) {
            addCriterion("customer_trade not in", values, "customerTrade");
            return (Criteria) this;
        }

        public Criteria andCustomerTradeBetween(String value1, String value2) {
            addCriterion("customer_trade between", value1, value2, "customerTrade");
            return (Criteria) this;
        }

        public Criteria andCustomerTradeNotBetween(String value1, String value2) {
            addCriterion("customer_trade not between", value1, value2, "customerTrade");
            return (Criteria) this;
        }

        public Criteria andCustomerReminderIsNull() {
            addCriterion("customer_reminder is null");
            return (Criteria) this;
        }

        public Criteria andCustomerReminderIsNotNull() {
            addCriterion("customer_reminder is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerReminderEqualTo(String value) {
            addCriterion("customer_reminder =", value, "customerReminder");
            return (Criteria) this;
        }

        public Criteria andCustomerReminderNotEqualTo(String value) {
            addCriterion("customer_reminder <>", value, "customerReminder");
            return (Criteria) this;
        }

        public Criteria andCustomerReminderGreaterThan(String value) {
            addCriterion("customer_reminder >", value, "customerReminder");
            return (Criteria) this;
        }

        public Criteria andCustomerReminderGreaterThanOrEqualTo(String value) {
            addCriterion("customer_reminder >=", value, "customerReminder");
            return (Criteria) this;
        }

        public Criteria andCustomerReminderLessThan(String value) {
            addCriterion("customer_reminder <", value, "customerReminder");
            return (Criteria) this;
        }

        public Criteria andCustomerReminderLessThanOrEqualTo(String value) {
            addCriterion("customer_reminder <=", value, "customerReminder");
            return (Criteria) this;
        }

        public Criteria andCustomerReminderLike(String value) {
            addCriterion("customer_reminder like", value, "customerReminder");
            return (Criteria) this;
        }

        public Criteria andCustomerReminderNotLike(String value) {
            addCriterion("customer_reminder not like", value, "customerReminder");
            return (Criteria) this;
        }

        public Criteria andCustomerReminderIn(List<String> values) {
            addCriterion("customer_reminder in", values, "customerReminder");
            return (Criteria) this;
        }

        public Criteria andCustomerReminderNotIn(List<String> values) {
            addCriterion("customer_reminder not in", values, "customerReminder");
            return (Criteria) this;
        }

        public Criteria andCustomerReminderBetween(String value1, String value2) {
            addCriterion("customer_reminder between", value1, value2, "customerReminder");
            return (Criteria) this;
        }

        public Criteria andCustomerReminderNotBetween(String value1, String value2) {
            addCriterion("customer_reminder not between", value1, value2, "customerReminder");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderIsNull() {
            addCriterion("customer_gender is null");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderIsNotNull() {
            addCriterion("customer_gender is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderEqualTo(String value) {
            addCriterion("customer_gender =", value, "customerGender");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderNotEqualTo(String value) {
            addCriterion("customer_gender <>", value, "customerGender");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderGreaterThan(String value) {
            addCriterion("customer_gender >", value, "customerGender");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderGreaterThanOrEqualTo(String value) {
            addCriterion("customer_gender >=", value, "customerGender");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderLessThan(String value) {
            addCriterion("customer_gender <", value, "customerGender");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderLessThanOrEqualTo(String value) {
            addCriterion("customer_gender <=", value, "customerGender");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderLike(String value) {
            addCriterion("customer_gender like", value, "customerGender");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderNotLike(String value) {
            addCriterion("customer_gender not like", value, "customerGender");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderIn(List<String> values) {
            addCriterion("customer_gender in", values, "customerGender");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderNotIn(List<String> values) {
            addCriterion("customer_gender not in", values, "customerGender");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderBetween(String value1, String value2) {
            addCriterion("customer_gender between", value1, value2, "customerGender");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderNotBetween(String value1, String value2) {
            addCriterion("customer_gender not between", value1, value2, "customerGender");
            return (Criteria) this;
        }

        public Criteria andCustomerTicketIdIsNull() {
            addCriterion("customer_ticket_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerTicketIdIsNotNull() {
            addCriterion("customer_ticket_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerTicketIdEqualTo(Integer value) {
            addCriterion("customer_ticket_id =", value, "customerTicketId");
            return (Criteria) this;
        }

        public Criteria andCustomerTicketIdNotEqualTo(Integer value) {
            addCriterion("customer_ticket_id <>", value, "customerTicketId");
            return (Criteria) this;
        }

        public Criteria andCustomerTicketIdGreaterThan(Integer value) {
            addCriterion("customer_ticket_id >", value, "customerTicketId");
            return (Criteria) this;
        }

        public Criteria andCustomerTicketIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_ticket_id >=", value, "customerTicketId");
            return (Criteria) this;
        }

        public Criteria andCustomerTicketIdLessThan(Integer value) {
            addCriterion("customer_ticket_id <", value, "customerTicketId");
            return (Criteria) this;
        }

        public Criteria andCustomerTicketIdLessThanOrEqualTo(Integer value) {
            addCriterion("customer_ticket_id <=", value, "customerTicketId");
            return (Criteria) this;
        }

        public Criteria andCustomerTicketIdIn(List<Integer> values) {
            addCriterion("customer_ticket_id in", values, "customerTicketId");
            return (Criteria) this;
        }

        public Criteria andCustomerTicketIdNotIn(List<Integer> values) {
            addCriterion("customer_ticket_id not in", values, "customerTicketId");
            return (Criteria) this;
        }

        public Criteria andCustomerTicketIdBetween(Integer value1, Integer value2) {
            addCriterion("customer_ticket_id between", value1, value2, "customerTicketId");
            return (Criteria) this;
        }

        public Criteria andCustomerTicketIdNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_ticket_id not between", value1, value2, "customerTicketId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNull() {
            addCriterion("employee_id is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNotNull() {
            addCriterion("employee_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdEqualTo(Integer value) {
            addCriterion("employee_id =", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotEqualTo(Integer value) {
            addCriterion("employee_id <>", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThan(Integer value) {
            addCriterion("employee_id >", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("employee_id >=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThan(Integer value) {
            addCriterion("employee_id <", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThanOrEqualTo(Integer value) {
            addCriterion("employee_id <=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIn(List<Integer> values) {
            addCriterion("employee_id in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotIn(List<Integer> values) {
            addCriterion("employee_id not in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdBetween(Integer value1, Integer value2) {
            addCriterion("employee_id between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("employee_id not between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     */
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
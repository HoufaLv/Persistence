package com.lv.tms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StoreAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoreAccountExample() {
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

        public Criteria andStoreAccountIsNull() {
            addCriterion("store_account is null");
            return (Criteria) this;
        }

        public Criteria andStoreAccountIsNotNull() {
            addCriterion("store_account is not null");
            return (Criteria) this;
        }

        public Criteria andStoreAccountEqualTo(String value) {
            addCriterion("store_account =", value, "storeAccount");
            return (Criteria) this;
        }

        public Criteria andStoreAccountNotEqualTo(String value) {
            addCriterion("store_account <>", value, "storeAccount");
            return (Criteria) this;
        }

        public Criteria andStoreAccountGreaterThan(String value) {
            addCriterion("store_account >", value, "storeAccount");
            return (Criteria) this;
        }

        public Criteria andStoreAccountGreaterThanOrEqualTo(String value) {
            addCriterion("store_account >=", value, "storeAccount");
            return (Criteria) this;
        }

        public Criteria andStoreAccountLessThan(String value) {
            addCriterion("store_account <", value, "storeAccount");
            return (Criteria) this;
        }

        public Criteria andStoreAccountLessThanOrEqualTo(String value) {
            addCriterion("store_account <=", value, "storeAccount");
            return (Criteria) this;
        }

        public Criteria andStoreAccountLike(String value) {
            addCriterion("store_account like", value, "storeAccount");
            return (Criteria) this;
        }

        public Criteria andStoreAccountNotLike(String value) {
            addCriterion("store_account not like", value, "storeAccount");
            return (Criteria) this;
        }

        public Criteria andStoreAccountIn(List<String> values) {
            addCriterion("store_account in", values, "storeAccount");
            return (Criteria) this;
        }

        public Criteria andStoreAccountNotIn(List<String> values) {
            addCriterion("store_account not in", values, "storeAccount");
            return (Criteria) this;
        }

        public Criteria andStoreAccountBetween(String value1, String value2) {
            addCriterion("store_account between", value1, value2, "storeAccount");
            return (Criteria) this;
        }

        public Criteria andStoreAccountNotBetween(String value1, String value2) {
            addCriterion("store_account not between", value1, value2, "storeAccount");
            return (Criteria) this;
        }

        public Criteria andStorePasswordIsNull() {
            addCriterion("store_password is null");
            return (Criteria) this;
        }

        public Criteria andStorePasswordIsNotNull() {
            addCriterion("store_password is not null");
            return (Criteria) this;
        }

        public Criteria andStorePasswordEqualTo(String value) {
            addCriterion("store_password =", value, "storePassword");
            return (Criteria) this;
        }

        public Criteria andStorePasswordNotEqualTo(String value) {
            addCriterion("store_password <>", value, "storePassword");
            return (Criteria) this;
        }

        public Criteria andStorePasswordGreaterThan(String value) {
            addCriterion("store_password >", value, "storePassword");
            return (Criteria) this;
        }

        public Criteria andStorePasswordGreaterThanOrEqualTo(String value) {
            addCriterion("store_password >=", value, "storePassword");
            return (Criteria) this;
        }

        public Criteria andStorePasswordLessThan(String value) {
            addCriterion("store_password <", value, "storePassword");
            return (Criteria) this;
        }

        public Criteria andStorePasswordLessThanOrEqualTo(String value) {
            addCriterion("store_password <=", value, "storePassword");
            return (Criteria) this;
        }

        public Criteria andStorePasswordLike(String value) {
            addCriterion("store_password like", value, "storePassword");
            return (Criteria) this;
        }

        public Criteria andStorePasswordNotLike(String value) {
            addCriterion("store_password not like", value, "storePassword");
            return (Criteria) this;
        }

        public Criteria andStorePasswordIn(List<String> values) {
            addCriterion("store_password in", values, "storePassword");
            return (Criteria) this;
        }

        public Criteria andStorePasswordNotIn(List<String> values) {
            addCriterion("store_password not in", values, "storePassword");
            return (Criteria) this;
        }

        public Criteria andStorePasswordBetween(String value1, String value2) {
            addCriterion("store_password between", value1, value2, "storePassword");
            return (Criteria) this;
        }

        public Criteria andStorePasswordNotBetween(String value1, String value2) {
            addCriterion("store_password not between", value1, value2, "storePassword");
            return (Criteria) this;
        }

        public Criteria andStoreCreateTimeIsNull() {
            addCriterion("store_create_time is null");
            return (Criteria) this;
        }

        public Criteria andStoreCreateTimeIsNotNull() {
            addCriterion("store_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andStoreCreateTimeEqualTo(Date value) {
            addCriterion("store_create_time =", value, "storeCreateTime");
            return (Criteria) this;
        }

        public Criteria andStoreCreateTimeNotEqualTo(Date value) {
            addCriterion("store_create_time <>", value, "storeCreateTime");
            return (Criteria) this;
        }

        public Criteria andStoreCreateTimeGreaterThan(Date value) {
            addCriterion("store_create_time >", value, "storeCreateTime");
            return (Criteria) this;
        }

        public Criteria andStoreCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("store_create_time >=", value, "storeCreateTime");
            return (Criteria) this;
        }

        public Criteria andStoreCreateTimeLessThan(Date value) {
            addCriterion("store_create_time <", value, "storeCreateTime");
            return (Criteria) this;
        }

        public Criteria andStoreCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("store_create_time <=", value, "storeCreateTime");
            return (Criteria) this;
        }

        public Criteria andStoreCreateTimeIn(List<Date> values) {
            addCriterion("store_create_time in", values, "storeCreateTime");
            return (Criteria) this;
        }

        public Criteria andStoreCreateTimeNotIn(List<Date> values) {
            addCriterion("store_create_time not in", values, "storeCreateTime");
            return (Criteria) this;
        }

        public Criteria andStoreCreateTimeBetween(Date value1, Date value2) {
            addCriterion("store_create_time between", value1, value2, "storeCreateTime");
            return (Criteria) this;
        }

        public Criteria andStoreCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("store_create_time not between", value1, value2, "storeCreateTime");
            return (Criteria) this;
        }

        public Criteria andStoreUpdateTimeIsNull() {
            addCriterion("store_update_time is null");
            return (Criteria) this;
        }

        public Criteria andStoreUpdateTimeIsNotNull() {
            addCriterion("store_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andStoreUpdateTimeEqualTo(Date value) {
            addCriterion("store_update_time =", value, "storeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStoreUpdateTimeNotEqualTo(Date value) {
            addCriterion("store_update_time <>", value, "storeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStoreUpdateTimeGreaterThan(Date value) {
            addCriterion("store_update_time >", value, "storeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStoreUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("store_update_time >=", value, "storeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStoreUpdateTimeLessThan(Date value) {
            addCriterion("store_update_time <", value, "storeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStoreUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("store_update_time <=", value, "storeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStoreUpdateTimeIn(List<Date> values) {
            addCriterion("store_update_time in", values, "storeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStoreUpdateTimeNotIn(List<Date> values) {
            addCriterion("store_update_time not in", values, "storeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStoreUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("store_update_time between", value1, value2, "storeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStoreUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("store_update_time not between", value1, value2, "storeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStoreStateIsNull() {
            addCriterion("store_state is null");
            return (Criteria) this;
        }

        public Criteria andStoreStateIsNotNull() {
            addCriterion("store_state is not null");
            return (Criteria) this;
        }

        public Criteria andStoreStateEqualTo(String value) {
            addCriterion("store_state =", value, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateNotEqualTo(String value) {
            addCriterion("store_state <>", value, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateGreaterThan(String value) {
            addCriterion("store_state >", value, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateGreaterThanOrEqualTo(String value) {
            addCriterion("store_state >=", value, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateLessThan(String value) {
            addCriterion("store_state <", value, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateLessThanOrEqualTo(String value) {
            addCriterion("store_state <=", value, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateLike(String value) {
            addCriterion("store_state like", value, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateNotLike(String value) {
            addCriterion("store_state not like", value, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateIn(List<String> values) {
            addCriterion("store_state in", values, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateNotIn(List<String> values) {
            addCriterion("store_state not in", values, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateBetween(String value1, String value2) {
            addCriterion("store_state between", value1, value2, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateNotBetween(String value1, String value2) {
            addCriterion("store_state not between", value1, value2, "storeState");
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
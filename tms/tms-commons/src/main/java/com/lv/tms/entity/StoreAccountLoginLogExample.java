package com.lv.tms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StoreAccountLoginLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoreAccountLoginLogExample() {
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

        public Criteria andStoreAccountLoginIpIsNull() {
            addCriterion("store_account_login_ip is null");
            return (Criteria) this;
        }

        public Criteria andStoreAccountLoginIpIsNotNull() {
            addCriterion("store_account_login_ip is not null");
            return (Criteria) this;
        }

        public Criteria andStoreAccountLoginIpEqualTo(String value) {
            addCriterion("store_account_login_ip =", value, "storeAccountLoginIp");
            return (Criteria) this;
        }

        public Criteria andStoreAccountLoginIpNotEqualTo(String value) {
            addCriterion("store_account_login_ip <>", value, "storeAccountLoginIp");
            return (Criteria) this;
        }

        public Criteria andStoreAccountLoginIpGreaterThan(String value) {
            addCriterion("store_account_login_ip >", value, "storeAccountLoginIp");
            return (Criteria) this;
        }

        public Criteria andStoreAccountLoginIpGreaterThanOrEqualTo(String value) {
            addCriterion("store_account_login_ip >=", value, "storeAccountLoginIp");
            return (Criteria) this;
        }

        public Criteria andStoreAccountLoginIpLessThan(String value) {
            addCriterion("store_account_login_ip <", value, "storeAccountLoginIp");
            return (Criteria) this;
        }

        public Criteria andStoreAccountLoginIpLessThanOrEqualTo(String value) {
            addCriterion("store_account_login_ip <=", value, "storeAccountLoginIp");
            return (Criteria) this;
        }

        public Criteria andStoreAccountLoginIpLike(String value) {
            addCriterion("store_account_login_ip like", value, "storeAccountLoginIp");
            return (Criteria) this;
        }

        public Criteria andStoreAccountLoginIpNotLike(String value) {
            addCriterion("store_account_login_ip not like", value, "storeAccountLoginIp");
            return (Criteria) this;
        }

        public Criteria andStoreAccountLoginIpIn(List<String> values) {
            addCriterion("store_account_login_ip in", values, "storeAccountLoginIp");
            return (Criteria) this;
        }

        public Criteria andStoreAccountLoginIpNotIn(List<String> values) {
            addCriterion("store_account_login_ip not in", values, "storeAccountLoginIp");
            return (Criteria) this;
        }

        public Criteria andStoreAccountLoginIpBetween(String value1, String value2) {
            addCriterion("store_account_login_ip between", value1, value2, "storeAccountLoginIp");
            return (Criteria) this;
        }

        public Criteria andStoreAccountLoginIpNotBetween(String value1, String value2) {
            addCriterion("store_account_login_ip not between", value1, value2, "storeAccountLoginIp");
            return (Criteria) this;
        }

        public Criteria andStoreAccountLoginTimeIsNull() {
            addCriterion("store_account_login_time is null");
            return (Criteria) this;
        }

        public Criteria andStoreAccountLoginTimeIsNotNull() {
            addCriterion("store_account_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andStoreAccountLoginTimeEqualTo(Date value) {
            addCriterion("store_account_login_time =", value, "storeAccountLoginTime");
            return (Criteria) this;
        }

        public Criteria andStoreAccountLoginTimeNotEqualTo(Date value) {
            addCriterion("store_account_login_time <>", value, "storeAccountLoginTime");
            return (Criteria) this;
        }

        public Criteria andStoreAccountLoginTimeGreaterThan(Date value) {
            addCriterion("store_account_login_time >", value, "storeAccountLoginTime");
            return (Criteria) this;
        }

        public Criteria andStoreAccountLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("store_account_login_time >=", value, "storeAccountLoginTime");
            return (Criteria) this;
        }

        public Criteria andStoreAccountLoginTimeLessThan(Date value) {
            addCriterion("store_account_login_time <", value, "storeAccountLoginTime");
            return (Criteria) this;
        }

        public Criteria andStoreAccountLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("store_account_login_time <=", value, "storeAccountLoginTime");
            return (Criteria) this;
        }

        public Criteria andStoreAccountLoginTimeIn(List<Date> values) {
            addCriterion("store_account_login_time in", values, "storeAccountLoginTime");
            return (Criteria) this;
        }

        public Criteria andStoreAccountLoginTimeNotIn(List<Date> values) {
            addCriterion("store_account_login_time not in", values, "storeAccountLoginTime");
            return (Criteria) this;
        }

        public Criteria andStoreAccountLoginTimeBetween(Date value1, Date value2) {
            addCriterion("store_account_login_time between", value1, value2, "storeAccountLoginTime");
            return (Criteria) this;
        }

        public Criteria andStoreAccountLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("store_account_login_time not between", value1, value2, "storeAccountLoginTime");
            return (Criteria) this;
        }

        public Criteria andStoreAccountIdIsNull() {
            addCriterion("store_account_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreAccountIdIsNotNull() {
            addCriterion("store_account_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreAccountIdEqualTo(Integer value) {
            addCriterion("store_account_id =", value, "storeAccountId");
            return (Criteria) this;
        }

        public Criteria andStoreAccountIdNotEqualTo(Integer value) {
            addCriterion("store_account_id <>", value, "storeAccountId");
            return (Criteria) this;
        }

        public Criteria andStoreAccountIdGreaterThan(Integer value) {
            addCriterion("store_account_id >", value, "storeAccountId");
            return (Criteria) this;
        }

        public Criteria andStoreAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_account_id >=", value, "storeAccountId");
            return (Criteria) this;
        }

        public Criteria andStoreAccountIdLessThan(Integer value) {
            addCriterion("store_account_id <", value, "storeAccountId");
            return (Criteria) this;
        }

        public Criteria andStoreAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("store_account_id <=", value, "storeAccountId");
            return (Criteria) this;
        }

        public Criteria andStoreAccountIdIn(List<Integer> values) {
            addCriterion("store_account_id in", values, "storeAccountId");
            return (Criteria) this;
        }

        public Criteria andStoreAccountIdNotIn(List<Integer> values) {
            addCriterion("store_account_id not in", values, "storeAccountId");
            return (Criteria) this;
        }

        public Criteria andStoreAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("store_account_id between", value1, value2, "storeAccountId");
            return (Criteria) this;
        }

        public Criteria andStoreAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("store_account_id not between", value1, value2, "storeAccountId");
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
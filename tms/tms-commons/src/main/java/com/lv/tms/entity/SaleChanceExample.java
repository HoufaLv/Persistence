package com.lv.tms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SaleChanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleChanceExample() {
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

        public Criteria andChanceNameIsNull() {
            addCriterion("chance_name is null");
            return (Criteria) this;
        }

        public Criteria andChanceNameIsNotNull() {
            addCriterion("chance_name is not null");
            return (Criteria) this;
        }

        public Criteria andChanceNameEqualTo(String value) {
            addCriterion("chance_name =", value, "chanceName");
            return (Criteria) this;
        }

        public Criteria andChanceNameNotEqualTo(String value) {
            addCriterion("chance_name <>", value, "chanceName");
            return (Criteria) this;
        }

        public Criteria andChanceNameGreaterThan(String value) {
            addCriterion("chance_name >", value, "chanceName");
            return (Criteria) this;
        }

        public Criteria andChanceNameGreaterThanOrEqualTo(String value) {
            addCriterion("chance_name >=", value, "chanceName");
            return (Criteria) this;
        }

        public Criteria andChanceNameLessThan(String value) {
            addCriterion("chance_name <", value, "chanceName");
            return (Criteria) this;
        }

        public Criteria andChanceNameLessThanOrEqualTo(String value) {
            addCriterion("chance_name <=", value, "chanceName");
            return (Criteria) this;
        }

        public Criteria andChanceNameLike(String value) {
            addCriterion("chance_name like", value, "chanceName");
            return (Criteria) this;
        }

        public Criteria andChanceNameNotLike(String value) {
            addCriterion("chance_name not like", value, "chanceName");
            return (Criteria) this;
        }

        public Criteria andChanceNameIn(List<String> values) {
            addCriterion("chance_name in", values, "chanceName");
            return (Criteria) this;
        }

        public Criteria andChanceNameNotIn(List<String> values) {
            addCriterion("chance_name not in", values, "chanceName");
            return (Criteria) this;
        }

        public Criteria andChanceNameBetween(String value1, String value2) {
            addCriterion("chance_name between", value1, value2, "chanceName");
            return (Criteria) this;
        }

        public Criteria andChanceNameNotBetween(String value1, String value2) {
            addCriterion("chance_name not between", value1, value2, "chanceName");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Integer value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Integer value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Integer value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Integer value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Integer> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Integer> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andChanceWorthIsNull() {
            addCriterion("chance_worth is null");
            return (Criteria) this;
        }

        public Criteria andChanceWorthIsNotNull() {
            addCriterion("chance_worth is not null");
            return (Criteria) this;
        }

        public Criteria andChanceWorthEqualTo(String value) {
            addCriterion("chance_worth =", value, "chanceWorth");
            return (Criteria) this;
        }

        public Criteria andChanceWorthNotEqualTo(String value) {
            addCriterion("chance_worth <>", value, "chanceWorth");
            return (Criteria) this;
        }

        public Criteria andChanceWorthGreaterThan(String value) {
            addCriterion("chance_worth >", value, "chanceWorth");
            return (Criteria) this;
        }

        public Criteria andChanceWorthGreaterThanOrEqualTo(String value) {
            addCriterion("chance_worth >=", value, "chanceWorth");
            return (Criteria) this;
        }

        public Criteria andChanceWorthLessThan(String value) {
            addCriterion("chance_worth <", value, "chanceWorth");
            return (Criteria) this;
        }

        public Criteria andChanceWorthLessThanOrEqualTo(String value) {
            addCriterion("chance_worth <=", value, "chanceWorth");
            return (Criteria) this;
        }

        public Criteria andChanceWorthLike(String value) {
            addCriterion("chance_worth like", value, "chanceWorth");
            return (Criteria) this;
        }

        public Criteria andChanceWorthNotLike(String value) {
            addCriterion("chance_worth not like", value, "chanceWorth");
            return (Criteria) this;
        }

        public Criteria andChanceWorthIn(List<String> values) {
            addCriterion("chance_worth in", values, "chanceWorth");
            return (Criteria) this;
        }

        public Criteria andChanceWorthNotIn(List<String> values) {
            addCriterion("chance_worth not in", values, "chanceWorth");
            return (Criteria) this;
        }

        public Criteria andChanceWorthBetween(String value1, String value2) {
            addCriterion("chance_worth between", value1, value2, "chanceWorth");
            return (Criteria) this;
        }

        public Criteria andChanceWorthNotBetween(String value1, String value2) {
            addCriterion("chance_worth not between", value1, value2, "chanceWorth");
            return (Criteria) this;
        }

        public Criteria andChanceProgressIsNull() {
            addCriterion("chance_progress is null");
            return (Criteria) this;
        }

        public Criteria andChanceProgressIsNotNull() {
            addCriterion("chance_progress is not null");
            return (Criteria) this;
        }

        public Criteria andChanceProgressEqualTo(String value) {
            addCriterion("chance_progress =", value, "chanceProgress");
            return (Criteria) this;
        }

        public Criteria andChanceProgressNotEqualTo(String value) {
            addCriterion("chance_progress <>", value, "chanceProgress");
            return (Criteria) this;
        }

        public Criteria andChanceProgressGreaterThan(String value) {
            addCriterion("chance_progress >", value, "chanceProgress");
            return (Criteria) this;
        }

        public Criteria andChanceProgressGreaterThanOrEqualTo(String value) {
            addCriterion("chance_progress >=", value, "chanceProgress");
            return (Criteria) this;
        }

        public Criteria andChanceProgressLessThan(String value) {
            addCriterion("chance_progress <", value, "chanceProgress");
            return (Criteria) this;
        }

        public Criteria andChanceProgressLessThanOrEqualTo(String value) {
            addCriterion("chance_progress <=", value, "chanceProgress");
            return (Criteria) this;
        }

        public Criteria andChanceProgressLike(String value) {
            addCriterion("chance_progress like", value, "chanceProgress");
            return (Criteria) this;
        }

        public Criteria andChanceProgressNotLike(String value) {
            addCriterion("chance_progress not like", value, "chanceProgress");
            return (Criteria) this;
        }

        public Criteria andChanceProgressIn(List<String> values) {
            addCriterion("chance_progress in", values, "chanceProgress");
            return (Criteria) this;
        }

        public Criteria andChanceProgressNotIn(List<String> values) {
            addCriterion("chance_progress not in", values, "chanceProgress");
            return (Criteria) this;
        }

        public Criteria andChanceProgressBetween(String value1, String value2) {
            addCriterion("chance_progress between", value1, value2, "chanceProgress");
            return (Criteria) this;
        }

        public Criteria andChanceProgressNotBetween(String value1, String value2) {
            addCriterion("chance_progress not between", value1, value2, "chanceProgress");
            return (Criteria) this;
        }

        public Criteria andLastTimeIsNull() {
            addCriterion("last_time is null");
            return (Criteria) this;
        }

        public Criteria andLastTimeIsNotNull() {
            addCriterion("last_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastTimeEqualTo(Date value) {
            addCriterion("last_time =", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotEqualTo(Date value) {
            addCriterion("last_time <>", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThan(Date value) {
            addCriterion("last_time >", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_time >=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThan(Date value) {
            addCriterion("last_time <", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_time <=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeIn(List<Date> values) {
            addCriterion("last_time in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotIn(List<Date> values) {
            addCriterion("last_time not in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeBetween(Date value1, Date value2) {
            addCriterion("last_time between", value1, value2, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_time not between", value1, value2, "lastTime");
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

        public Criteria andChanceContentIsNull() {
            addCriterion("chance_content is null");
            return (Criteria) this;
        }

        public Criteria andChanceContentIsNotNull() {
            addCriterion("chance_content is not null");
            return (Criteria) this;
        }

        public Criteria andChanceContentEqualTo(String value) {
            addCriterion("chance_content =", value, "chanceContent");
            return (Criteria) this;
        }

        public Criteria andChanceContentNotEqualTo(String value) {
            addCriterion("chance_content <>", value, "chanceContent");
            return (Criteria) this;
        }

        public Criteria andChanceContentGreaterThan(String value) {
            addCriterion("chance_content >", value, "chanceContent");
            return (Criteria) this;
        }

        public Criteria andChanceContentGreaterThanOrEqualTo(String value) {
            addCriterion("chance_content >=", value, "chanceContent");
            return (Criteria) this;
        }

        public Criteria andChanceContentLessThan(String value) {
            addCriterion("chance_content <", value, "chanceContent");
            return (Criteria) this;
        }

        public Criteria andChanceContentLessThanOrEqualTo(String value) {
            addCriterion("chance_content <=", value, "chanceContent");
            return (Criteria) this;
        }

        public Criteria andChanceContentLike(String value) {
            addCriterion("chance_content like", value, "chanceContent");
            return (Criteria) this;
        }

        public Criteria andChanceContentNotLike(String value) {
            addCriterion("chance_content not like", value, "chanceContent");
            return (Criteria) this;
        }

        public Criteria andChanceContentIn(List<String> values) {
            addCriterion("chance_content in", values, "chanceContent");
            return (Criteria) this;
        }

        public Criteria andChanceContentNotIn(List<String> values) {
            addCriterion("chance_content not in", values, "chanceContent");
            return (Criteria) this;
        }

        public Criteria andChanceContentBetween(String value1, String value2) {
            addCriterion("chance_content between", value1, value2, "chanceContent");
            return (Criteria) this;
        }

        public Criteria andChanceContentNotBetween(String value1, String value2) {
            addCriterion("chance_content not between", value1, value2, "chanceContent");
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
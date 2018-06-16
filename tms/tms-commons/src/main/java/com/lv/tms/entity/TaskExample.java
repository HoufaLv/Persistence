package com.lv.tms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskExample() {
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

        public Criteria andTaskTitleIsNull() {
            addCriterion("task_title is null");
            return (Criteria) this;
        }

        public Criteria andTaskTitleIsNotNull() {
            addCriterion("task_title is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTitleEqualTo(String value) {
            addCriterion("task_title =", value, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleNotEqualTo(String value) {
            addCriterion("task_title <>", value, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleGreaterThan(String value) {
            addCriterion("task_title >", value, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleGreaterThanOrEqualTo(String value) {
            addCriterion("task_title >=", value, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleLessThan(String value) {
            addCriterion("task_title <", value, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleLessThanOrEqualTo(String value) {
            addCriterion("task_title <=", value, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleLike(String value) {
            addCriterion("task_title like", value, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleNotLike(String value) {
            addCriterion("task_title not like", value, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleIn(List<String> values) {
            addCriterion("task_title in", values, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleNotIn(List<String> values) {
            addCriterion("task_title not in", values, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleBetween(String value1, String value2) {
            addCriterion("task_title between", value1, value2, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleNotBetween(String value1, String value2) {
            addCriterion("task_title not between", value1, value2, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeIsNull() {
            addCriterion("task_create_time is null");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeIsNotNull() {
            addCriterion("task_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeEqualTo(Date value) {
            addCriterion("task_create_time =", value, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeNotEqualTo(Date value) {
            addCriterion("task_create_time <>", value, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeGreaterThan(Date value) {
            addCriterion("task_create_time >", value, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("task_create_time >=", value, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeLessThan(Date value) {
            addCriterion("task_create_time <", value, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("task_create_time <=", value, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeIn(List<Date> values) {
            addCriterion("task_create_time in", values, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeNotIn(List<Date> values) {
            addCriterion("task_create_time not in", values, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeBetween(Date value1, Date value2) {
            addCriterion("task_create_time between", value1, value2, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("task_create_time not between", value1, value2, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeIsNull() {
            addCriterion("task_finish_time is null");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeIsNotNull() {
            addCriterion("task_finish_time is not null");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeEqualTo(Date value) {
            addCriterion("task_finish_time =", value, "taskFinishTime");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeNotEqualTo(Date value) {
            addCriterion("task_finish_time <>", value, "taskFinishTime");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeGreaterThan(Date value) {
            addCriterion("task_finish_time >", value, "taskFinishTime");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("task_finish_time >=", value, "taskFinishTime");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeLessThan(Date value) {
            addCriterion("task_finish_time <", value, "taskFinishTime");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeLessThanOrEqualTo(Date value) {
            addCriterion("task_finish_time <=", value, "taskFinishTime");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeIn(List<Date> values) {
            addCriterion("task_finish_time in", values, "taskFinishTime");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeNotIn(List<Date> values) {
            addCriterion("task_finish_time not in", values, "taskFinishTime");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeBetween(Date value1, Date value2) {
            addCriterion("task_finish_time between", value1, value2, "taskFinishTime");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeNotBetween(Date value1, Date value2) {
            addCriterion("task_finish_time not between", value1, value2, "taskFinishTime");
            return (Criteria) this;
        }

        public Criteria andTaskRemindTimeIsNull() {
            addCriterion("task_remind_time is null");
            return (Criteria) this;
        }

        public Criteria andTaskRemindTimeIsNotNull() {
            addCriterion("task_remind_time is not null");
            return (Criteria) this;
        }

        public Criteria andTaskRemindTimeEqualTo(Date value) {
            addCriterion("task_remind_time =", value, "taskRemindTime");
            return (Criteria) this;
        }

        public Criteria andTaskRemindTimeNotEqualTo(Date value) {
            addCriterion("task_remind_time <>", value, "taskRemindTime");
            return (Criteria) this;
        }

        public Criteria andTaskRemindTimeGreaterThan(Date value) {
            addCriterion("task_remind_time >", value, "taskRemindTime");
            return (Criteria) this;
        }

        public Criteria andTaskRemindTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("task_remind_time >=", value, "taskRemindTime");
            return (Criteria) this;
        }

        public Criteria andTaskRemindTimeLessThan(Date value) {
            addCriterion("task_remind_time <", value, "taskRemindTime");
            return (Criteria) this;
        }

        public Criteria andTaskRemindTimeLessThanOrEqualTo(Date value) {
            addCriterion("task_remind_time <=", value, "taskRemindTime");
            return (Criteria) this;
        }

        public Criteria andTaskRemindTimeIn(List<Date> values) {
            addCriterion("task_remind_time in", values, "taskRemindTime");
            return (Criteria) this;
        }

        public Criteria andTaskRemindTimeNotIn(List<Date> values) {
            addCriterion("task_remind_time not in", values, "taskRemindTime");
            return (Criteria) this;
        }

        public Criteria andTaskRemindTimeBetween(Date value1, Date value2) {
            addCriterion("task_remind_time between", value1, value2, "taskRemindTime");
            return (Criteria) this;
        }

        public Criteria andTaskRemindTimeNotBetween(Date value1, Date value2) {
            addCriterion("task_remind_time not between", value1, value2, "taskRemindTime");
            return (Criteria) this;
        }

        public Criteria andTaskStateIsNull() {
            addCriterion("task_state is null");
            return (Criteria) this;
        }

        public Criteria andTaskStateIsNotNull() {
            addCriterion("task_state is not null");
            return (Criteria) this;
        }

        public Criteria andTaskStateEqualTo(String value) {
            addCriterion("task_state =", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateNotEqualTo(String value) {
            addCriterion("task_state <>", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateGreaterThan(String value) {
            addCriterion("task_state >", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateGreaterThanOrEqualTo(String value) {
            addCriterion("task_state >=", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateLessThan(String value) {
            addCriterion("task_state <", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateLessThanOrEqualTo(String value) {
            addCriterion("task_state <=", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateLike(String value) {
            addCriterion("task_state like", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateNotLike(String value) {
            addCriterion("task_state not like", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateIn(List<String> values) {
            addCriterion("task_state in", values, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateNotIn(List<String> values) {
            addCriterion("task_state not in", values, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateBetween(String value1, String value2) {
            addCriterion("task_state between", value1, value2, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateNotBetween(String value1, String value2) {
            addCriterion("task_state not between", value1, value2, "taskState");
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

        public Criteria andSaleChanceIdIsNull() {
            addCriterion("sale_chance_id is null");
            return (Criteria) this;
        }

        public Criteria andSaleChanceIdIsNotNull() {
            addCriterion("sale_chance_id is not null");
            return (Criteria) this;
        }

        public Criteria andSaleChanceIdEqualTo(Integer value) {
            addCriterion("sale_chance_id =", value, "saleChanceId");
            return (Criteria) this;
        }

        public Criteria andSaleChanceIdNotEqualTo(Integer value) {
            addCriterion("sale_chance_id <>", value, "saleChanceId");
            return (Criteria) this;
        }

        public Criteria andSaleChanceIdGreaterThan(Integer value) {
            addCriterion("sale_chance_id >", value, "saleChanceId");
            return (Criteria) this;
        }

        public Criteria andSaleChanceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_chance_id >=", value, "saleChanceId");
            return (Criteria) this;
        }

        public Criteria andSaleChanceIdLessThan(Integer value) {
            addCriterion("sale_chance_id <", value, "saleChanceId");
            return (Criteria) this;
        }

        public Criteria andSaleChanceIdLessThanOrEqualTo(Integer value) {
            addCriterion("sale_chance_id <=", value, "saleChanceId");
            return (Criteria) this;
        }

        public Criteria andSaleChanceIdIn(List<Integer> values) {
            addCriterion("sale_chance_id in", values, "saleChanceId");
            return (Criteria) this;
        }

        public Criteria andSaleChanceIdNotIn(List<Integer> values) {
            addCriterion("sale_chance_id not in", values, "saleChanceId");
            return (Criteria) this;
        }

        public Criteria andSaleChanceIdBetween(Integer value1, Integer value2) {
            addCriterion("sale_chance_id between", value1, value2, "saleChanceId");
            return (Criteria) this;
        }

        public Criteria andSaleChanceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_chance_id not between", value1, value2, "saleChanceId");
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
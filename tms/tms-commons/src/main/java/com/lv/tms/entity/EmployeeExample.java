package com.lv.tms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeExample() {
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

        public Criteria andEmployeeNameIsNull() {
            addCriterion("employee_name is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIsNotNull() {
            addCriterion("employee_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameEqualTo(String value) {
            addCriterion("employee_name =", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotEqualTo(String value) {
            addCriterion("employee_name <>", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThan(String value) {
            addCriterion("employee_name >", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThanOrEqualTo(String value) {
            addCriterion("employee_name >=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThan(String value) {
            addCriterion("employee_name <", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThanOrEqualTo(String value) {
            addCriterion("employee_name <=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLike(String value) {
            addCriterion("employee_name like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotLike(String value) {
            addCriterion("employee_name not like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIn(List<String> values) {
            addCriterion("employee_name in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotIn(List<String> values) {
            addCriterion("employee_name not in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameBetween(String value1, String value2) {
            addCriterion("employee_name between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotBetween(String value1, String value2) {
            addCriterion("employee_name not between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordIsNull() {
            addCriterion("employee_password is null");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordIsNotNull() {
            addCriterion("employee_password is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordEqualTo(String value) {
            addCriterion("employee_password =", value, "employeePassword");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordNotEqualTo(String value) {
            addCriterion("employee_password <>", value, "employeePassword");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordGreaterThan(String value) {
            addCriterion("employee_password >", value, "employeePassword");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordGreaterThanOrEqualTo(String value) {
            addCriterion("employee_password >=", value, "employeePassword");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordLessThan(String value) {
            addCriterion("employee_password <", value, "employeePassword");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordLessThanOrEqualTo(String value) {
            addCriterion("employee_password <=", value, "employeePassword");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordLike(String value) {
            addCriterion("employee_password like", value, "employeePassword");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordNotLike(String value) {
            addCriterion("employee_password not like", value, "employeePassword");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordIn(List<String> values) {
            addCriterion("employee_password in", values, "employeePassword");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordNotIn(List<String> values) {
            addCriterion("employee_password not in", values, "employeePassword");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordBetween(String value1, String value2) {
            addCriterion("employee_password between", value1, value2, "employeePassword");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordNotBetween(String value1, String value2) {
            addCriterion("employee_password not between", value1, value2, "employeePassword");
            return (Criteria) this;
        }

        public Criteria andEmployeeCreateTimeIsNull() {
            addCriterion("employee_create_time is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeCreateTimeIsNotNull() {
            addCriterion("employee_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeCreateTimeEqualTo(Date value) {
            addCriterion("employee_create_time =", value, "employeeCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeCreateTimeNotEqualTo(Date value) {
            addCriterion("employee_create_time <>", value, "employeeCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeCreateTimeGreaterThan(Date value) {
            addCriterion("employee_create_time >", value, "employeeCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("employee_create_time >=", value, "employeeCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeCreateTimeLessThan(Date value) {
            addCriterion("employee_create_time <", value, "employeeCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("employee_create_time <=", value, "employeeCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeCreateTimeIn(List<Date> values) {
            addCriterion("employee_create_time in", values, "employeeCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeCreateTimeNotIn(List<Date> values) {
            addCriterion("employee_create_time not in", values, "employeeCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeCreateTimeBetween(Date value1, Date value2) {
            addCriterion("employee_create_time between", value1, value2, "employeeCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("employee_create_time not between", value1, value2, "employeeCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeUpdateTimeIsNull() {
            addCriterion("employee_update_time is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeUpdateTimeIsNotNull() {
            addCriterion("employee_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeUpdateTimeEqualTo(Date value) {
            addCriterion("employee_update_time =", value, "employeeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeUpdateTimeNotEqualTo(Date value) {
            addCriterion("employee_update_time <>", value, "employeeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeUpdateTimeGreaterThan(Date value) {
            addCriterion("employee_update_time >", value, "employeeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("employee_update_time >=", value, "employeeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeUpdateTimeLessThan(Date value) {
            addCriterion("employee_update_time <", value, "employeeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("employee_update_time <=", value, "employeeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeUpdateTimeIn(List<Date> values) {
            addCriterion("employee_update_time in", values, "employeeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeUpdateTimeNotIn(List<Date> values) {
            addCriterion("employee_update_time not in", values, "employeeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("employee_update_time between", value1, value2, "employeeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("employee_update_time not between", value1, value2, "employeeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelIsNull() {
            addCriterion("employee_tel is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelIsNotNull() {
            addCriterion("employee_tel is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelEqualTo(String value) {
            addCriterion("employee_tel =", value, "employeeTel");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelNotEqualTo(String value) {
            addCriterion("employee_tel <>", value, "employeeTel");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelGreaterThan(String value) {
            addCriterion("employee_tel >", value, "employeeTel");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelGreaterThanOrEqualTo(String value) {
            addCriterion("employee_tel >=", value, "employeeTel");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelLessThan(String value) {
            addCriterion("employee_tel <", value, "employeeTel");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelLessThanOrEqualTo(String value) {
            addCriterion("employee_tel <=", value, "employeeTel");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelLike(String value) {
            addCriterion("employee_tel like", value, "employeeTel");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelNotLike(String value) {
            addCriterion("employee_tel not like", value, "employeeTel");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelIn(List<String> values) {
            addCriterion("employee_tel in", values, "employeeTel");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelNotIn(List<String> values) {
            addCriterion("employee_tel not in", values, "employeeTel");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelBetween(String value1, String value2) {
            addCriterion("employee_tel between", value1, value2, "employeeTel");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelNotBetween(String value1, String value2) {
            addCriterion("employee_tel not between", value1, value2, "employeeTel");
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
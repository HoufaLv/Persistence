package com.lv.tms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TicketExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TicketExample() {
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

        public Criteria andTicketNumIsNull() {
            addCriterion("ticket_num is null");
            return (Criteria) this;
        }

        public Criteria andTicketNumIsNotNull() {
            addCriterion("ticket_num is not null");
            return (Criteria) this;
        }

        public Criteria andTicketNumEqualTo(Integer value) {
            addCriterion("ticket_num =", value, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumNotEqualTo(Integer value) {
            addCriterion("ticket_num <>", value, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumGreaterThan(Integer value) {
            addCriterion("ticket_num >", value, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ticket_num >=", value, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumLessThan(Integer value) {
            addCriterion("ticket_num <", value, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumLessThanOrEqualTo(Integer value) {
            addCriterion("ticket_num <=", value, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumIn(List<Integer> values) {
            addCriterion("ticket_num in", values, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumNotIn(List<Integer> values) {
            addCriterion("ticket_num not in", values, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumBetween(Integer value1, Integer value2) {
            addCriterion("ticket_num between", value1, value2, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumNotBetween(Integer value1, Integer value2) {
            addCriterion("ticket_num not between", value1, value2, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketInTimeIsNull() {
            addCriterion("ticket_in_time is null");
            return (Criteria) this;
        }

        public Criteria andTicketInTimeIsNotNull() {
            addCriterion("ticket_in_time is not null");
            return (Criteria) this;
        }

        public Criteria andTicketInTimeEqualTo(Date value) {
            addCriterion("ticket_in_time =", value, "ticketInTime");
            return (Criteria) this;
        }

        public Criteria andTicketInTimeNotEqualTo(Date value) {
            addCriterion("ticket_in_time <>", value, "ticketInTime");
            return (Criteria) this;
        }

        public Criteria andTicketInTimeGreaterThan(Date value) {
            addCriterion("ticket_in_time >", value, "ticketInTime");
            return (Criteria) this;
        }

        public Criteria andTicketInTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ticket_in_time >=", value, "ticketInTime");
            return (Criteria) this;
        }

        public Criteria andTicketInTimeLessThan(Date value) {
            addCriterion("ticket_in_time <", value, "ticketInTime");
            return (Criteria) this;
        }

        public Criteria andTicketInTimeLessThanOrEqualTo(Date value) {
            addCriterion("ticket_in_time <=", value, "ticketInTime");
            return (Criteria) this;
        }

        public Criteria andTicketInTimeIn(List<Date> values) {
            addCriterion("ticket_in_time in", values, "ticketInTime");
            return (Criteria) this;
        }

        public Criteria andTicketInTimeNotIn(List<Date> values) {
            addCriterion("ticket_in_time not in", values, "ticketInTime");
            return (Criteria) this;
        }

        public Criteria andTicketInTimeBetween(Date value1, Date value2) {
            addCriterion("ticket_in_time between", value1, value2, "ticketInTime");
            return (Criteria) this;
        }

        public Criteria andTicketInTimeNotBetween(Date value1, Date value2) {
            addCriterion("ticket_in_time not between", value1, value2, "ticketInTime");
            return (Criteria) this;
        }

        public Criteria andTicketStateIsNull() {
            addCriterion("ticket_state is null");
            return (Criteria) this;
        }

        public Criteria andTicketStateIsNotNull() {
            addCriterion("ticket_state is not null");
            return (Criteria) this;
        }

        public Criteria andTicketStateEqualTo(String value) {
            addCriterion("ticket_state =", value, "ticketState");
            return (Criteria) this;
        }

        public Criteria andTicketStateNotEqualTo(String value) {
            addCriterion("ticket_state <>", value, "ticketState");
            return (Criteria) this;
        }

        public Criteria andTicketStateGreaterThan(String value) {
            addCriterion("ticket_state >", value, "ticketState");
            return (Criteria) this;
        }

        public Criteria andTicketStateGreaterThanOrEqualTo(String value) {
            addCriterion("ticket_state >=", value, "ticketState");
            return (Criteria) this;
        }

        public Criteria andTicketStateLessThan(String value) {
            addCriterion("ticket_state <", value, "ticketState");
            return (Criteria) this;
        }

        public Criteria andTicketStateLessThanOrEqualTo(String value) {
            addCriterion("ticket_state <=", value, "ticketState");
            return (Criteria) this;
        }

        public Criteria andTicketStateLike(String value) {
            addCriterion("ticket_state like", value, "ticketState");
            return (Criteria) this;
        }

        public Criteria andTicketStateNotLike(String value) {
            addCriterion("ticket_state not like", value, "ticketState");
            return (Criteria) this;
        }

        public Criteria andTicketStateIn(List<String> values) {
            addCriterion("ticket_state in", values, "ticketState");
            return (Criteria) this;
        }

        public Criteria andTicketStateNotIn(List<String> values) {
            addCriterion("ticket_state not in", values, "ticketState");
            return (Criteria) this;
        }

        public Criteria andTicketStateBetween(String value1, String value2) {
            addCriterion("ticket_state between", value1, value2, "ticketState");
            return (Criteria) this;
        }

        public Criteria andTicketStateNotBetween(String value1, String value2) {
            addCriterion("ticket_state not between", value1, value2, "ticketState");
            return (Criteria) this;
        }

        public Criteria andTicketCreateTimeIsNull() {
            addCriterion("ticket_create_time is null");
            return (Criteria) this;
        }

        public Criteria andTicketCreateTimeIsNotNull() {
            addCriterion("ticket_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andTicketCreateTimeEqualTo(Date value) {
            addCriterion("ticket_create_time =", value, "ticketCreateTime");
            return (Criteria) this;
        }

        public Criteria andTicketCreateTimeNotEqualTo(Date value) {
            addCriterion("ticket_create_time <>", value, "ticketCreateTime");
            return (Criteria) this;
        }

        public Criteria andTicketCreateTimeGreaterThan(Date value) {
            addCriterion("ticket_create_time >", value, "ticketCreateTime");
            return (Criteria) this;
        }

        public Criteria andTicketCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ticket_create_time >=", value, "ticketCreateTime");
            return (Criteria) this;
        }

        public Criteria andTicketCreateTimeLessThan(Date value) {
            addCriterion("ticket_create_time <", value, "ticketCreateTime");
            return (Criteria) this;
        }

        public Criteria andTicketCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("ticket_create_time <=", value, "ticketCreateTime");
            return (Criteria) this;
        }

        public Criteria andTicketCreateTimeIn(List<Date> values) {
            addCriterion("ticket_create_time in", values, "ticketCreateTime");
            return (Criteria) this;
        }

        public Criteria andTicketCreateTimeNotIn(List<Date> values) {
            addCriterion("ticket_create_time not in", values, "ticketCreateTime");
            return (Criteria) this;
        }

        public Criteria andTicketCreateTimeBetween(Date value1, Date value2) {
            addCriterion("ticket_create_time between", value1, value2, "ticketCreateTime");
            return (Criteria) this;
        }

        public Criteria andTicketCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("ticket_create_time not between", value1, value2, "ticketCreateTime");
            return (Criteria) this;
        }

        public Criteria andTicketUpdateTimeIsNull() {
            addCriterion("ticket_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTicketUpdateTimeIsNotNull() {
            addCriterion("ticket_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTicketUpdateTimeEqualTo(Date value) {
            addCriterion("ticket_update_time =", value, "ticketUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTicketUpdateTimeNotEqualTo(Date value) {
            addCriterion("ticket_update_time <>", value, "ticketUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTicketUpdateTimeGreaterThan(Date value) {
            addCriterion("ticket_update_time >", value, "ticketUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTicketUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ticket_update_time >=", value, "ticketUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTicketUpdateTimeLessThan(Date value) {
            addCriterion("ticket_update_time <", value, "ticketUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTicketUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("ticket_update_time <=", value, "ticketUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTicketUpdateTimeIn(List<Date> values) {
            addCriterion("ticket_update_time in", values, "ticketUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTicketUpdateTimeNotIn(List<Date> values) {
            addCriterion("ticket_update_time not in", values, "ticketUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTicketUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("ticket_update_time between", value1, value2, "ticketUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTicketUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("ticket_update_time not between", value1, value2, "ticketUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTicketOutTimeIsNull() {
            addCriterion("ticket_out_time is null");
            return (Criteria) this;
        }

        public Criteria andTicketOutTimeIsNotNull() {
            addCriterion("ticket_out_time is not null");
            return (Criteria) this;
        }

        public Criteria andTicketOutTimeEqualTo(Date value) {
            addCriterion("ticket_out_time =", value, "ticketOutTime");
            return (Criteria) this;
        }

        public Criteria andTicketOutTimeNotEqualTo(Date value) {
            addCriterion("ticket_out_time <>", value, "ticketOutTime");
            return (Criteria) this;
        }

        public Criteria andTicketOutTimeGreaterThan(Date value) {
            addCriterion("ticket_out_time >", value, "ticketOutTime");
            return (Criteria) this;
        }

        public Criteria andTicketOutTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ticket_out_time >=", value, "ticketOutTime");
            return (Criteria) this;
        }

        public Criteria andTicketOutTimeLessThan(Date value) {
            addCriterion("ticket_out_time <", value, "ticketOutTime");
            return (Criteria) this;
        }

        public Criteria andTicketOutTimeLessThanOrEqualTo(Date value) {
            addCriterion("ticket_out_time <=", value, "ticketOutTime");
            return (Criteria) this;
        }

        public Criteria andTicketOutTimeIn(List<Date> values) {
            addCriterion("ticket_out_time in", values, "ticketOutTime");
            return (Criteria) this;
        }

        public Criteria andTicketOutTimeNotIn(List<Date> values) {
            addCriterion("ticket_out_time not in", values, "ticketOutTime");
            return (Criteria) this;
        }

        public Criteria andTicketOutTimeBetween(Date value1, Date value2) {
            addCriterion("ticket_out_time between", value1, value2, "ticketOutTime");
            return (Criteria) this;
        }

        public Criteria andTicketOutTimeNotBetween(Date value1, Date value2) {
            addCriterion("ticket_out_time not between", value1, value2, "ticketOutTime");
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

        public Criteria andTicketValidateStartIsNull() {
            addCriterion("ticket_validate_start is null");
            return (Criteria) this;
        }

        public Criteria andTicketValidateStartIsNotNull() {
            addCriterion("ticket_validate_start is not null");
            return (Criteria) this;
        }

        public Criteria andTicketValidateStartEqualTo(Date value) {
            addCriterion("ticket_validate_start =", value, "ticketValidateStart");
            return (Criteria) this;
        }

        public Criteria andTicketValidateStartNotEqualTo(Date value) {
            addCriterion("ticket_validate_start <>", value, "ticketValidateStart");
            return (Criteria) this;
        }

        public Criteria andTicketValidateStartGreaterThan(Date value) {
            addCriterion("ticket_validate_start >", value, "ticketValidateStart");
            return (Criteria) this;
        }

        public Criteria andTicketValidateStartGreaterThanOrEqualTo(Date value) {
            addCriterion("ticket_validate_start >=", value, "ticketValidateStart");
            return (Criteria) this;
        }

        public Criteria andTicketValidateStartLessThan(Date value) {
            addCriterion("ticket_validate_start <", value, "ticketValidateStart");
            return (Criteria) this;
        }

        public Criteria andTicketValidateStartLessThanOrEqualTo(Date value) {
            addCriterion("ticket_validate_start <=", value, "ticketValidateStart");
            return (Criteria) this;
        }

        public Criteria andTicketValidateStartIn(List<Date> values) {
            addCriterion("ticket_validate_start in", values, "ticketValidateStart");
            return (Criteria) this;
        }

        public Criteria andTicketValidateStartNotIn(List<Date> values) {
            addCriterion("ticket_validate_start not in", values, "ticketValidateStart");
            return (Criteria) this;
        }

        public Criteria andTicketValidateStartBetween(Date value1, Date value2) {
            addCriterion("ticket_validate_start between", value1, value2, "ticketValidateStart");
            return (Criteria) this;
        }

        public Criteria andTicketValidateStartNotBetween(Date value1, Date value2) {
            addCriterion("ticket_validate_start not between", value1, value2, "ticketValidateStart");
            return (Criteria) this;
        }

        public Criteria andTicketValidateEndIsNull() {
            addCriterion("ticket_validate_end is null");
            return (Criteria) this;
        }

        public Criteria andTicketValidateEndIsNotNull() {
            addCriterion("ticket_validate_end is not null");
            return (Criteria) this;
        }

        public Criteria andTicketValidateEndEqualTo(Date value) {
            addCriterion("ticket_validate_end =", value, "ticketValidateEnd");
            return (Criteria) this;
        }

        public Criteria andTicketValidateEndNotEqualTo(Date value) {
            addCriterion("ticket_validate_end <>", value, "ticketValidateEnd");
            return (Criteria) this;
        }

        public Criteria andTicketValidateEndGreaterThan(Date value) {
            addCriterion("ticket_validate_end >", value, "ticketValidateEnd");
            return (Criteria) this;
        }

        public Criteria andTicketValidateEndGreaterThanOrEqualTo(Date value) {
            addCriterion("ticket_validate_end >=", value, "ticketValidateEnd");
            return (Criteria) this;
        }

        public Criteria andTicketValidateEndLessThan(Date value) {
            addCriterion("ticket_validate_end <", value, "ticketValidateEnd");
            return (Criteria) this;
        }

        public Criteria andTicketValidateEndLessThanOrEqualTo(Date value) {
            addCriterion("ticket_validate_end <=", value, "ticketValidateEnd");
            return (Criteria) this;
        }

        public Criteria andTicketValidateEndIn(List<Date> values) {
            addCriterion("ticket_validate_end in", values, "ticketValidateEnd");
            return (Criteria) this;
        }

        public Criteria andTicketValidateEndNotIn(List<Date> values) {
            addCriterion("ticket_validate_end not in", values, "ticketValidateEnd");
            return (Criteria) this;
        }

        public Criteria andTicketValidateEndBetween(Date value1, Date value2) {
            addCriterion("ticket_validate_end between", value1, value2, "ticketValidateEnd");
            return (Criteria) this;
        }

        public Criteria andTicketValidateEndNotBetween(Date value1, Date value2) {
            addCriterion("ticket_validate_end not between", value1, value2, "ticketValidateEnd");
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
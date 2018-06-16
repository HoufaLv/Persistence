package com.lv.tms.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Ticket implements Serializable {
    private Integer id;

    /**
     * 年票号码
     */
    private Integer ticketNum;

    /**
     * 入库时间
     */
    private Date ticketInTime;

    /**
     * 年票状态
     */
    private String ticketState;

    /**
     * 年票创建时间
     */
    private Date ticketCreateTime;

    private Date ticketUpdateTime;

    /**
     * 下发时间
     */
    private Date ticketOutTime;

    private Integer storeAccountId;

    /**
     * 顾客id
     */
    private Integer customerId;

    /**
     * 起始有效时间
     */
    private Date ticketValidateStart;

    /**
     * 结束有效时间
     */
    private Date ticketValidateEnd;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTicketNum() {
        return ticketNum;
    }

    public void setTicketNum(Integer ticketNum) {
        this.ticketNum = ticketNum;
    }

    public Date getTicketInTime() {
        return ticketInTime;
    }

    public void setTicketInTime(Date ticketInTime) {
        this.ticketInTime = ticketInTime;
    }

    public String getTicketState() {
        return ticketState;
    }

    public void setTicketState(String ticketState) {
        this.ticketState = ticketState;
    }

    public Date getTicketCreateTime() {
        return ticketCreateTime;
    }

    public void setTicketCreateTime(Date ticketCreateTime) {
        this.ticketCreateTime = ticketCreateTime;
    }

    public Date getTicketUpdateTime() {
        return ticketUpdateTime;
    }

    public void setTicketUpdateTime(Date ticketUpdateTime) {
        this.ticketUpdateTime = ticketUpdateTime;
    }

    public Date getTicketOutTime() {
        return ticketOutTime;
    }

    public void setTicketOutTime(Date ticketOutTime) {
        this.ticketOutTime = ticketOutTime;
    }

    public Integer getStoreAccountId() {
        return storeAccountId;
    }

    public void setStoreAccountId(Integer storeAccountId) {
        this.storeAccountId = storeAccountId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Date getTicketValidateStart() {
        return ticketValidateStart;
    }

    public void setTicketValidateStart(Date ticketValidateStart) {
        this.ticketValidateStart = ticketValidateStart;
    }

    public Date getTicketValidateEnd() {
        return ticketValidateEnd;
    }

    public void setTicketValidateEnd(Date ticketValidateEnd) {
        this.ticketValidateEnd = ticketValidateEnd;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Ticket other = (Ticket) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTicketNum() == null ? other.getTicketNum() == null : this.getTicketNum().equals(other.getTicketNum()))
            && (this.getTicketInTime() == null ? other.getTicketInTime() == null : this.getTicketInTime().equals(other.getTicketInTime()))
            && (this.getTicketState() == null ? other.getTicketState() == null : this.getTicketState().equals(other.getTicketState()))
            && (this.getTicketCreateTime() == null ? other.getTicketCreateTime() == null : this.getTicketCreateTime().equals(other.getTicketCreateTime()))
            && (this.getTicketUpdateTime() == null ? other.getTicketUpdateTime() == null : this.getTicketUpdateTime().equals(other.getTicketUpdateTime()))
            && (this.getTicketOutTime() == null ? other.getTicketOutTime() == null : this.getTicketOutTime().equals(other.getTicketOutTime()))
            && (this.getStoreAccountId() == null ? other.getStoreAccountId() == null : this.getStoreAccountId().equals(other.getStoreAccountId()))
            && (this.getCustomerId() == null ? other.getCustomerId() == null : this.getCustomerId().equals(other.getCustomerId()))
            && (this.getTicketValidateStart() == null ? other.getTicketValidateStart() == null : this.getTicketValidateStart().equals(other.getTicketValidateStart()))
            && (this.getTicketValidateEnd() == null ? other.getTicketValidateEnd() == null : this.getTicketValidateEnd().equals(other.getTicketValidateEnd()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTicketNum() == null) ? 0 : getTicketNum().hashCode());
        result = prime * result + ((getTicketInTime() == null) ? 0 : getTicketInTime().hashCode());
        result = prime * result + ((getTicketState() == null) ? 0 : getTicketState().hashCode());
        result = prime * result + ((getTicketCreateTime() == null) ? 0 : getTicketCreateTime().hashCode());
        result = prime * result + ((getTicketUpdateTime() == null) ? 0 : getTicketUpdateTime().hashCode());
        result = prime * result + ((getTicketOutTime() == null) ? 0 : getTicketOutTime().hashCode());
        result = prime * result + ((getStoreAccountId() == null) ? 0 : getStoreAccountId().hashCode());
        result = prime * result + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        result = prime * result + ((getTicketValidateStart() == null) ? 0 : getTicketValidateStart().hashCode());
        result = prime * result + ((getTicketValidateEnd() == null) ? 0 : getTicketValidateEnd().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ticketNum=").append(ticketNum);
        sb.append(", ticketInTime=").append(ticketInTime);
        sb.append(", ticketState=").append(ticketState);
        sb.append(", ticketCreateTime=").append(ticketCreateTime);
        sb.append(", ticketUpdateTime=").append(ticketUpdateTime);
        sb.append(", ticketOutTime=").append(ticketOutTime);
        sb.append(", storeAccountId=").append(storeAccountId);
        sb.append(", customerId=").append(customerId);
        sb.append(", ticketValidateStart=").append(ticketValidateStart);
        sb.append(", ticketValidateEnd=").append(ticketValidateEnd);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
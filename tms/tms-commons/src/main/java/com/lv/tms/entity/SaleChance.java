package com.lv.tms.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class SaleChance implements Serializable {
    private Integer id;

    private String chanceName;

    /**
     * 机会关联顾客id
     */
    private Integer customerId;

    private String chanceWorth;

    private String chanceProgress;

    /**
     * 最后一次销售机会时间
     */
    private Date lastTime;

    /**
     * 机会所属雇员id
     */
    private Integer employeeId;

    /**
     * 销售机会内容
     */
    private String chanceContent;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getChanceName() {
        return chanceName;
    }

    public void setChanceName(String chanceName) {
        this.chanceName = chanceName;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getChanceWorth() {
        return chanceWorth;
    }

    public void setChanceWorth(String chanceWorth) {
        this.chanceWorth = chanceWorth;
    }

    public String getChanceProgress() {
        return chanceProgress;
    }

    public void setChanceProgress(String chanceProgress) {
        this.chanceProgress = chanceProgress;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getChanceContent() {
        return chanceContent;
    }

    public void setChanceContent(String chanceContent) {
        this.chanceContent = chanceContent;
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
        SaleChance other = (SaleChance) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getChanceName() == null ? other.getChanceName() == null : this.getChanceName().equals(other.getChanceName()))
            && (this.getCustomerId() == null ? other.getCustomerId() == null : this.getCustomerId().equals(other.getCustomerId()))
            && (this.getChanceWorth() == null ? other.getChanceWorth() == null : this.getChanceWorth().equals(other.getChanceWorth()))
            && (this.getChanceProgress() == null ? other.getChanceProgress() == null : this.getChanceProgress().equals(other.getChanceProgress()))
            && (this.getLastTime() == null ? other.getLastTime() == null : this.getLastTime().equals(other.getLastTime()))
            && (this.getEmployeeId() == null ? other.getEmployeeId() == null : this.getEmployeeId().equals(other.getEmployeeId()))
            && (this.getChanceContent() == null ? other.getChanceContent() == null : this.getChanceContent().equals(other.getChanceContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getChanceName() == null) ? 0 : getChanceName().hashCode());
        result = prime * result + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        result = prime * result + ((getChanceWorth() == null) ? 0 : getChanceWorth().hashCode());
        result = prime * result + ((getChanceProgress() == null) ? 0 : getChanceProgress().hashCode());
        result = prime * result + ((getLastTime() == null) ? 0 : getLastTime().hashCode());
        result = prime * result + ((getEmployeeId() == null) ? 0 : getEmployeeId().hashCode());
        result = prime * result + ((getChanceContent() == null) ? 0 : getChanceContent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", chanceName=").append(chanceName);
        sb.append(", customerId=").append(customerId);
        sb.append(", chanceWorth=").append(chanceWorth);
        sb.append(", chanceProgress=").append(chanceProgress);
        sb.append(", lastTime=").append(lastTime);
        sb.append(", employeeId=").append(employeeId);
        sb.append(", chanceContent=").append(chanceContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
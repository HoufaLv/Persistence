package com.lv.tms.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Task implements Serializable {
    private Integer id;

    /**
     * 事项标题
     */
    private String taskTitle;

    /**
     * 任务创建时间
     */
    private Date taskCreateTime;

    /**
     * 任务完成时间
     */
    private Date taskFinishTime;

    /**
     * 任务提醒时间
     */
    private Date taskRemindTime;

    /**
     * 任务状态
     */
    private String taskState;

    /**
     * 雇员id
     */
    private Integer employeeId;

    /**
     * 销售机会id
     */
    private Integer saleChanceId;

    /**
     * 顾客id
     */
    private Integer customerId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public Date getTaskCreateTime() {
        return taskCreateTime;
    }

    public void setTaskCreateTime(Date taskCreateTime) {
        this.taskCreateTime = taskCreateTime;
    }

    public Date getTaskFinishTime() {
        return taskFinishTime;
    }

    public void setTaskFinishTime(Date taskFinishTime) {
        this.taskFinishTime = taskFinishTime;
    }

    public Date getTaskRemindTime() {
        return taskRemindTime;
    }

    public void setTaskRemindTime(Date taskRemindTime) {
        this.taskRemindTime = taskRemindTime;
    }

    public String getTaskState() {
        return taskState;
    }

    public void setTaskState(String taskState) {
        this.taskState = taskState;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getSaleChanceId() {
        return saleChanceId;
    }

    public void setSaleChanceId(Integer saleChanceId) {
        this.saleChanceId = saleChanceId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
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
        Task other = (Task) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTaskTitle() == null ? other.getTaskTitle() == null : this.getTaskTitle().equals(other.getTaskTitle()))
            && (this.getTaskCreateTime() == null ? other.getTaskCreateTime() == null : this.getTaskCreateTime().equals(other.getTaskCreateTime()))
            && (this.getTaskFinishTime() == null ? other.getTaskFinishTime() == null : this.getTaskFinishTime().equals(other.getTaskFinishTime()))
            && (this.getTaskRemindTime() == null ? other.getTaskRemindTime() == null : this.getTaskRemindTime().equals(other.getTaskRemindTime()))
            && (this.getTaskState() == null ? other.getTaskState() == null : this.getTaskState().equals(other.getTaskState()))
            && (this.getEmployeeId() == null ? other.getEmployeeId() == null : this.getEmployeeId().equals(other.getEmployeeId()))
            && (this.getSaleChanceId() == null ? other.getSaleChanceId() == null : this.getSaleChanceId().equals(other.getSaleChanceId()))
            && (this.getCustomerId() == null ? other.getCustomerId() == null : this.getCustomerId().equals(other.getCustomerId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTaskTitle() == null) ? 0 : getTaskTitle().hashCode());
        result = prime * result + ((getTaskCreateTime() == null) ? 0 : getTaskCreateTime().hashCode());
        result = prime * result + ((getTaskFinishTime() == null) ? 0 : getTaskFinishTime().hashCode());
        result = prime * result + ((getTaskRemindTime() == null) ? 0 : getTaskRemindTime().hashCode());
        result = prime * result + ((getTaskState() == null) ? 0 : getTaskState().hashCode());
        result = prime * result + ((getEmployeeId() == null) ? 0 : getEmployeeId().hashCode());
        result = prime * result + ((getSaleChanceId() == null) ? 0 : getSaleChanceId().hashCode());
        result = prime * result + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", taskTitle=").append(taskTitle);
        sb.append(", taskCreateTime=").append(taskCreateTime);
        sb.append(", taskFinishTime=").append(taskFinishTime);
        sb.append(", taskRemindTime=").append(taskRemindTime);
        sb.append(", taskState=").append(taskState);
        sb.append(", employeeId=").append(employeeId);
        sb.append(", saleChanceId=").append(saleChanceId);
        sb.append(", customerId=").append(customerId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
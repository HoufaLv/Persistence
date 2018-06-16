package com.lv.tms.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Employee implements Serializable {
    private Integer id;

    /**
     * 员工名称
     */
    private String employeeName;

    /**
     * 员工密码
     */
    private String employeePassword;

    /**
     * 员工创建时间
     */
    private Date employeeCreateTime;

    /**
     * 员工更新时间
     */
    private Date employeeUpdateTime;

    /**
     * 员工电话
     */
    private String employeeTel;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeePassword() {
        return employeePassword;
    }

    public void setEmployeePassword(String employeePassword) {
        this.employeePassword = employeePassword;
    }

    public Date getEmployeeCreateTime() {
        return employeeCreateTime;
    }

    public void setEmployeeCreateTime(Date employeeCreateTime) {
        this.employeeCreateTime = employeeCreateTime;
    }

    public Date getEmployeeUpdateTime() {
        return employeeUpdateTime;
    }

    public void setEmployeeUpdateTime(Date employeeUpdateTime) {
        this.employeeUpdateTime = employeeUpdateTime;
    }

    public String getEmployeeTel() {
        return employeeTel;
    }

    public void setEmployeeTel(String employeeTel) {
        this.employeeTel = employeeTel;
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
        Employee other = (Employee) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getEmployeeName() == null ? other.getEmployeeName() == null : this.getEmployeeName().equals(other.getEmployeeName()))
            && (this.getEmployeePassword() == null ? other.getEmployeePassword() == null : this.getEmployeePassword().equals(other.getEmployeePassword()))
            && (this.getEmployeeCreateTime() == null ? other.getEmployeeCreateTime() == null : this.getEmployeeCreateTime().equals(other.getEmployeeCreateTime()))
            && (this.getEmployeeUpdateTime() == null ? other.getEmployeeUpdateTime() == null : this.getEmployeeUpdateTime().equals(other.getEmployeeUpdateTime()))
            && (this.getEmployeeTel() == null ? other.getEmployeeTel() == null : this.getEmployeeTel().equals(other.getEmployeeTel()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getEmployeeName() == null) ? 0 : getEmployeeName().hashCode());
        result = prime * result + ((getEmployeePassword() == null) ? 0 : getEmployeePassword().hashCode());
        result = prime * result + ((getEmployeeCreateTime() == null) ? 0 : getEmployeeCreateTime().hashCode());
        result = prime * result + ((getEmployeeUpdateTime() == null) ? 0 : getEmployeeUpdateTime().hashCode());
        result = prime * result + ((getEmployeeTel() == null) ? 0 : getEmployeeTel().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", employeeName=").append(employeeName);
        sb.append(", employeePassword=").append(employeePassword);
        sb.append(", employeeCreateTime=").append(employeeCreateTime);
        sb.append(", employeeUpdateTime=").append(employeeUpdateTime);
        sb.append(", employeeTel=").append(employeeTel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
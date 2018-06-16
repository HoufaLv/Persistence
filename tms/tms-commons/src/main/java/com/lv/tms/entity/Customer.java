package com.lv.tms.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Customer implements Serializable {
    private Integer id;

    /**
     * 用户名称
     */
    private String customerName;

    /**
     * 用户身份证号
     */
    private String customerIdCard;

    /**
     * 用户身份证正面
     */
    private String customerIdCardPhoto;

    /**
     * 用户身份证背面
     */
    private String customerIdCardPhotoBack;

    /**
     * 用户电话
     */
    private String customerTel;

    /**
     * 用户地址
     */
    private String customerAddress;

    /**
     * 客户职位
     */
    private String customerJobTitle;

    /**
     * 用户年龄
     */
    private String customerAge;

    /**
     * 用户级别
     */
    private String customerLevel;

    /**
     * 用户来源
     */
    private String customerSource;

    /**
     * 用户所属行业
     */
    private String customerTrade;

    /**
     * 用户来源
     */
    private String customerReminder;

    /**
     * 用户性别
     */
    private String customerGender;

    /**
     * 客户所持年票id
     */
    private Integer customerTicketId;

    /**
     * 客户所属员工id，如果为空则为公海客户
     */
    private Integer employeeId;

    /**
     * 客户添加时间
     */
    private Date createTime;

    /**
     * 客户更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerIdCard() {
        return customerIdCard;
    }

    public void setCustomerIdCard(String customerIdCard) {
        this.customerIdCard = customerIdCard;
    }

    public String getCustomerIdCardPhoto() {
        return customerIdCardPhoto;
    }

    public void setCustomerIdCardPhoto(String customerIdCardPhoto) {
        this.customerIdCardPhoto = customerIdCardPhoto;
    }

    public String getCustomerIdCardPhotoBack() {
        return customerIdCardPhotoBack;
    }

    public void setCustomerIdCardPhotoBack(String customerIdCardPhotoBack) {
        this.customerIdCardPhotoBack = customerIdCardPhotoBack;
    }

    public String getCustomerTel() {
        return customerTel;
    }

    public void setCustomerTel(String customerTel) {
        this.customerTel = customerTel;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerJobTitle() {
        return customerJobTitle;
    }

    public void setCustomerJobTitle(String customerJobTitle) {
        this.customerJobTitle = customerJobTitle;
    }

    public String getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(String customerAge) {
        this.customerAge = customerAge;
    }

    public String getCustomerLevel() {
        return customerLevel;
    }

    public void setCustomerLevel(String customerLevel) {
        this.customerLevel = customerLevel;
    }

    public String getCustomerSource() {
        return customerSource;
    }

    public void setCustomerSource(String customerSource) {
        this.customerSource = customerSource;
    }

    public String getCustomerTrade() {
        return customerTrade;
    }

    public void setCustomerTrade(String customerTrade) {
        this.customerTrade = customerTrade;
    }

    public String getCustomerReminder() {
        return customerReminder;
    }

    public void setCustomerReminder(String customerReminder) {
        this.customerReminder = customerReminder;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }

    public Integer getCustomerTicketId() {
        return customerTicketId;
    }

    public void setCustomerTicketId(Integer customerTicketId) {
        this.customerTicketId = customerTicketId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
        Customer other = (Customer) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCustomerName() == null ? other.getCustomerName() == null : this.getCustomerName().equals(other.getCustomerName()))
            && (this.getCustomerIdCard() == null ? other.getCustomerIdCard() == null : this.getCustomerIdCard().equals(other.getCustomerIdCard()))
            && (this.getCustomerIdCardPhoto() == null ? other.getCustomerIdCardPhoto() == null : this.getCustomerIdCardPhoto().equals(other.getCustomerIdCardPhoto()))
            && (this.getCustomerIdCardPhotoBack() == null ? other.getCustomerIdCardPhotoBack() == null : this.getCustomerIdCardPhotoBack().equals(other.getCustomerIdCardPhotoBack()))
            && (this.getCustomerTel() == null ? other.getCustomerTel() == null : this.getCustomerTel().equals(other.getCustomerTel()))
            && (this.getCustomerAddress() == null ? other.getCustomerAddress() == null : this.getCustomerAddress().equals(other.getCustomerAddress()))
            && (this.getCustomerJobTitle() == null ? other.getCustomerJobTitle() == null : this.getCustomerJobTitle().equals(other.getCustomerJobTitle()))
            && (this.getCustomerAge() == null ? other.getCustomerAge() == null : this.getCustomerAge().equals(other.getCustomerAge()))
            && (this.getCustomerLevel() == null ? other.getCustomerLevel() == null : this.getCustomerLevel().equals(other.getCustomerLevel()))
            && (this.getCustomerSource() == null ? other.getCustomerSource() == null : this.getCustomerSource().equals(other.getCustomerSource()))
            && (this.getCustomerTrade() == null ? other.getCustomerTrade() == null : this.getCustomerTrade().equals(other.getCustomerTrade()))
            && (this.getCustomerReminder() == null ? other.getCustomerReminder() == null : this.getCustomerReminder().equals(other.getCustomerReminder()))
            && (this.getCustomerGender() == null ? other.getCustomerGender() == null : this.getCustomerGender().equals(other.getCustomerGender()))
            && (this.getCustomerTicketId() == null ? other.getCustomerTicketId() == null : this.getCustomerTicketId().equals(other.getCustomerTicketId()))
            && (this.getEmployeeId() == null ? other.getEmployeeId() == null : this.getEmployeeId().equals(other.getEmployeeId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCustomerName() == null) ? 0 : getCustomerName().hashCode());
        result = prime * result + ((getCustomerIdCard() == null) ? 0 : getCustomerIdCard().hashCode());
        result = prime * result + ((getCustomerIdCardPhoto() == null) ? 0 : getCustomerIdCardPhoto().hashCode());
        result = prime * result + ((getCustomerIdCardPhotoBack() == null) ? 0 : getCustomerIdCardPhotoBack().hashCode());
        result = prime * result + ((getCustomerTel() == null) ? 0 : getCustomerTel().hashCode());
        result = prime * result + ((getCustomerAddress() == null) ? 0 : getCustomerAddress().hashCode());
        result = prime * result + ((getCustomerJobTitle() == null) ? 0 : getCustomerJobTitle().hashCode());
        result = prime * result + ((getCustomerAge() == null) ? 0 : getCustomerAge().hashCode());
        result = prime * result + ((getCustomerLevel() == null) ? 0 : getCustomerLevel().hashCode());
        result = prime * result + ((getCustomerSource() == null) ? 0 : getCustomerSource().hashCode());
        result = prime * result + ((getCustomerTrade() == null) ? 0 : getCustomerTrade().hashCode());
        result = prime * result + ((getCustomerReminder() == null) ? 0 : getCustomerReminder().hashCode());
        result = prime * result + ((getCustomerGender() == null) ? 0 : getCustomerGender().hashCode());
        result = prime * result + ((getCustomerTicketId() == null) ? 0 : getCustomerTicketId().hashCode());
        result = prime * result + ((getEmployeeId() == null) ? 0 : getEmployeeId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", customerName=").append(customerName);
        sb.append(", customerIdCard=").append(customerIdCard);
        sb.append(", customerIdCardPhoto=").append(customerIdCardPhoto);
        sb.append(", customerIdCardPhotoBack=").append(customerIdCardPhotoBack);
        sb.append(", customerTel=").append(customerTel);
        sb.append(", customerAddress=").append(customerAddress);
        sb.append(", customerJobTitle=").append(customerJobTitle);
        sb.append(", customerAge=").append(customerAge);
        sb.append(", customerLevel=").append(customerLevel);
        sb.append(", customerSource=").append(customerSource);
        sb.append(", customerTrade=").append(customerTrade);
        sb.append(", customerReminder=").append(customerReminder);
        sb.append(", customerGender=").append(customerGender);
        sb.append(", customerTicketId=").append(customerTicketId);
        sb.append(", employeeId=").append(employeeId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
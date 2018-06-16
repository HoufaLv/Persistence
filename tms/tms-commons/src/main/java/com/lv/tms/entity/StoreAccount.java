package com.lv.tms.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class StoreAccount implements Serializable {
    private Integer id;

    /**
     * 销售点账号
     */
    private String storeAccount;

    /**
     * 销售点密码
     */
    private String storePassword;

    /**
     * 销售点创建时间
     */
    private Date storeCreateTime;

    /**
     * 销售点更新时间
     */
    private Date storeUpdateTime;

    /**
     * 销售点状态
     */
    private String storeState;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStoreAccount() {
        return storeAccount;
    }

    public void setStoreAccount(String storeAccount) {
        this.storeAccount = storeAccount;
    }

    public String getStorePassword() {
        return storePassword;
    }

    public void setStorePassword(String storePassword) {
        this.storePassword = storePassword;
    }

    public Date getStoreCreateTime() {
        return storeCreateTime;
    }

    public void setStoreCreateTime(Date storeCreateTime) {
        this.storeCreateTime = storeCreateTime;
    }

    public Date getStoreUpdateTime() {
        return storeUpdateTime;
    }

    public void setStoreUpdateTime(Date storeUpdateTime) {
        this.storeUpdateTime = storeUpdateTime;
    }

    public String getStoreState() {
        return storeState;
    }

    public void setStoreState(String storeState) {
        this.storeState = storeState;
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
        StoreAccount other = (StoreAccount) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStoreAccount() == null ? other.getStoreAccount() == null : this.getStoreAccount().equals(other.getStoreAccount()))
            && (this.getStorePassword() == null ? other.getStorePassword() == null : this.getStorePassword().equals(other.getStorePassword()))
            && (this.getStoreCreateTime() == null ? other.getStoreCreateTime() == null : this.getStoreCreateTime().equals(other.getStoreCreateTime()))
            && (this.getStoreUpdateTime() == null ? other.getStoreUpdateTime() == null : this.getStoreUpdateTime().equals(other.getStoreUpdateTime()))
            && (this.getStoreState() == null ? other.getStoreState() == null : this.getStoreState().equals(other.getStoreState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStoreAccount() == null) ? 0 : getStoreAccount().hashCode());
        result = prime * result + ((getStorePassword() == null) ? 0 : getStorePassword().hashCode());
        result = prime * result + ((getStoreCreateTime() == null) ? 0 : getStoreCreateTime().hashCode());
        result = prime * result + ((getStoreUpdateTime() == null) ? 0 : getStoreUpdateTime().hashCode());
        result = prime * result + ((getStoreState() == null) ? 0 : getStoreState().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", storeAccount=").append(storeAccount);
        sb.append(", storePassword=").append(storePassword);
        sb.append(", storeCreateTime=").append(storeCreateTime);
        sb.append(", storeUpdateTime=").append(storeUpdateTime);
        sb.append(", storeState=").append(storeState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
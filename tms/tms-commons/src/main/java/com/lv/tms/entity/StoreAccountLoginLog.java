package com.lv.tms.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class StoreAccountLoginLog implements Serializable {
    private Integer id;

    /**
     * 销售点登陆ip
     */
    private String storeAccountLoginIp;

    /**
     * 销售点登陆时间
     */
    private Date storeAccountLoginTime;

    /**
     * 销售点id
     */
    private Integer storeAccountId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStoreAccountLoginIp() {
        return storeAccountLoginIp;
    }

    public void setStoreAccountLoginIp(String storeAccountLoginIp) {
        this.storeAccountLoginIp = storeAccountLoginIp;
    }

    public Date getStoreAccountLoginTime() {
        return storeAccountLoginTime;
    }

    public void setStoreAccountLoginTime(Date storeAccountLoginTime) {
        this.storeAccountLoginTime = storeAccountLoginTime;
    }

    public Integer getStoreAccountId() {
        return storeAccountId;
    }

    public void setStoreAccountId(Integer storeAccountId) {
        this.storeAccountId = storeAccountId;
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
        StoreAccountLoginLog other = (StoreAccountLoginLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStoreAccountLoginIp() == null ? other.getStoreAccountLoginIp() == null : this.getStoreAccountLoginIp().equals(other.getStoreAccountLoginIp()))
            && (this.getStoreAccountLoginTime() == null ? other.getStoreAccountLoginTime() == null : this.getStoreAccountLoginTime().equals(other.getStoreAccountLoginTime()))
            && (this.getStoreAccountId() == null ? other.getStoreAccountId() == null : this.getStoreAccountId().equals(other.getStoreAccountId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStoreAccountLoginIp() == null) ? 0 : getStoreAccountLoginIp().hashCode());
        result = prime * result + ((getStoreAccountLoginTime() == null) ? 0 : getStoreAccountLoginTime().hashCode());
        result = prime * result + ((getStoreAccountId() == null) ? 0 : getStoreAccountId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", storeAccountLoginIp=").append(storeAccountLoginIp);
        sb.append(", storeAccountLoginTime=").append(storeAccountLoginTime);
        sb.append(", storeAccountId=").append(storeAccountId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
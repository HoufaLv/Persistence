package com.lv.tms.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Store implements Serializable {
    private Integer id;

    /**
     * 销售点名称
     */
    private String storeName;

    /**
     * 销售点法人
     */
    private String storeManager;

    /**
     * 销售点电话
     */
    private String storeTel;

    /**
     * 销售点地址
     */
    private String storeAddress;

    /**
     * 销售点经度
     */
    private String storeGeolongitude;

    /**
     * 销售点纬度
     */
    private String storeGeolatitude;

    /**
     * 销售点营业执照
     */
    private String storeAttachment;

    /**
     * 销售点创建时间
     */
    private Date storeCreateTime;

    /**
     * 销售点更新时间
     */
    private Date storeUpdateTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreManager() {
        return storeManager;
    }

    public void setStoreManager(String storeManager) {
        this.storeManager = storeManager;
    }

    public String getStoreTel() {
        return storeTel;
    }

    public void setStoreTel(String storeTel) {
        this.storeTel = storeTel;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public String getStoreGeolongitude() {
        return storeGeolongitude;
    }

    public void setStoreGeolongitude(String storeGeolongitude) {
        this.storeGeolongitude = storeGeolongitude;
    }

    public String getStoreGeolatitude() {
        return storeGeolatitude;
    }

    public void setStoreGeolatitude(String storeGeolatitude) {
        this.storeGeolatitude = storeGeolatitude;
    }

    public String getStoreAttachment() {
        return storeAttachment;
    }

    public void setStoreAttachment(String storeAttachment) {
        this.storeAttachment = storeAttachment;
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
        Store other = (Store) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStoreName() == null ? other.getStoreName() == null : this.getStoreName().equals(other.getStoreName()))
            && (this.getStoreManager() == null ? other.getStoreManager() == null : this.getStoreManager().equals(other.getStoreManager()))
            && (this.getStoreTel() == null ? other.getStoreTel() == null : this.getStoreTel().equals(other.getStoreTel()))
            && (this.getStoreAddress() == null ? other.getStoreAddress() == null : this.getStoreAddress().equals(other.getStoreAddress()))
            && (this.getStoreGeolongitude() == null ? other.getStoreGeolongitude() == null : this.getStoreGeolongitude().equals(other.getStoreGeolongitude()))
            && (this.getStoreGeolatitude() == null ? other.getStoreGeolatitude() == null : this.getStoreGeolatitude().equals(other.getStoreGeolatitude()))
            && (this.getStoreAttachment() == null ? other.getStoreAttachment() == null : this.getStoreAttachment().equals(other.getStoreAttachment()))
            && (this.getStoreCreateTime() == null ? other.getStoreCreateTime() == null : this.getStoreCreateTime().equals(other.getStoreCreateTime()))
            && (this.getStoreUpdateTime() == null ? other.getStoreUpdateTime() == null : this.getStoreUpdateTime().equals(other.getStoreUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStoreName() == null) ? 0 : getStoreName().hashCode());
        result = prime * result + ((getStoreManager() == null) ? 0 : getStoreManager().hashCode());
        result = prime * result + ((getStoreTel() == null) ? 0 : getStoreTel().hashCode());
        result = prime * result + ((getStoreAddress() == null) ? 0 : getStoreAddress().hashCode());
        result = prime * result + ((getStoreGeolongitude() == null) ? 0 : getStoreGeolongitude().hashCode());
        result = prime * result + ((getStoreGeolatitude() == null) ? 0 : getStoreGeolatitude().hashCode());
        result = prime * result + ((getStoreAttachment() == null) ? 0 : getStoreAttachment().hashCode());
        result = prime * result + ((getStoreCreateTime() == null) ? 0 : getStoreCreateTime().hashCode());
        result = prime * result + ((getStoreUpdateTime() == null) ? 0 : getStoreUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", storeName=").append(storeName);
        sb.append(", storeManager=").append(storeManager);
        sb.append(", storeTel=").append(storeTel);
        sb.append(", storeAddress=").append(storeAddress);
        sb.append(", storeGeolongitude=").append(storeGeolongitude);
        sb.append(", storeGeolatitude=").append(storeGeolatitude);
        sb.append(", storeAttachment=").append(storeAttachment);
        sb.append(", storeCreateTime=").append(storeCreateTime);
        sb.append(", storeUpdateTime=").append(storeUpdateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
package com.lv.entity;

import java.io.Serializable;

/**
 * @author 
 */
public class TAddress implements Serializable {
    /**
     * 索引ID
     */
    private Integer id;

    /**
     * 地区名称
     */
    private String addressName;

    /**
     * 地区父ID
     */
    private Integer parentId;

    /**
     * 排序
     */
    private Byte areaSort;

    /**
     * 地区深度，从1开始
     */
    private Boolean addressLevel;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Byte getAreaSort() {
        return areaSort;
    }

    public void setAreaSort(Byte areaSort) {
        this.areaSort = areaSort;
    }

    public Boolean getAddressLevel() {
        return addressLevel;
    }

    public void setAddressLevel(Boolean addressLevel) {
        this.addressLevel = addressLevel;
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
        TAddress other = (TAddress) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAddressName() == null ? other.getAddressName() == null : this.getAddressName().equals(other.getAddressName()))
            && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()))
            && (this.getAreaSort() == null ? other.getAreaSort() == null : this.getAreaSort().equals(other.getAreaSort()))
            && (this.getAddressLevel() == null ? other.getAddressLevel() == null : this.getAddressLevel().equals(other.getAddressLevel()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAddressName() == null) ? 0 : getAddressName().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        result = prime * result + ((getAreaSort() == null) ? 0 : getAreaSort().hashCode());
        result = prime * result + ((getAddressLevel() == null) ? 0 : getAddressLevel().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", addressName=").append(addressName);
        sb.append(", parentId=").append(parentId);
        sb.append(", areaSort=").append(areaSort);
        sb.append(", addressLevel=").append(addressLevel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
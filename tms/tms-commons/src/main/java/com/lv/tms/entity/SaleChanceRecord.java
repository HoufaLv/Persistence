package com.lv.tms.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class SaleChanceRecord implements Serializable {
    private Integer id;

    /**
     * 关联销售机会id
     */
    private Integer saleChanceId;

    /**
     * 销售机会创建时间
     */
    private Date saleChanceRecordCreateTime;

    /**
     * 跟进内容
     */
    private String content;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSaleChanceId() {
        return saleChanceId;
    }

    public void setSaleChanceId(Integer saleChanceId) {
        this.saleChanceId = saleChanceId;
    }

    public Date getSaleChanceRecordCreateTime() {
        return saleChanceRecordCreateTime;
    }

    public void setSaleChanceRecordCreateTime(Date saleChanceRecordCreateTime) {
        this.saleChanceRecordCreateTime = saleChanceRecordCreateTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
        SaleChanceRecord other = (SaleChanceRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSaleChanceId() == null ? other.getSaleChanceId() == null : this.getSaleChanceId().equals(other.getSaleChanceId()))
            && (this.getSaleChanceRecordCreateTime() == null ? other.getSaleChanceRecordCreateTime() == null : this.getSaleChanceRecordCreateTime().equals(other.getSaleChanceRecordCreateTime()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSaleChanceId() == null) ? 0 : getSaleChanceId().hashCode());
        result = prime * result + ((getSaleChanceRecordCreateTime() == null) ? 0 : getSaleChanceRecordCreateTime().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", saleChanceId=").append(saleChanceId);
        sb.append(", saleChanceRecordCreateTime=").append(saleChanceRecordCreateTime);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
package com.lv.entity;

import java.io.Serializable;

/**
 * @author 
 */
public class Permission implements Serializable {
    private Integer id;

    private String permissionName;

    private String permissionCode;

    private String permissionType;

    private String permissionUrl;

    private Integer parentId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getPermissionCode() {
        return permissionCode;
    }

    public void setPermissionCode(String permissionCode) {
        this.permissionCode = permissionCode;
    }

    public String getPermissionType() {
        return permissionType;
    }

    public void setPermissionType(String permissionType) {
        this.permissionType = permissionType;
    }

    public String getPermissionUrl() {
        return permissionUrl;
    }

    public void setPermissionUrl(String permissionUrl) {
        this.permissionUrl = permissionUrl;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
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
        Permission other = (Permission) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPermissionName() == null ? other.getPermissionName() == null : this.getPermissionName().equals(other.getPermissionName()))
            && (this.getPermissionCode() == null ? other.getPermissionCode() == null : this.getPermissionCode().equals(other.getPermissionCode()))
            && (this.getPermissionType() == null ? other.getPermissionType() == null : this.getPermissionType().equals(other.getPermissionType()))
            && (this.getPermissionUrl() == null ? other.getPermissionUrl() == null : this.getPermissionUrl().equals(other.getPermissionUrl()))
            && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPermissionName() == null) ? 0 : getPermissionName().hashCode());
        result = prime * result + ((getPermissionCode() == null) ? 0 : getPermissionCode().hashCode());
        result = prime * result + ((getPermissionType() == null) ? 0 : getPermissionType().hashCode());
        result = prime * result + ((getPermissionUrl() == null) ? 0 : getPermissionUrl().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", permissionName=").append(permissionName);
        sb.append(", permissionCode=").append(permissionCode);
        sb.append(", permissionType=").append(permissionType);
        sb.append(", permissionUrl=").append(permissionUrl);
        sb.append(", parentId=").append(parentId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
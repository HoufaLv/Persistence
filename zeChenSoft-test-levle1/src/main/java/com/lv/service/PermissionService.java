package com.lv.service;

import com.lv.entity.Permission;

import java.util.List;

public interface PermissionService {
    /**
     * 查询所有权限列表
     * @return
     */
    List<Permission> selectAllPermission();
}

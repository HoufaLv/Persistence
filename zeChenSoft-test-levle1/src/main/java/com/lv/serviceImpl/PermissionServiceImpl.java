package com.lv.serviceImpl;

import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import com.lv.entity.Permission;
import com.lv.entity.PermissionExample;
import com.lv.mapper.PermissionMapper;
import com.lv.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionMapper permissionMapper;

    /**
     * 查询所有权限列表
     *
     * @return
     */
    @Override
    public List<Permission> selectAllPermission() {
        PermissionExample permissionExample = new PermissionExample();
        List<Permission> permissionList = permissionMapper.selectByExample(permissionExample);

        ArrayList<Permission> resultList = new ArrayList<>();
        //转换为树形集合结果
        treeList(permissionList,resultList,0);
        return resultList;
    }

    /**
     * 将查询数据库的权限列表转换为 树形集合结果
     * @param sourceList         数据库查询出的集合
     * @param endList            转换结束之后的结果集合
     * @param parentId           父id
     */
    private void treeList(List<Permission> sourceList, ArrayList<Permission> endList, int parentId) {
        List<Permission> tempList = Lists.newArrayList(Collections2.filter(sourceList,permission -> permission.getParentId().equals(parentId)));

        for (Permission permission : tempList) {
            endList.add(permission);
            treeList(sourceList,endList,permission.getId());
        }
    }
}

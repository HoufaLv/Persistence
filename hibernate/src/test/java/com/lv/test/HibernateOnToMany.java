package com.lv.test;

import com.lv.pojo.Address;
import com.lv.pojo.User;
import com.lv.util.HibernateUtil;
import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HibernateOnToMany {

    private Session session;

    /**
     * 测试前置，完成session 配置
     */
    @Before
    public void init() {
        session = HibernateUtil.getSession();
        session.beginTransaction();
    }

    /**
     * 测试后置，提交事务
     */
    @After
    public void close() {
        session.getTransaction().commit();
    }

    /**
     * 根据地址查出来对应的User 对象信息
     */
    @Test
    public void testQueryAddress() {
        //查询地址
        Address address = (Address) session.get(Address.class, 1);

        //查询地址对应的User 对象
        System.out.println("地址： " + address.getAddressname() + "电话：" + address.getTel());

        //延迟加载，如果需要1，则再次发出请求，进行查询，不能session close 之后进行查询
        System.out.println("关联用户名： " + address.getUser().getUsername());

    }

    /**
     * 保存一个新地址，并创建关联关系
     */
    @Test
    public void saveAddressWithUser(){
        User user = (User) session.get(User.class, 1);

        Address address = new Address("纽约市", "555", user);

        session.save(address);
    }
}

package com.lv.test;

import com.lv.pojo.Order;
import com.lv.util.HibernateUtil;
import org.hibernate.LockOptions;
import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HibernateLockTest {

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

    @Test
    public void lockTestCase(){
        Order order = new Order();
        order.setName("iphone 11");

        session.save(order);
    }

    @Test
    public void update() throws InterruptedException {
        Order order = (Order) session.get(Order.class,"40285c8164039e7b0164039e7d7f0000");

        //如果有别的线程修改version，将会抛出异常
        Thread.sleep(5000);

        order.setName("iphone9");
        session.save(order);
    }


    @Test
    public void updateLocal(){
        Order order = (Order) session.get(Order.class,"40285c8164039e7b0164039e7d7f0000",LockOptions.UPGRADE);
        System.out.println(order.getName());
    }
}

package com.lv.test;

import com.lv.pojo.Order;
import com.lv.util.HibernateUtil;
import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HibernateUUIDTest {

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
     * 将配置文件中的主键生成策略修改为UUID，则保存对象的时候，id由uuid 自动生成，不需要指定，指定也没用
     */
    @Test
    public void insertTest(){
        Order order = new Order();
        order.setName("iphone x");

        session.save(order);
    }

    /**
     * 在同一个session中对象将会被缓存，第二次查询将不过数据库，直接查询
     */
    @Test
    public void testCache(){
        String id = "40285c81640309a401640309a68e0000";

        //只会查询一次
        Order order = (Order) session.get(Order.class,id);
        Order order2 = (Order) session.get(Order.class,id);

        System.out.println(order.getName() + order2.getName());

        //判断对象是否在缓存中
        boolean contains = session.contains(order2);

        if (contains) {
            System.out.println("order2 对象存在缓存中");
        }

        //将对象逐出缓存
        session.evict(order2);

        System.out.println(order2.getName());
    }

}

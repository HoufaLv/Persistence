package com.lv.test;

import com.lv.pojo.Account;
import com.lv.util.HibernateUtil;
import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HibernateGetLoadTest {
    private Session session;

    /**
     * 测试前置，完成session 配置
     */
    @Before
    public void init(){
        session = HibernateUtil.getSession();
        session.beginTransaction();
    }

    /**
     * 测试后置，提交事务
     */
    @After
    public void close(){
        session.getTransaction().commit();
    }


    @Test
    public void hibernateGetTestCase(){
        //session.get & session.load 的区别
        //1.get和load都是使用对象的主键值获取相应的对象，并可以将对象处于持久态
        //2.get 会立即去查询，load只在使用的时候才去查询

        Account account = (Account) session.load(Account.class,10);
        System.out.println(account);
    }

}

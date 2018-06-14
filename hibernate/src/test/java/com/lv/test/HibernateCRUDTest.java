package com.lv.test;

import com.lv.pojo.Account;
import com.lv.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class HibernateCRUDTest {

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


    /**
     * 插入行数据
     */
    @Test
    public void insertObjectTestCase(){
        Account account = new Account("lucy","shanghai");
        session.save(account);
    }

    /**
     * 删除行数据
     */
    @Test
    public void deleteObjectTestCase(){
       Account account = (Account) session.get(Account.class,1);
       session.delete(account);
    }

    /**
     * 修改行数据
     */
    @Test
    public void updateObjectTestCase(){
        Account account = (Account) session.get(Account.class,2);
        account.setAddress("shanghai");
    }

    /**
     * 根据主键查找对象
     */
    @Test
    public void selectObjectTestCase(){
        Account account = (Account) session.get(Account.class, 2);
        System.out.println(account);
    }

    /**
     * 查找所有对象
     */
    @Test
    public void listObjectTestCase(){
        //查找所有对象，要提供的是类名，不是表名，会返回一个Query对象
        Query from_account = session.createQuery("from Account");
        List<Account> accountList = from_account.list();

        for (Account account : accountList) {
            System.out.println(account);
        }
    }


}


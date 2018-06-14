package com.lv.test;

import com.lv.pojo.Account;
import com.lv.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class HibernateHQLTest {

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
     * 使用hql 查询所有
     */
    @Test
    public void testHqlList(){
        String hql = "from Account";
        Query query = session.createQuery(hql);

        List<Account> accountList = query.list();
        for (Account account : accountList) {
            System.out.println(account);
        }

    }

    /**
     * 测试hql where 条件语句查询
     */
    @Test
    public void testHqlWhere(){
        String hql = "from Account where username <> 'jack'";
        Query query = session.createQuery(hql);
        List<Account> accountList = query.list();
        for (Account account : accountList) {
            System.out.println(account);
        }
    }


    /**
     * 测试 条件查询，使用？占位符
     */
    @Test
    public void testHqlQueryByUsername(){
        String hql = "from Account where username = ?";
        Query query = session.createQuery(hql);

        //占位符从0 开始
        query.setString(0,"jack");

        List<Account> accountList  = query.list();
        for (Account account : accountList) {
            System.out.println(account);
        }
    }

    /**
     * 测试 条件查询，使用：占位符
     */
    @Test
    public void testHqlQueryByAddress(){
        //也可以使用：占位符，后面跟属性的方式来查询
        String hql = "from Account where address = :address";

        Query query = session.createQuery(hql);
        query.setParameter("address","shanghai");
        List<Account> accountList = query.list();
        for (Account account : accountList) {
            System.out.println(account);
        }
    }

    /**
     * 分页查询
     */
    @Test
    public void testHqlQueryPage(){
        String hql = "from Account";
        Query query = session.createQuery(hql);

        //设置起始行数据
        //设置结束行数据
        query.setFirstResult(2);
        query.setMaxResults(2);

        List<Account> accountList = query.list();
        for (Account account : accountList) {
            System.out.println(account);
        }
    }

    /**
     * 查询不完整对象，返回的是一个List<Object []>
     */
    @Test
    public void testQueryPartParam(){
        String hql = "select username,address from Account";
        Query query = session.createQuery(hql);
        List<Object[]> list = query.list();

        for (Object[] objects : list) {
            System.out.println(objects[0] + "->"+ objects[1]);
        }
    }

    /**
     * 查询单列是一个Object对象，不是数组
     */
    @Test
    public void testQueryAnParam(){
        String hql = "select id from Account";
        Query query = session.createQuery(hql);

        List<Object> objects = query.list();

        for (Object object : objects) {
            System.out.println(object);
        }
    }

    /**
     * 查询单行记录，count 会返回表中的行数
     */
    @Test
    public void testCount(){
        //查询单行单列的值
        String hql = "select count(*) from Account";

        Query query = session.createQuery(hql);
        Object count = query.uniqueResult();

        System.out.println(count);
    }
}


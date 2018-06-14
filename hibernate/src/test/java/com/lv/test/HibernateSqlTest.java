package com.lv.test;

import com.lv.pojo.Account;
import com.lv.util.HibernateUtil;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * 使用原生sql 查询，理论上原生sql 最快，但是移植性和面向对象特征会丧失
 */
public class HibernateSqlTest {

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
     * 使用原生sql 查询，返回的是Object 数组，每一行数据都是一个数组，解析数组可以得到结果
     */
    @Test
    public void testSqlQuery() {
        String sql = "select id,username,address from account";

        List list = session.createSQLQuery(sql).list();

        for (Object o : list) {
            Object[] objects = (Object[]) o;
            System.out.println("data: ->" + objects[0] + objects[1] + objects[2]);
        }
    }

    @Test
    public void testSqlQueryToEntity() {
        String sql = "select id,username,address from account";

        List list = session.createSQLQuery(sql).list();

        for (Object o : list) {
            Object[] objects = (Object[]) o;
            System.out.println("data: ->" + objects[0] + objects[1] + objects[2]);
        }
    }

}

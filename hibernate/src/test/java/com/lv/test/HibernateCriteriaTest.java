package com.lv.test;

import com.lv.pojo.Account;
import com.lv.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * 通过session 创建，每个session 只能查询一个Pojo
 */
public class HibernateCriteriaTest {

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
     * Criteria 查询所有
     */
    @Test
    public void testCriteriaList() {
        //创建criteria 对象，每个criteria 对象只能对一个实体类进行查询
        Criteria criteria = session.createCriteria(Account.class);
        List<Account> accountList = criteria.list();

        for (Account account : accountList) {
            System.out.println(account);
        }
    }

    /**
     * where 条件查询
     */
    @Test
    public void testCriteriaWhere() {

        Criteria criteria = session.createCriteria(Account.class);
        //通过Restrictions来添加查询条件
        criteria.add(Restrictions.eq("username", "jack"));
        List<Account> accountList = criteria.list();

        for (Account account : accountList) {
            System.out.println(account);
        }
    }

    /**
     * in 查询
     */
    @Test
    public void testCriteriaIn() {
        Criteria criteria = session.createCriteria(Account.class);

        criteria.add(Restrictions.in("id", new Integer[]{1, 2, 3}));
        List<Account> accountList = criteria.list();
        for (Account account : accountList) {
            System.out.println(account);
        }
    }

    /**
     * like 查询
     */
    @Test
    public void testCriteriaLike() {
        Criteria criteria = session.createCriteria(Account.class);

        //使用MathcMode 来匹配like，有默认，start，end，anyWhere 可选的匹配模式
        criteria.add(Restrictions.like("username", "o", MatchMode.ANYWHERE));

        List<Account> accountList = criteria.list();
        for (Account account : accountList) {
            System.out.println(account);
        }
    }

    /**
     * 分页查询
     */
    @Test
    public void testCriteriaPage() {
        Criteria criteria = session.createCriteria(Account.class);

        //查询前三条数据
        criteria.setFirstResult(0);
        criteria.setMaxResults(3);

        criteria.addOrder(Order.desc("id"));

        List<Account> accountList = criteria.list();
        for (Account account : accountList) {
            System.out.println(account);
        }
    }


    /**
     * or 条件查询,使用Disjunction
     */
    @Test
    public void testCriteriaOr() {
        Criteria criteria = session.createCriteria(Account.class);

        //创建条件
        Disjunction disjunction = Restrictions.disjunction();
        disjunction.add(Restrictions.eq("address", "shenzhen"));
        disjunction.add(Restrictions.eq("address", "henan"));

        //添加条件
        criteria.add(disjunction);

        List<Account> accountList = criteria.list();
        for (Account account : accountList) {
            System.out.println(account);
        }
    }


    /**
     * 分组与聚合，count,max,min 等聚合函数
     */
    @Test
    public void testCriteriaCount() {
        Criteria criteria = session.createCriteria(Account.class);

        //这个相当于是count(id),会忽略空值行
        criteria.setProjection(Projections.count("address"));

        //这个相当于是count(*)
        //criteria.setProjection(Projections.rowCount());
        //单行单列，可以使用unique来查询
        Object o = criteria.uniqueResult();

        System.out.println(o);
    }

    /**
     * 分组聚合，多个统计分组
     */
    @Test
    public void testCriteriaCountMax() {
        Criteria criteria = session.createCriteria(Account.class);

        //创建条件列表
        ProjectionList projectionList = Projections.projectionList();
        //逐步添加条件
        projectionList.add(Projections.count("address"));
        projectionList.add(Projections.max("id"));

        //设置查询条件
        criteria.setProjection(projectionList);

        //查询
        Object[] o = (Object[]) criteria.uniqueResult();

        System.out.println("count of address: " +o[0] + "max of id: " + o[1]);

    }

}

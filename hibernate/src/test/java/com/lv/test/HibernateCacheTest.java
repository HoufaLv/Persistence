package com.lv.test;

import com.lv.pojo.Order;
import com.lv.util.HibernateUtil;
import org.hibernate.Cache;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;

public class HibernateCacheTest {

    /**
     * 二级缓存测试
     * 在.hbm.xml 文件中配置 二级缓存后，同一个SessionFactory 产生的Session 都可以使用
     */
    @Test
    public void level2CacheTestCase() {
        String id = "40285c81640309a401640309a68e0000";

        Session session = HibernateUtil.getSession();
        Order order = (Order) session.get(Order.class,id);

        //怎样清除缓存,清除缓存之后，就不会从缓存中获取数据
        Cache cache = HibernateUtil.getSessionFactory().getCache();
        cache.evictEntityRegion(Order.class);

        Session session1 = HibernateUtil.getSession();
        Order order1 = (Order) session1.get(Order.class,id);


    }
}

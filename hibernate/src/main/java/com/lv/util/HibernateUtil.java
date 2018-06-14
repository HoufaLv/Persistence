package com.lv.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * 创建Hibernate 单例工具类
 */
public class HibernateUtil {

    private static SessionFactory sessionFactory = builderSessionFactory();

    /**
     * 创造Session工厂
     * @return
     */
    private static SessionFactory builderSessionFactory() {

        Configuration configuration = new Configuration().configure();
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();

        return configuration.buildSessionFactory(serviceRegistry);
    }

    /**
     * 返回session工厂
     * @return
     */
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }

    /**
     * 返回session
     * @return
     */
    public static Session getSession(){
        return sessionFactory.openSession();
    }
}

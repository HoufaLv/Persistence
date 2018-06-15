package com.lv.test;

import com.lv.pojo.Card;
import com.lv.pojo.Person;
import com.lv.util.HibernateUtil;
import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HibernateOneToOneTest {

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
     * 保存1 对1 关系
     */
    @Test
    public void saveTestCase() {
        Person person = new Person();
        person.setName("王美丽");

        Card card = new Card();
        card.setName("0x00001");

        card.setPerson(person);

        session.save(person);
        session.save(card);
    }

    @Test
    public void queryTestCase() {
        Person person = (Person) session.get(Person.class, 1);
        System.out.println("人称姓名：" + person.getName());
        Card card = person.getCard();
        System.out.println("身份证号:" + card.getName());

    }

    /**
     * 删除人，同时删除身份证，做一下级联删除
     */
    @Test
    public void deletePersonWithCard(){
        Person person = (Person) session.get(Person.class, 1);
        session.delete(person);

    }
}

package com.lv.test;

import com.lv.pojo.Address;
import com.lv.pojo.User;
import com.lv.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Set;

public class HibernateOnToMany {

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
     * 根据地址查出来对应的User 对象信息
     */
    @Test
    public void testQueryAddress() {
        //查询地址
        Address address = (Address) session.get(Address.class, 1);

        //查询地址对应的User 对象
        System.out.println("地址： " + address.getAddressname() + "电话：" + address.getTel());

        //延迟加载，如果需要1，则再次发出请求，进行查询，不能session close 之后进行查询
        System.out.println("关联用户名： " + address.getUser().getUsername());

    }

    /**
     * 保存一个新地址，并创建关联关系
     */
    @Test
    public void saveAddressWithUser(){
        User user = (User) session.get(User.class, 1);

        Address address = new Address("纽约市", "555", user);

        session.save(address);
    }

    /**
     * 同时保存Address和User
     * 保存时，先保存1，再保存多，这个是最佳实践
     */
    @Test
    public void saveUserAddress() {

        User user = new User();
        user.setUsername("Rose");

        Address address = new Address();
        address.setAddressname("皇后区");
        address.setTel("666");
        address.setUser(user);

        session.save(user);
        session.save(address);
    }

    /**
     * 查询一个用户，加载用户对应的地址,不常见
     */
    @Test
    public void queryByUserId(){
        User user = (User) session.get(User.class, 1);

        Set<Address> addressSet = user.getAddressSet();

        //延迟加载
        System.out.println(user.getUsername());
        for (Address address : addressSet) {
            System.out.println(address.getId() +  address.getAddressname());
        }
    }

    /**
     * 通过用户id 查询地址
     */
    @Test
    public void queryAddressByUserId(){
        //地址里面封装了一个User，先将地址list，再查询地址List 中userId 为特定值的数据
        Criteria criteria = session.createCriteria(Address.class);

        //查询userId 为2的对应数据
        criteria.add(Restrictions.eq("user.id",2));
        List<Address> addressList = criteria.list();

        for (Address address : addressList) {
            System.out.println(address.getAddressname());
        }
    }

    /**
     * 级联删除，删除User同时删除用户的地址
     * 如果不放弃关系维护，则无法删除
     */
    @Test
    public void deleteUserAndAddress(){
        User user = (User) session.get(User.class,4);

        session.delete(user);
    }

}

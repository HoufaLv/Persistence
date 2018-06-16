package com.lv.dao;

import com.lv.pojo.Account;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccountDao {

    @Autowired
    private SessionFactory sessionFactory;


    /**
     * 获取session
     * @return
     */
    public Session getSession(){
        return sessionFactory.getCurrentSession();
    }


    /**
     * 根据id 查找Account
     *
     * @param id
     * @return
     */
    public Account selectAccountById(Integer id) {
        return (Account) getSession().get(Account.class, 1);
    }

    /**
     * 保存Account 对象
     * @param account
     */
    public void saveAccount(Account account){
        getSession().saveOrUpdate(account);
    }

    /**
     * 删除Account 对象
     * @param account
     */
    public void deleteAccount(Account account){
        getSession().delete(account);
    }

    /**
     * 增加Account
     * @param account
     */
    public void insertAccount(Account account){
        getSession().saveOrUpdate(account);
    }

    /**
     * 查询所有Account
     * @return
     */
    public List<Account> listAccount(){
        Criteria criteria = getSession().createCriteria(Account.class);
        return criteria.list();
    }

    /**
     * 根据任意参数查询对应结果
     * @param propertyName
     * @param value
     * @return
     */
    public List<Account> listByParam(String propertyName,Object value){
        Criteria criteria = getSession().createCriteria(Account.class);
        criteria.add(Restrictions.eq(propertyName,value));
        return criteria.list();
    }
}

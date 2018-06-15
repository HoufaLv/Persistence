package com.lv.service;

import com.lv.dao.AccountDao;
import com.lv.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
//所有方法都有事物，自动提交，回滚
@Transactional(rollbackFor = RuntimeException.class)
public class AccountService {

    @Autowired
    private AccountDao accountDao;

    /**
     * 根据id 返回Account
     * @param id
     * @return
     */
    public Account selectAccountById(Integer id){
        return accountDao.selectAccountById(id);
    }

    /**
     * 保存一个Account 对象
     * @param account
     */
    public void saveAccount(Account account){
        accountDao.saveAccount(account);
    }

    /**
     * 删除Account
     * @param account
     */
    public void deleteAccount(Account account){
        accountDao.deleteAccount(account);
    }

    public void insertAccount(Account account){
        accountDao.insertAccount(account);
    }

    public List<Account> listAccount(){
        return accountDao.listAccount();
    }
}

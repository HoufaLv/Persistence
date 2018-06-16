package com.lv.service;

import com.lv.pojo.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;



    @Test
    public void selectAccountById() {
        Account account = accountService.selectAccountById(1);
        System.out.println(account);
    }

    @Test
    public void updateAccount(){
        Account account = accountService.selectAccountById(1);
        account.setName("王美丽");

        accountService.saveAccount(account);
    }

    /**
     * 测试 删除账户
     */
    @Test
    public void deleteAccount(){
        accountService.deleteAccount(accountService.selectAccountById(1));
    }

    @Test
    public void insertAccount(){
        Account account = new Account();
        account.setName("苏东坡");
        account.setAddress("jiangsu");
        accountService.insertAccount(account);
    }

    @Test
    public void listAccount(){
        List<Account> accountList = accountService.listAccount();
        for (Account account : accountList) {
            System.out.println(account.getName());
        }
    }
}
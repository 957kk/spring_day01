package com.itheima.sm.service.impl;

import com.itheima.sm.dao.AccountDao;
import com.itheima.sm.domain.Account;
import com.itheima.sm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author byZhao
 * @Modify 2021/9/4 18:55
 * Talk is cheap. Show me the code.
 */
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void save(Account account) {
        accountDao.insertAccount(account);
    }
}

package com.example.store.service.impl;

import com.example.store.dao.AccountDao;
import com.example.store.domain.Account;
import com.example.store.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountServiceImpl implements AccountService {


    @Autowired
    private AccountDao accountDao;
    public boolean save(Account account) {
        accountDao.save(account);
        return false;
    }

    public boolean delete(String username) {
        accountDao.delete(username);
        return false;
    }

    public boolean update(Account account) {
        accountDao.update(account);
        return false;
    }

    public List<Account> findAll() {
        return accountDao.findAll();
    }

    public Account findUser(String username) {
        return accountDao.findUser(username);
    }
}


package com.example.store.service;

import com.example.store.domain.Account;

import java.util.List;

public interface AccountService {

    boolean save(Account account);

    boolean delete(String username);

    boolean update(Account account);

    List<Account> findAll();

    Account findUser(String username);

}

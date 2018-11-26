package org.spring.boot.example.servlet.service.impl;

import org.spring.boot.example.servlet.repository.AccountRepository;
import org.spring.boot.example.servlet.service.AccountService;
import org.springframework.stereotype.Service;

/**
 * 构造注入示例
 */
@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    @Override
    public Integer createAccount() {
        return accountRepository.insertAccount();
    }
}

package org.spring.boot.example.servlet.service.impl;

import org.spring.boot.example.servlet.service.AccountService;
import org.spring.boot.example.servlet.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * 构造注入示例
 */
@Service
public class AccountServiceImpl implements AccountService {

    private final OrderService orderService;

    public AccountServiceImpl(OrderService orderService){
        this.orderService = orderService;
    }

    @Override
    public Integer createAccount() {
        return null;
    }
}

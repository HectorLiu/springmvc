package com.hector.service.impl;

import com.hector.domain.Account;
import com.hector.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Override
    public List<Account> findAll() {
        System.out.println("find all service method");
        return null;
    }
}

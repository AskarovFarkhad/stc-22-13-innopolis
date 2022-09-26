package com.example.springbootlesson.web.services;

import com.example.springbootlesson.web.dto.SignUpForm;
import com.example.springbootlesson.web.models.Account;

import java.util.List;

public interface AccountService {

    List<Account> getAllAccounts();

    void createAccount(SignUpForm dto);
}

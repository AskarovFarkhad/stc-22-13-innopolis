package com.example.security.web.services;

import com.example.security.web.dto.AccountDto;
import com.example.security.web.dto.SignUpForm;
import com.example.security.web.models.Account;

import java.util.List;

public interface AccountService {

    List<AccountDto> getAllAccounts();

    void createAccount(SignUpForm dto);

    void deleteAccount(Long accountId);
}

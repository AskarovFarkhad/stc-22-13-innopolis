package com.example.springbootlesson.web.services;

import com.example.springbootlesson.web.dto.SignUpForm;
import com.example.springbootlesson.web.models.Account;
import com.example.springbootlesson.web.repositories.AccountsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
    //TODO: дописать методы: findById(), delete()
    private final AccountsRepository accountsRepository;

    @Override
    public List<Account> getAllAccounts() {
        return accountsRepository.findAll();
    }

    @Override
    public void createAccount(SignUpForm dto) {
        Account account = Account.builder()
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .email(dto.getEmail())
                .password(dto.getPassword())
                .build();
        accountsRepository.save(account);
    }
}

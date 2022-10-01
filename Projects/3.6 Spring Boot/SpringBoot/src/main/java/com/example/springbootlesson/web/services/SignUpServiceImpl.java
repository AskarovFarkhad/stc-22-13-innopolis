package com.example.springbootlesson.web.services;

import com.example.springbootlesson.web.dto.SignUpForm;
import com.example.springbootlesson.web.models.Account;
import com.example.springbootlesson.web.repositories.AccountsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SignUpServiceImpl implements SignUpService {

    private final AccountsRepository accountsRepository;
    @Override
    public void signUp(SignUpForm form) {
        Account account = Account.builder()
                .firstName(form.getFirstName())
                .lastName(form.getLastName())
                .email(form.getEmail())
                .password(form.getPassword())
                .build();

        accountsRepository.save(account);
    }
}

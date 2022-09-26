package com.example.security.web.services;

import com.example.security.web.dto.SignUpForm;
import com.example.security.web.models.Account;
import com.example.security.web.repositories.AccountsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SignUpServiceImpl implements SignUpService {

    private final AccountsRepository accountsRepository;

    private final PasswordEncoder passwordEncoder;
    @Override
    public void signUp(SignUpForm form) {
        Account account = Account.builder()
                .firstName(form.getFirstName())
                .lastName(form.getLastName())
                .email(form.getEmail())
                .role(Account.Role.USER)
                .state(Account.State.NOT_CONFIRMED)
                .password(passwordEncoder.encode(form.getPassword()))
                .build();

        accountsRepository.save(account);
    }
}

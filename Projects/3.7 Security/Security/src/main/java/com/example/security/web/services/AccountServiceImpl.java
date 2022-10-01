package com.example.security.web.services;

import com.example.security.web.dto.AccountDto;
import com.example.security.web.dto.SignUpForm;
import com.example.security.web.models.Account;
import com.example.security.web.repositories.AccountsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
    //TODO: дописать методы: findById(), delete()
    private final AccountsRepository accountsRepository;

    @Override
    public List<AccountDto> getAllAccounts() {
        return AccountDto.from(accountsRepository.findAllByState(Account.State.CONFIRMED));
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

    @Override
    public void deleteAccount(Long accountId) {
        Account account = accountsRepository.getById(accountId);
        account.setState(Account.State.DELETED);
        accountsRepository.save(account);
    }
}

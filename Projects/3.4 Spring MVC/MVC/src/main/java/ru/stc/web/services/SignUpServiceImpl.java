package ru.stc.web.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.stc.web.dto.SignUpForm;
import ru.stc.web.models.Account;
import ru.stc.web.repositories.AccountsRepository;

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

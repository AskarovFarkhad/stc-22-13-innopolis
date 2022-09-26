package com.example.security.web.config.security.details;

import com.example.security.web.repositories.AccountsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class AccountUserDetailsServiceImpl implements UserDetailsService {

    private final AccountsRepository accountsRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return new AccountUserDetailsImpl(
                accountsRepository.findByEmail(email)
                        .orElseThrow(() -> new UsernameNotFoundException("User not found")
                        )
        );
    }
}

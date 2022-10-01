package com.example.security.web.repositories;


import com.example.security.web.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

//JpaRepository<СУЩНОСТЬ, ТИП_ИДЕНТИФИКАТОРА_СУЩНОСТИ>
public interface AccountsRepository extends JpaRepository<Account, Long> {

     Optional<Account> findByEmail(String email);

     List<Account> findAllByState(Account.State state);
}

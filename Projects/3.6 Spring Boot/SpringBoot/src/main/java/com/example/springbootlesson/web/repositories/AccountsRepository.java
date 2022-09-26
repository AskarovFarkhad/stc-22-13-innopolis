package com.example.springbootlesson.web.repositories;


import com.example.springbootlesson.web.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

//JpaRepository<СУЩНОСТЬ, ТИП_ИДЕНТИФИКАТОРА_СУЩНОСТИ>
public interface AccountsRepository extends JpaRepository<Account, Long> {
}

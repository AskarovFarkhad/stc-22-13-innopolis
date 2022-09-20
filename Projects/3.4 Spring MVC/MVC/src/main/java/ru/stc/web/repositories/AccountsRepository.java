package ru.stc.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.stc.web.models.Account;

public interface AccountsRepository extends JpaRepository<Account, Long> {
}

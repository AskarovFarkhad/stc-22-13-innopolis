package com.example.security.web.controllers;

import com.example.security.web.services.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class AccountsController {

    private final AccountService accountService;

    @GetMapping("/accounts")
    public String getAccountsPage(Model model) {
        model.addAttribute("accounts", accountService.getAllAccounts());
        return "accounts";
    }

    @PostMapping("/accounts/{account-id}/delete")
    public String deleteAccount(@PathVariable("account-id") Long accountId) {
        accountService.deleteAccount(accountId);
        return "redirect:/accounts";
    }
}

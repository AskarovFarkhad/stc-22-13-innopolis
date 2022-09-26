package com.example.security.web.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignInController {

    @GetMapping("/signIn")
    public String getSignInPage(Authentication authentication) {
        if (authentication != null) {
            return "redirect:/";
        }
        return "signIn";
    }
}

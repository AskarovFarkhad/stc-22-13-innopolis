package com.example.springbootlesson.web.controllers;

import com.example.springbootlesson.web.dto.SignUpForm;
import com.example.springbootlesson.web.services.SignUpService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
public class SignUpController {

    private final SignUpService signUpService;

    @GetMapping("/signUp")
    public String getSignUpPage(Model model) {
        model.addAttribute( "signUpForm", new SignUpForm());
        return "signUp";
    }

    @PostMapping("/signUp")
    public String signUp(@Valid SignUpForm form, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute(form);
            return "signUp";
        }
        signUpService.signUp(form);
        return "redirect:/signIn";
    }
}

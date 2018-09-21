package com.glancing.controllers;

import com.glancing.model.User;
import com.glancing.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public String userForm(Model model) {
        model.addAttribute("user", new User());
        return "users";
    }

    @PostMapping("/users")
    public String userSubmit(@ModelAttribute User user) {

        userRepository.save(user);
        return "confirmation";
    }
}

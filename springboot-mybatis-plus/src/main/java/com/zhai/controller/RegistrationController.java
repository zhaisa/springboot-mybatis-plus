package com.zhai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhai.security.RegistrationForm;
import com.zhai.sevice.UserService;
@Controller
@RequestMapping("/register")
public class RegistrationController {
	@Autowired
	UserService UserService;
//	private UserRepository userRepo;
	private PasswordEncoder passwordEncoder;

//	@Autowired
//	public RegistrationController(UserRepository userRepo,PasswordEncoder passwordEncoder) {
//		
//		this.userRepo=userRepo;
//		this.passwordEncoder=passwordEncoder;
//	}
//	
	@GetMapping
	public String registerForm() {
		return "registration";
	}

	@PostMapping
	public String processRegistration(RegistrationForm form) {
		UserService.save(form.toUser(passwordEncoder));
		return "redirect:/login";

	}

}

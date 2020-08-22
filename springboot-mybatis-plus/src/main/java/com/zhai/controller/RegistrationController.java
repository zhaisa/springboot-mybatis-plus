package com.zhai.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhai.mapper.UserMapper;
import com.zhai.sevice.UserService;

import lombok.extern.slf4j.Slf4j;

import com.zhai.domain.RegistrationForm;
import com.zhai.domain.User;
@Slf4j
@Controller
@RequestMapping("/register")
public class RegistrationController {
	@Autowired
	UserMapper UserMapper;

//	private UserRepository userRepo;
	@Autowired
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
		log.info("取值- - -   -  -   - >"+"进入方法");
		User user=form.toUser(passwordEncoder);
		log.info("取值- - -   -  -   - >"+user);
		UserMapper.insert(user);
		return "redirect:/login";

	}

}

package com.kjh.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserAccountController {
	
	@RequestMapping("login.do")
	public String GoLoginPage() {
		return "user/account/login";
	}

	@RequestMapping("signup.do")
	public String GoSignUpPage() {
		return "user/account/signup";
	}
}

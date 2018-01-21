package com.kjh.user.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kjh.user.service.UserAccountService;
import com.kjh.user.vo.UserAccountVO;

@Controller
public class UserAccountController {
	
	@Inject
	private UserAccountService accountSvc;
	
	// 로그인 페이지로 이동
	@RequestMapping("login.do")
	public String GoLoginPage() {
		return "user/account/login";
	}

	// 회원가입 페이지로 이동
	@RequestMapping("signup.do")
	public String GoSignUpPage() {
		return "user/account/signup";
	}
	
	// 회원 로그인
	@RequestMapping("userSignIn.do")
	public String SubmitSignIn() {
		
		return "";
	}
	
	// 회원가입
	@RequestMapping("userSignUp.do")
	public String SubmitSignUp(UserAccountVO accountVo) {
		accountSvc.UserSignUp(accountVo);
		return "user/account/login";
	}
}

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
	
	// �α��� �������� �̵�
	@RequestMapping("login.do")
	public String GoLoginPage() {
		return "user/account/login";
	}

	// ȸ������ �������� �̵�
	@RequestMapping("signup.do")
	public String GoSignUpPage() {
		return "user/account/signup";
	}
	
	// ȸ�� �α���
	@RequestMapping("userSignIn.do")
	public String SubmitSignIn() {
		
		return "";
	}
	
	// ȸ������
	@RequestMapping("userSignUp.do")
	public String SubmitSignUp(UserAccountVO accountVo) {
		accountSvc.UserSignUp(accountVo);
		return "user/account/login";
	}
}

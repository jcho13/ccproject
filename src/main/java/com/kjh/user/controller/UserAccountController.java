package com.kjh.user.controller;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.naming.spi.DirStateFactory.Result;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kjh.user.service.UserAccountService;
import com.kjh.user.vo.UserSignInVO;
import com.kjh.user.vo.UserSignUpVO;

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
	public String SubmitSignIn(UserSignInVO signinVo) {
		
		
		return "";
	}
	
	// ȸ������
	@RequestMapping("userSignUp.do")
	public String SubmitSignUp(UserSignUpVO accountVo) {
		accountSvc.UserSignUp(accountVo);
		return "user/account/login";
	}
	
	// ���̵� �ߺ� üũ
	@RequestMapping("duplicationCheck.do")
	@ResponseBody
	public String CheckDuplication(@RequestBody String inputId) {
		
		String checkRst;
		int idCnt = accountSvc.CheckDuplication(inputId);
		if(idCnt > 0) 
			checkRst = "F";
		else 
			checkRst = "S";
		
		return checkRst;
	}
}

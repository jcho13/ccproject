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
	public String SubmitSignIn(UserSignInVO signinVo) {
		
		
		return "";
	}
	
	// 회원가입
	@RequestMapping("userSignUp.do")
	public String SubmitSignUp(UserSignUpVO accountVo) {
		accountSvc.UserSignUp(accountVo);
		return "user/account/login";
	}
	
	// 아이디 중복 체크
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

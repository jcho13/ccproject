package com.kjh.user.service;

import com.kjh.user.vo.UserSignInVO;
import com.kjh.user.vo.UserSignUpVO;

public interface UserAccountService {

	// 회원가입 
	public void UserSignUp(UserSignUpVO accountVo);
	
	// 아이디 중복 체크
	public int CheckDuplication(String inputId);
	
	// 회원로그인
	public void UserSignIn(UserSignInVO signinVo);
}

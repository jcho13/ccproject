package com.kjh.user.service;

import com.kjh.user.vo.UserSignInVO;
import com.kjh.user.vo.UserSignUpVO;

public interface UserAccountService {

	// ȸ������ 
	public void UserSignUp(UserSignUpVO accountVo);
	
	// ���̵� �ߺ� üũ
	public int CheckDuplication(String inputId);
	
	// ȸ���α���
	public void UserSignIn(UserSignInVO signinVo);
}

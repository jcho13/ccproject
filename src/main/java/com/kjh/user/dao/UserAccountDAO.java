package com.kjh.user.dao;
import com.kjh.user.vo.UserSignUpVO;

public interface UserAccountDAO {
	
	// 유저 회원가입
	public void UserSignUp(UserSignUpVO accountVo);
	
	// 아이디 중복 체크
	public int CheckDuplication(String inputId);
}

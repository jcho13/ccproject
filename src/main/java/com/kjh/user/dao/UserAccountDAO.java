package com.kjh.user.dao;
import com.kjh.user.vo.UserAccountVO;



public interface UserAccountDAO {
	
	// 유저 회원가입
	public void UserSignUp(UserAccountVO accountVo);
}

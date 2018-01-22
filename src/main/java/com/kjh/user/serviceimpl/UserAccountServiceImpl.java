package com.kjh.user.serviceimpl;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.kjh.user.dao.UserAccountDAO;
import com.kjh.user.service.UserAccountService;
import com.kjh.user.vo.UserSignInVO;
import com.kjh.user.vo.UserSignUpVO;


@Service
public class UserAccountServiceImpl implements UserAccountService {

	@Inject
	private UserAccountDAO accountDao;
	
	// 회원가입
	public void UserSignUp(UserSignUpVO accountVo) {
		
		accountDao.UserSignUp(accountVo);
	}
	
	// 아이디 중복 체크
	public int CheckDuplication(String inputId) {
		
		int idCnt = accountDao.CheckDuplication(inputId);
		return idCnt;
	}
	
	// 로그인
	public void UserSignIn(UserSignInVO signinVo) {
		
	}
}

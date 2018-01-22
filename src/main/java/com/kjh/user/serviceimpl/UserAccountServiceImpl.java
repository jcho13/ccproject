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
	
	// ȸ������
	public void UserSignUp(UserSignUpVO accountVo) {
		
		accountDao.UserSignUp(accountVo);
	}
	
	// ���̵� �ߺ� üũ
	public int CheckDuplication(String inputId) {
		
		int idCnt = accountDao.CheckDuplication(inputId);
		return idCnt;
	}
	
	// �α���
	public void UserSignIn(UserSignInVO signinVo) {
		
	}
}

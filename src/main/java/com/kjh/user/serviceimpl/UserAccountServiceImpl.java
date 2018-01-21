package com.kjh.user.serviceimpl;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.kjh.user.dao.UserAccountDAO;
import com.kjh.user.service.UserAccountService;
import com.kjh.user.vo.UserAccountVO;


@Service
public class UserAccountServiceImpl implements UserAccountService {

	@Inject
	private UserAccountDAO accountDao;
	
	// 회원가입
	public void UserSignUp(UserAccountVO accountVo) {
		
		accountDao.UserSignUp(accountVo);
	}
}

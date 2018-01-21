package com.kjh.user.daoimpl;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.kjh.user.dao.UserAccountDAO;
import com.kjh.user.vo.UserAccountVO;


@Repository
public class UserAccountDAOImpl implements UserAccountDAO {
	
	@Inject
	private SqlSession session;
	
	// 유저 회원가입
	public void UserSignUp(UserAccountVO accountVo) {
		
		session.insert("insertUserAccount", accountVo);
		
		System.out.println("dao insert complete");
	}
}

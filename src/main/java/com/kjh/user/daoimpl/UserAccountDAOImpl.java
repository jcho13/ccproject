package com.kjh.user.daoimpl;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.kjh.user.dao.UserAccountDAO;
import com.kjh.user.vo.UserSignUpVO;

@Repository
public class UserAccountDAOImpl implements UserAccountDAO {
	
	@Inject
	private SqlSession session;
	
	// 유저 회원가입
	public void UserSignUp(UserSignUpVO accountVo) {
		
		session.insert("insertUserAccount", accountVo);
	}
	
	// 아이디 중복 체크
	public int CheckDuplication(String inputId) {
		
		int idCount = session.selectOne("checkDuplicationId", inputId.replace("=", ""));
		return idCount;
	}
}

package com.kjh.user.dao;
import com.kjh.user.vo.UserSignUpVO;

public interface UserAccountDAO {
	
	// ���� ȸ������
	public void UserSignUp(UserSignUpVO accountVo);
	
	// ���̵� �ߺ� üũ
	public int CheckDuplication(String inputId);
}

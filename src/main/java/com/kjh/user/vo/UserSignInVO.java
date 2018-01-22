package com.kjh.user.vo;

public class UserSignInVO {
	// 회원 아이디
	private String signInUserId;
	
	// 회원 비밀번호
	private String signInUserPwd;

	public String getSignInUserId() {
		return signInUserId;
	}

	public void setSignInUserId(String signInUserId) {
		this.signInUserId = signInUserId;
	}

	public String getSignInUserPwd() {
		return signInUserPwd;
	}

	public void setSignInUserPwd(String signInUserPwd) {
		this.signInUserPwd = signInUserPwd;
	}
}

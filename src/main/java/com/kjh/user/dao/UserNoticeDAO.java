package com.kjh.user.dao;

import java.util.List;
import com.kjh.user.vo.UserNoticeSearchVO;

public interface UserNoticeDAO {

	// 공지사항 리스트
	public List<UserNoticeSearchVO> userNoticeList(UserNoticeSearchVO searchVO);
	
	// 공지사항 데이터 갯수
	public Integer noticeTotalCnt();
}

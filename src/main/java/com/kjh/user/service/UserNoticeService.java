package com.kjh.user.service;

import java.util.List;
import com.kjh.user.vo.UserNoticeSearchVO;

public interface UserNoticeService {

	// 공지사항 리스트
	public List<UserNoticeSearchVO> userNoticeList(UserNoticeSearchVO searchVO);
	
	// 공지사항 게시글 갯수
	public Integer userNoticeTotalCnt();
}

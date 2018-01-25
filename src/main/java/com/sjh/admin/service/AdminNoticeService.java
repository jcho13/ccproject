package com.sjh.admin.service;

import java.util.List;

import com.sjh.admin.vo.NoticeVO;
import com.sjh.admin.vo.SearchVO;

public interface AdminNoticeService {

	public void insertNotice(NoticeVO noticeVO);
	
	public List<NoticeVO> noticeList(SearchVO searchVO);
	
	public NoticeVO noticeRead(NoticeVO noticeVO);
	
	public void noticeDelete(NoticeVO noticeVO);
	
	public Object noticeViewCnt(int nno);
	
	public Integer boardCnt();
	
}

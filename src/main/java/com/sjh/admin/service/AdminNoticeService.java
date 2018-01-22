package com.sjh.admin.service;

import java.util.List;

import com.sjh.admin.vo.NoticeVO;

public interface AdminNoticeService {

	public void insertNotice(NoticeVO noticeVO);
	
	public List<NoticeVO> noticeList();
	
	public NoticeVO noticeRead(NoticeVO noticeVO);
	
	public void noticeDelete(NoticeVO noticeVO);
	
	public Object noticeViewCnt(int nno);
	
}

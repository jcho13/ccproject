package com.sjh.admin.dao;

import java.util.List;

import com.sjh.admin.vo.NoticeVO;

public interface AdminNoticeDAO {

	public void insertNotice(NoticeVO noticeVO);

	public List<NoticeVO> noticeList();

	public NoticeVO noticeRead(NoticeVO noticeVO);

}

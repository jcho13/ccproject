package com.sjh.admin.dao;

import java.util.List;

import com.sjh.admin.vo.NoticeVO;
import com.sjh.admin.vo.SearchVO;

public interface AdminNoticeDAO {

	public void insertNotice(NoticeVO noticeVO);

	public List<NoticeVO> noticeList(SearchVO searchVO);

	public NoticeVO noticeRead(NoticeVO noticeVO);

	public void noticeDelete(NoticeVO noticeVO);

	public Object noticeViewCnt(int nno);

}

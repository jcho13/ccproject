package com.sjh.admin.serviceimpl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.sjh.admin.dao.AdminNoticeDAO;
import com.sjh.admin.service.AdminNoticeService;
import com.sjh.admin.vo.NoticeVO;
import com.sjh.admin.vo.SearchVO;

@Service
public class AdminNoticeServiceImpl implements AdminNoticeService {

	@Inject
	private AdminNoticeDAO dao;

	@Override
	public void insertNotice(NoticeVO noticeVO) {
	
		dao.insertNotice(noticeVO);
	}

	@Override
	public List<NoticeVO> noticeList(SearchVO searchVO) {
		
		return dao.noticeList(searchVO);
	}

	@Override
	public NoticeVO noticeRead(NoticeVO noticeVO) {
		
		return dao.noticeRead(noticeVO);
	}

	@Override
	public void noticeDelete(NoticeVO noticeVO) {
		
		 dao.noticeDelete(noticeVO);
	}

	@Override
	public Object noticeViewCnt(int nno) {
		
		return dao.noticeViewCnt(nno);
	}

	
	
	
	
}

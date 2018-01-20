package com.sjh.admin.serviceimpl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.sjh.admin.dao.AdminNoticeDAO;
import com.sjh.admin.service.AdminNoticeService;
import com.sjh.admin.vo.NoticeVO;

@Service
public class AdminNoticeServiceImpl implements AdminNoticeService {

	@Inject
	private AdminNoticeDAO dao;

	@Override
	public void insertNotice(NoticeVO noticeVO) {
	
		dao.insertNotice(noticeVO);
	}

	@Override
	public List<NoticeVO> noticeList() {
		
		return dao.noticeList();
	}

	@Override
	public NoticeVO noticeRead(NoticeVO noticeVO) {
		
		return dao.noticeRead(noticeVO);
	}
	
	
	
	
}

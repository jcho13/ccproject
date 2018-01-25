package com.kjh.user.serviceimpl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.kjh.user.dao.UserNoticeDAO;
import com.kjh.user.service.UserNoticeService;
import com.kjh.user.vo.UserNoticeSearchVO;

@Service
public class UserNoticeServiceImpl implements UserNoticeService {
	
	@Inject
	private UserNoticeDAO noticeDao;

	@Override
	public List<UserNoticeSearchVO> userNoticeList(UserNoticeSearchVO searchVO) {
		
		return noticeDao.userNoticeList(searchVO);
	}
	
	@Override
	public Integer userNoticeTotalCnt() {
		return noticeDao.noticeTotalCnt();
	}
}

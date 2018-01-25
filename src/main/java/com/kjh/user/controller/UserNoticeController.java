package com.kjh.user.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kjh.user.service.UserNoticeService;
import com.kjh.user.vo.UserNoticeSearchVO;

@Controller
public class UserNoticeController {
	
	@Inject
	private UserNoticeService noticeSvc;

	// 공지사항 페이지로 이동
	@RequestMapping("userNotice.do")
	public String GoNoticePage(Model model, UserNoticeSearchVO searchVO) {
		
		searchVO.pageCalculate(noticeSvc.userNoticeTotalCnt());
		
		List<UserNoticeSearchVO> list = noticeSvc.userNoticeList(searchVO);
		model.addAttribute("noticeVO", list);
		model.addAttribute("searchVO", searchVO);
		
		return "user/notice/noticeList";
	}
}
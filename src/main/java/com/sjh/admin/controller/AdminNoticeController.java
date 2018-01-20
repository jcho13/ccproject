package com.sjh.admin.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sjh.admin.service.AdminNoticeService;
import com.sjh.admin.vo.NoticeVO;

@Controller
public class AdminNoticeController {
	
	
	@Inject
	private AdminNoticeService service;

	/** 
     * 공지사항 리스트. 
     */
	
	@RequestMapping("notice.do")
	public String notice(Model model) {
		
		List<NoticeVO> list = service.noticeList();
		model.addAttribute("noticeVO", list);
		
		return "admin/notice/notice";
	}
	
	/** 
     * 공지사항 작성화면. 
     */
	
	@RequestMapping("noticeWrite.do")
	public String noticeWrite(NoticeVO noticeVO ,Model model) {
		
		if(noticeVO.getNno() != null) {
			
			model.addAttribute("noticeVO",service.noticeRead(noticeVO) );
			
		}
			return "admin/notice/noticeWrite";
	
	}
	
	/** 
     * 공지사항 저장. 
     */
	
	@RequestMapping("noticeSave.do")
	public String noticeSave(NoticeVO noticeVO) {
		
			service.insertNotice(noticeVO);
		
		return "redirect:notice.do";
	}
	
	/** 
     * 공지사항 읽기. 
     */
	
	@RequestMapping("noticeRead.do")
	public String noticeSave(NoticeVO noticeVO, Model model) {
			
			model.addAttribute("noticeVO",service.noticeRead(noticeVO) );
		
		return "admin/notice/noticeRead";
	}
	
	
}

package com.sjh.admin.controller;



import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sjh.admin.service.TestService;
import com.sjh.admin.vo.BoardVO;

@Controller
public class Admincontroller {

	/*@Inject
	private TestService service;*/
	
	@Resource(name="service")
	private TestService service;
	
	@RequestMapping("blank.do")
	public String blank(Model model,BoardVO vo) {
		
		List<BoardVO> list = service.listAll();
		
		
		model.addAttribute("list",list );
		return "admin/blank";
	}
	
	
	
}

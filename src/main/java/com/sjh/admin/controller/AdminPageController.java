package com.sjh.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminPageController {

	//Admin mainPage
	@RequestMapping("/adminpage.do")
	public String adminPage() {
		return "admin/adminPage";
	}
	

	
}

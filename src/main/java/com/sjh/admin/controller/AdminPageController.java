package com.sjh.admin.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sjh.admin.service.AdminUserService;


@Controller
public class AdminPageController {
	
	@Inject
	private AdminUserService service;

	//Admin mainPage
	@RequestMapping("/adminpage.do")
	public String adminPage(Model model) {
		
		int companyCnt = service.companyCnt();
		model.addAttribute("companyCnt", companyCnt);
		
		
		return "admin/adminPage";
	}
	
	//Admin CompanyCount
	
	

	
}

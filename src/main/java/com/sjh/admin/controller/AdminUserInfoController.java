package com.sjh.admin.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sjh.admin.service.AdminUserService;
import com.sjh.admin.vo.Cpmember;

@Controller
public class AdminUserInfoController {

	@Inject
	private AdminUserService service;
	
	//Admin CompanyInfo
	@RequestMapping("/companyinfo.do")
	public String companyInfo(Model model) {
		
		List<Cpmember> list = service.companyInfo();
		model.addAttribute("list", list);
		
		
		
		return "admin/companyinfo/companyInfo";
	}
}

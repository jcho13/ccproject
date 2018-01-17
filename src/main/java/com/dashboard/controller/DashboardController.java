package com.dashboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DashboardController {

	@RequestMapping("dashboard.do")
	public String dashBaord() {
		return "dashboard/dashBoard";
	}
	
	@RequestMapping("myinfo.do")
	public String myInfo() {
		return "dashboard/myinfo/myInfo";
	}
	
	@RequestMapping("kcinfo.do")
	public String kcInfo() {
		return "dashboard/kcinfo/kcInfo";
	}
	
	@RequestMapping("kcfileinfo.do")
	public String kcFileInfo() {
		return "dashboard/kcfileinfo/kcFileInfo";
	}
	
}
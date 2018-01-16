package com.kjh.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	@RequestMapping("index.do")
	public String index() {
		return "index";
	}
}

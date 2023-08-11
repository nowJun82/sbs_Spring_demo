package com.ljj.exam.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserHomeController {
	// 사용자가 아래와 같은 경로로 접근하면 아래 showMain() 함수 실행
	@RequestMapping("user/home/main")
	@ResponseBody
	public String showMain() {
		return "메인입니다.";
	}
}
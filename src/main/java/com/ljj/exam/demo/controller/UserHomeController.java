package com.ljj.exam.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserHomeController {
	private int result;
	
	public UserHomeController() {
		result = 0;
	}
	
	// 사용자가 아래와 같은 경로로 접근하면 아래 showMain() 함수 실행
	@RequestMapping("user/home/main")
	@ResponseBody
	public String showMain() {
		return "안녕하세요";
	}
	
	@RequestMapping("user/home/main2")
	@ResponseBody
	public String showMain2() {
		return "반갑습니다";
	}
	
	@RequestMapping("user/home/main3")
	@ResponseBody
	public String showMain3() {
		return "또 만나요";
	}
	
	@RequestMapping("user/home/main4")
	@ResponseBody
	public int showMain4() {
		return result++;
	}
}
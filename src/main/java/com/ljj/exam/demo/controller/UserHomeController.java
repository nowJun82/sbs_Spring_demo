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
	
	@RequestMapping("user/home/getCount")
	@ResponseBody
	public int getCount() {
		return result++;
	}
	
	@RequestMapping("user/home/doSetCount")
	@ResponseBody
	public String doSetCount(int result) {	// 인자를 넘겨줘야 함
		this.result = result;
		return "값이 " + result + "으로 초기화되었습니다.";
	}
}
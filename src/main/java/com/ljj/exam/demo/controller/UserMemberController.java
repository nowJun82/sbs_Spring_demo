package com.ljj.exam.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ljj.exam.demo.service.MemberService;

@Controller
public class UserMemberController {
	private MemberService memberService;
	
	public UserMemberController(MemberService memberService) {
		this.memberService = memberService;
	}
	@RequestMapping("user/member/doJoin")
	@ResponseBody
	public String doJoin(String loginId, String loginPw, String name, String nickName, String cellPhoneNo, String eMail) {
		memberService.join(loginId, loginPw, name, nickName, cellPhoneNo, eMail);
		return "메인입니다.";
	}
}
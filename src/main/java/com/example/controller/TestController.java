package com.example.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.svc.TestSVC;
import com.example.vo.TestVO;

@Controller
@RequestMapping("/test")
public class TestController {
	
	@Autowired TestSVC svc;
	
	@GetMapping("/join")
	public String joinGET() {
		return "test/join";
	}
	
	@PostMapping("/join")
	public Map<String, Boolean> joinPOST(TestVO test){
		boolean added = svc.memberJoin(test);
		Map<String, Boolean> map = new HashMap<>();
		map.put("added", added);
		return map;
	}
	
	@PostMapping("/idcheck")
	@ResponseBody
	public Map<String, Boolean> idcheck (@RequestParam String uid){
		boolean checked = svc.idCheck(uid);
		Map<String, Boolean> map = new HashMap<>();
		map.put("checked", checked);
		return map;
	}
	
	@GetMapping("/login")
	public String loginGET() {
		return "test/login";
	}


}

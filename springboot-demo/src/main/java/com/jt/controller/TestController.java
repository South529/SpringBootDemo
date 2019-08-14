package com.jt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jt.service.TestDogService;
import com.jt.service.TestService;

@RestController  //返回值为json数据
public class TestController {
	
	@Autowired
	private TestService testService;
	@Autowired
	private TestDogService dogService;
	
	@RequestMapping("/getDog")
	public String getDog() {
		
		return dogService.getDog();
	}
	
	
	@RequestMapping("/getMsg")
	public String getMsg() {
		
		return testService.getNode();
	}

}

package com.jt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	//SpringBoot默认的字符集编码格式UTF-8
	@RequestMapping("/hello")
	@ResponseBody //1.对象转化为json 2.如果返回字符串则原串返回
	public String hello() {
		
		return "你好SpringBoot";
	}
}

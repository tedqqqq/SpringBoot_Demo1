package com.test.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@EnableAutoConfiguration
@Controller
public class meetingController {
	
	

	
	//读取配置文件中的自定义属性值
	@Value("${spring.name}")
	private String name;
	
	
	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		return "hello world"+"     "+name;
	}

	
	@RequestMapping("/index")
	public String index() {
		return "views/index";
	}

}

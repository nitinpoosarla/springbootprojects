package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController 
{
	@RequestMapping("getdata")
	public String demo()
	{
		return "hello world";
	}
	

}

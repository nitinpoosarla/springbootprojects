package com.in28minutes.rest.restfulwebservices;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {
	
	@RequestMapping("/hello")
	public String sayHello()
	
	{ 
		return "{a:b}";
			
	}

	

}

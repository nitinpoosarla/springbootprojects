package com.in28minutes.rest.restfulwebservices;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DemoSchedule {
	
	//@Scheduled(fixedRate=2000)
	public void task()
	{
		System.out.println("*************scheduled task888888888888888");
		
	}

}

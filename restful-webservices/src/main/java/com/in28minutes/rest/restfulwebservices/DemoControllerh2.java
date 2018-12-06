package com.in28minutes.rest.restfulwebservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoControllerh2 
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@RequestMapping(value="/createTable",method=RequestMethod.GET)
	public void createTable()
	{
		jdbcTemplate.execute("CREATE TABLE CUSTOMER(ID SERIAL,NAME VARCHAR(255),AGE VARCHAR(255))");
	}
	@RequestMapping(value="/putData",method=RequestMethod.GET)
    public void putData()
    {
		jdbcTemplate.execute("insert into customer(id,name,age) values(1,'nitin','43')");
    }
}

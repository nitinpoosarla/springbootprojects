package com.in28minutes.rest.restfulwebservices;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.BeanClassLoaderAware;

@Entity
public class Topic 
{
	@Id
	private String id;
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Topic(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Topic() {
	}
	

}

package com.example.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	String name = "rajat";
	
	@Autowired
	private Address address;
	
	//DI through setter method
	//@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	
	//DI through constructor
	//@Autowired
	public Person(Address address) {
		this.address = address;
	}
	public String getIno() {
		return "name "+this.name+", address "+this.address.city;
	}
}

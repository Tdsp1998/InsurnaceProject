package com.spring.web.rest.api.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;

@SpringBootApplication
public class AdminModule_Plan_Category {
	
	public String userdatacollection(@RequestBody Userdatacollection userdatacollection) {
		
		System.out.println(userdatacollection);
		return " Receive userdatacollection";
			
	}
}

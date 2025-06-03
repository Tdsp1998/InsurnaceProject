package com.spring.web.rest.api.controller;

import org.springframework.http.MediaType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AdminModule_Plan_Category {
	@PostMapping(path = "/admin",
			consumes=MediaType.APPLICATION_JSON_VALUE,
			produces =MediaType.APPLICATION_JSON_VALUE)
	
	public String userdatacollection(@RequestBody Userdatacollection userdatacollection) {
		
		System.out.println(userdatacollection);
		return " Receive userdatacollection";
			
	}
}

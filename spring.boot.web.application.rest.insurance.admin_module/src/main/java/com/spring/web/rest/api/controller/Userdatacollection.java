package com.spring.web.rest.api.controller;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Userdatacollection {
	
	private int id;
	private String name;
	private long phoneno;
	private long snsno;
	private LocalDate update_file;
	private LocalDate create_file;
	
	
                   
}

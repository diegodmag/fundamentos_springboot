package com.fundamentos.fundamentos.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*; 


@Controller 
public class TestController {
	
	@RequestMapping 
	@ResponseBody 
	public ResponseEntity<String> funtion(){
		return new ResponseEntity<>("Hello from controller cambio", HttpStatus.ACCEPTED ); 
	}
	
	
	

}

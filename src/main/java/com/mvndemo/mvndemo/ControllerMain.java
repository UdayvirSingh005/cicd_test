package com.mvndemo.mvndemo;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ControllerMain {

	@GetMapping("get")
	public String home() {
		String s = null;
		//s.length();
		return "Welcome to first jenkins app on local server test test UDAY WEB-HOOK ADDED !";
	}

	@ExceptionHandler({ Exception.class })
	ResponseEntity<String> errorhandlerMethod() {

		String s = "Something wend wrong , pls try after some time";
		System.out.println(s);
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		
	}

}

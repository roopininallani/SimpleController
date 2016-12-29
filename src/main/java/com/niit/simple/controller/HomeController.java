package com.niit.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	
    @RequestMapping("/")
	

	public String hello() {
    	System.out.println("hello method in controller");
		return "home";
	}

	
	

}
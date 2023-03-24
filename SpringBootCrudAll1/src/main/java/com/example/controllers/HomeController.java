package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.beans.student;
import com.example.services.StudentService;

@RestController
public class HomeController {

	@Autowired
	StudentService s4;
	

	@RequestMapping("/")
	public String get() {
		return "index";
	}
	
	@RequestMapping("/next")
	public String saves(@ModelAttribute("s") student s) {
		s4.regdata(s);
		return "redirect:/welcome";
	}
	
	@RequestMapping("/welcome")
	public String welcome() {
		
		return "welcome";
	}
	
	
}

package com.prog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.prog.entity.Employee;
import com.prog.service.Empserv;

@Controller
public class EmpController {
@GetMapping("/")     //In Spring Boot, the @GetMapping annotation is part of the Spring Web framework and is used to map HTTP GET requests to specific controller methods.
                 //It is commonly used to define the entry points (endpoints) for your RESTful web services or web applications. 
public String home() {
		
	return "index";
}

@GetMapping("/addemp")

public String addemployee() {
	
	return "add_emp";
}

@Autowired
private Employee e;

@Autowired
private Empserv service;

@PostMapping("/register")

     public String Register(Employee e) {
	  System.out.println(e);
	  service.addEmp(e);
	
	   return "redirect:/";
}

	
}

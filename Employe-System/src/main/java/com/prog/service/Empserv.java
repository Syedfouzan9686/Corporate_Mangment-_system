package com.prog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.prog.entity.Employee;
import com.prog.repository.Emprepo;
@Service

@Component
public class Empserv {

@Autowired	
private Emprepo repo;

 public void addEmp(Employee e) {
	 
	 repo.save(e);
 }

}

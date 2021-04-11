package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Employee;
import com.example.repo.EmpRepository;


@RestController
@RequestMapping("api")
public class EmpController {
	@Autowired
	public EmpRepository empRepository;
	
	@GetMapping("/hello")
	public String hello() {
		return "HELLO";
	}
	
	@GetMapping("/empall")
	public List<Employee> getall(){
		return empRepository.findall();
	}
}

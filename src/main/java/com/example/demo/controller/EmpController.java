package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Employee;
import com.example.demo.repo.EmpRepository;


@RestController
@RequestMapping("api")
public class EmpController {
	@Autowired
	public EmpRepository empRepository;
	
	@RequestMapping("/hello")
	public String hello() {
		return "HELLO";
	}
	
	@RequestMapping("/empall")
	public List<Employee> getall(){
		return empRepository.findAll();
	}
}

package com.example.demo.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Employee;


@Repository
public interface EmpRepository extends CrudRepository<Employee, Integer> {
	List<Employee> findAll();
}

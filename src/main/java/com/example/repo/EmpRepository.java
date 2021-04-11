package com.example.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Employee;


@Repository
public interface EmpRepository extends CrudRepository<Employee, Integer> {
	List<Employee> findall();
}

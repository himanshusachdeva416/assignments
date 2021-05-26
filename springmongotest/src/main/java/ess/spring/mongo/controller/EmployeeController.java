package ess.spring.mongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ess.spring.mongo.entity.Employee;
import ess.spring.mongo.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController{
	
	@Autowired
	EmployeeService empservice;
	
	@GetMapping("/allemp")
	public List<Employee> getAllEmpData(){
		return empservice.getAllEmp();
	}
	
	@PostMapping("/insertemp")
	public void insertEmpData(@RequestBody Employee emp) {
	empservice.insertEmpData(emp);
		System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getAge());
	}
	
}

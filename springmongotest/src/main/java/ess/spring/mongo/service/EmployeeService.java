package ess.spring.mongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import ess.spring.mongo.entity.Employee;
import ess.spring.mongo.repository.Employeerepository;

@Service
public class EmployeeService {
	
	@Autowired
	Employeerepository emprepo;
	
	public List<Employee> getAllEmp(){
		List<Employee> listemp =emprepo.findAll();
		return listemp;
	}
	
	public void insertEmpData(Employee emp) {
		emprepo.save(emp);
		}
}

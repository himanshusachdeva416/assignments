package ess.spring.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ess.spring.mongo.entity.Employee;

@Repository
public interface Employeerepository extends MongoRepository<Employee, String> {

}

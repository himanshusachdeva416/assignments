package ess.spring.config;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ess.spring.mongo.entity.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {

}

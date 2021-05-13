package ess.java.jpa.ass.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ess.java.jpa.ass.entity.AccountData;

@Repository
public interface AccountDataRepository extends CrudRepository<AccountData, Integer>{
	
	
}

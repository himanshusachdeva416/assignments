package ess.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ess.java.jpa.ass.entity.AccountData;

@Repository
public interface AccountRepository extends CrudRepository<Account, Integer> {

	void save(AccountData accdata);

}

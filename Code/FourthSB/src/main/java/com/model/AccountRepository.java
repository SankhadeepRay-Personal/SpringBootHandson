package com.model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {
	
	List<Account> findByEmployeeid(String employeeid);

}

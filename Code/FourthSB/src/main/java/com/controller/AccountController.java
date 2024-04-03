package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.Account;
import com.model.AccountRepository;

@RestController
public class AccountController {
@Autowired
AccountRepository accountRepository;

@RequestMapping("/displayAll")
public Iterable<Account> getAllAccounts(){
	return accountRepository.findAll();
	
}
@RequestMapping("/display/{employeeid}")
public List<Account> getAccountById(@PathVariable String employeeid){
	
			
	return accountRepository.findByEmployeeid(employeeid);
}


@RequestMapping(value="/addAccount", method=RequestMethod.POST)
public String addAccount(@ModelAttribute("employeeid") String employeeid, @ModelAttribute("fname") String fname, @ModelAttribute("lname") String lname, @ModelAttribute("email") String email, @ModelAttribute("location") String location) {
	Account a=new Account(employeeid,fname,lname,email,location);
	accountRepository.save(a);
	return "<html><body>Account has been successfully added<br><a href='/displayAll'>View All accounts</a></body></html>";
}

}

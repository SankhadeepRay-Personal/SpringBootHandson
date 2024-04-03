package com.wipro.FifthSB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AccountService {

	private HashMap<String, Account> accounts = new HashMap<>();

    public void addEmployee(Account account) {
        accounts.put(account.getEmployeeid(), account);
    }

    public List<Account> getAllEmployees() {
        return new ArrayList<>(accounts.values());
    }

    public Account getEmployeeById(String employeeid) {
        return accounts.get(employeeid);
    }
    public void updateEmployee(Account account) {
        Account existingEmployee = accounts.get(account.getEmployeeid());
        if (existingEmployee != null) {
            existingEmployee.setFname(account.getFname());
            existingEmployee.setLname(account.getLname());
            existingEmployee.setEmail(account.getEmail());
            existingEmployee.setLocation(account.getLocation());
        }
    }
    

    public void deleteEmployee(String employeeid) {
        accounts.remove(employeeid);
    }
    
}

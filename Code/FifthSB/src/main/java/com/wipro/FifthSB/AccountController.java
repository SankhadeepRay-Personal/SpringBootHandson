package com.wipro.FifthSB;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class AccountController {

	@Autowired
    private AccountService accountService;
	
	@GetMapping("/")
    public String displayIndex() {
        return "<!DOCTYPE html>\r\n"
        		+ "<html>\r\n"
        		+ "	<head>\r\n"
        		+ "		<title>Employee Details</title>\r\n"
        		+ "	</head>\r\n"
        		+ "	<body>\r\n"
        		+ "		<h2>Enter Employee Details</h2>\r\n"
        		+ "		<form action=\"/addAccount\" method=\"POST\" name=\"f1\">\r\n"
        		+ "			<table>\r\n"
        		+ "				<tr><td>Employee ID</td><td><input type=\"text\" name=\"employeeid\"></input></td></tr>\r\n"
        		+ "				<tr><td>Employee First Name</td><td><input type=\"text\" name=\"fname\"></input></td></tr>\r\n"
        		+ "				<tr><td>Employee Last Name</td><td><input type=\"text\" name=\"lname\"></input></td></tr>\r\n"
        		+ "				<tr><td>Employee Email</td><td><input type=\"text\" name=\"email\"></input></td></tr>\r\n"
        		+ "				<tr><td>Employee Location</td><td><input type=\"text\" name=\"location\"></input></td></tr>\r\n"
        		+ "				<tr><td><input type=\"submit\" value=\"Add Account\"></input></td></tr>\r\n"
        		+ "			</table>\r\n"
        		+ "		</form>\r\n"
        		+ "	</body>\r\n"
        		+ "</html>"; 
    }

    @GetMapping("/displayAll")
    public List<Account> getAllEmployees() {
        return accountService.getAllEmployees();
    }
    @GetMapping("/{id}")
    public Account getEmployeeById(@PathVariable String id) {
        return accountService.getEmployeeById(id);
    }
    @PostMapping("/addAccount")
    public String addEmployee(@ModelAttribute("employeeid") String employeeid, @ModelAttribute("fname") String fname, @ModelAttribute("lname") String lname, @ModelAttribute("email") String email, @ModelAttribute("location") String location) {
    	Account a=new Account(employeeid,fname,lname,email,location);
    	accountService.addEmployee(a);
        return "<html><body>Account has been successfully added<br><a href='/displayAll'>View All accounts</a></body></html>";
    }
    @PutMapping("/{id}")
    public void updateEmployee(@PathVariable String id, @RequestBody Account account) {
        account.setEmployeeid(id);
        accountService.updateEmployee(account);
    }
    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable String id) {
    	accountService.deleteEmployee(id);
    }
}

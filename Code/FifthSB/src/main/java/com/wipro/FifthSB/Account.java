package com.wipro.FifthSB;

import jakarta.persistence.Entity;


@Entity
public class Account {

	   /* @Id
	    @GeneratedValue
	    Long id;
	    */
	    String employeeid, fname, lname, email, location;
	    
	    public Account(){
	    	
	    }
	    @Override
	    public String toString()
	    {
	    	return "Account[employeeid=" + employeeid +",  fname=" + fname + ", lanme=" + lname + ", email=" + email + ", location=" + location + "]";
	    }
	    
	    public Account(String employeeid, String fname, String lname, String email, String location) {
	    	
	    	super();
	    	this.employeeid=employeeid;
	    	this.fname=fname;
	    	this.lname=lname;
	    	this.email=email;
	    	this.location=location;
	    		
	    }
		/*public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		*/
		public String getEmployeeid() {
			return employeeid;
		}
		public void setEmployeeid(String employeeid) {
			this.employeeid = employeeid;
		}
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public String getLname() {
			return lname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
	    
	    
}

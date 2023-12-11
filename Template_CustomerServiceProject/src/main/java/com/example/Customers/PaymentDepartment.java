package com.example.Customers;

/*
     This class is an implementation of a CustomerCare Interface based on the selection 
     in the console the department type is selected.You need to complete this class 
     based on the following tasks.

     Tasks:
       1. Override the methods of CustomerCare Interface:
       2. Build your logic for all the method based on the description given in CustomerCare Interface.
 */
public class PaymentDepartment implements CustomerCare {
	
    private String department= "Payment Department";
    private String customerName;
    private String issue; 
    private double refId; 
    
    /** This method returns the name of the Department Selected by the user. **/
	public String getDepartment() {
		return this.department;
	}

	/** This method returns the prompt to the user to welcome the user with the given name, and department selected and ask for the issue e.g. " Welcome John, you have reached the payments department". **/
	public void getService() {
		System.out.println("Welcome "+customerName+", you have reached the payments department");
	}
	
	/** This method sets the name of the user from the console. **/
	public void setCustomerName(String name) {
		this.customerName=name;
	}
	
	/** This method sets the issue for the department given by the user e.g. "I have an issue with my receipt". **/
	public void setProblem(String problem) {
		this.issue=problem;
	}
	
	/** This method returns the custom response to the user based on the name and the selected department. e.g. " Dear John your  issue is registered with Payments" **/
	public void getProblem() {
		System.out.println("Dear "+customerName+" your issue "+issue+" is registered with Payments");
	}
    

}

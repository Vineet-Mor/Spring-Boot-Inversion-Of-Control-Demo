package com.example.CustomerServicedemo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.Customers.PaymentDepartment;
import com.example.Customers.QueryDepartment;
import com.example.Customers.SalesDepartment;

import java.util.Scanner;
@SpringBootApplication
public class CustomerServicedemoApplication {

	public static void main(String[] args) {

		/*
		You need to complete this application as mentioned in the problem 
		statement build your own logic and perform the following tasks.

			 Tasks:
		 *  1. Load the beans from ApplicationContext.xml
		 *  2. Display all the departments available and get the input from user.
		 *  3. Get the message from user and store it into the respective department.
		 *  
		 */
		Scanner s=new Scanner(System.in);
		System.out.println("Welcome to our Customer Care application");
		ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		String name;
		System.out.print("Please enter your name: ");
		name=s.nextLine();
		System.out.println();
		System.out.println("Thanks for reaching us "+name+"\n Please select a department to connect to:\n 1. Payment Department \n 2. Query Department \n 3. Sales Department \n 0. Exit");
		switch(s.nextInt()) {
		case 1:{
			PaymentDepartment pd=context.getBean("paymentDepartment", PaymentDepartment.class);
			pd.setCustomerName(name);
			pd.getService();
			System.out.println("How may I assist you with your payment inquery?");
			s.nextLine();
			pd.setProblem(s.nextLine());
			pd.getProblem();
			break;
		}
		case 2:{
			QueryDepartment qd=context.getBean("queryDepartment", QueryDepartment.class);
			qd.setCustomerName(name);
			qd.getService();
			System.out.println("How may I assist you with your query?");
			s.nextLine();
			qd.setProblem(s.nextLine());
			qd.getProblem();
			break;
		}
		case 3:{
			SalesDepartment sd=context.getBean("salesDepartment", SalesDepartment.class);
			sd.setCustomerName(name);
			sd.getService();
			System.out.println("How may I assist you with your sales query?");
			s.nextLine();
			sd.setProblem(s.nextLine());
			sd.getProblem();
			break;
		}
		case 0:{
			break;
		}
		default :{
			break;
		}
		}
		
	
	}
}

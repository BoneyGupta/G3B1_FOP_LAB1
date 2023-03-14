package com.greatlearning.it.main;

import java.util.Scanner;

import com.greatlearning.it.model.Employee;
import com.greatlearning.it.service.*;

public class Driver {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		CredentialService service =new CredentialServiceImpl();
		Employee emp = new Employee("Ram","Kumar");
		System.out.println("Please enter the department from the following");
		System.out.println("1. Tech");
		System.out.println("2. Admin");
		System.out.println("3. HR");
		System.out.println("4. Legal");
		int choice=sc.nextInt();
		sc.close();
		String department=null;
		
		switch(choice) {
		case 1:
			department="tech";break;
		case 2:
			department="admin";break;
		case 3:
			department="hr";break;
		case 4:
			department="legal";break;
		default:
			System.out.println("Please select valid option");
		}
		
		emp.setDepartment(department);
		String email_id=service.generateEmailAddress(emp);
		emp.setEmail_id(email_id);
		
		String password=service.generatePassword();
		emp.setPassword(password);
		
		service.showCredentials(emp);
	}
}

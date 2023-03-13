package com.greatlearning.it.service;

import java.util.Random;

import com.greatlearning.it.model.Employee;

public class CredentialServiceImpl implements CredentialService{

	public String generatePassword() {
		String allowed_char="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*_=+-/";
		
		StringBuilder passwordBuilder = new StringBuilder(8);
		Random random = new Random();
        for (int i = 0; i < 8; i++) {
            passwordBuilder.append(allowed_char.charAt(random.nextInt(allowed_char.length())));
        }
        return passwordBuilder.toString();
	}
	
	public String generateEmailAddress(Employee e) {		
		String email_id=e.getFirstName()+e.getLastName()+"@"+e.getDepartment()+".greatlearning.in";
		return email_id;		
	}
	
	public void showCredentials(Employee e) {
		System.out.println("Email ID: "+e.getEmail_id());
		System.out.println("Password: "+e.getPassword());
	}
}

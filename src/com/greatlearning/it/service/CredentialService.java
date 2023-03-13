package com.greatlearning.it.service;

import com.greatlearning.it.model.Employee;

public interface CredentialService {
	public String generateEmailAddress(Employee employee);
	public String generatePassword();
	public void showCredentials(Employee employee);
}


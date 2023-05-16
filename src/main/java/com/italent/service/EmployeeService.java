package com.italent.service;

import com.italent.entity.Employee;
import com.italent.error.CustomException;

public interface EmployeeService {
	
	
	public void saveEmployee(Employee employee);
	
	public Employee getEmployeeById(long id)throws CustomException;
	
	

}
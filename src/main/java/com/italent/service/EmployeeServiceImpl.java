package com.italent.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.italent.entity.Employee;
import com.italent.error.CustomException;
import com.italent.repo.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public void saveEmployee(Employee employee) {

		employeeRepository.save(employee);

	}

	@Override
	public Employee getEmployeeById(long id) throws CustomException{
		Employee empResponse = null;
		
		empResponse = employeeRepository.getEmbloyeById(id);

		if (empResponse == null) {
			throw new CustomException("Employee not found for given id " + id + "", HttpStatus.NOT_FOUND);
		}
		return empResponse;
	}

	
	

}
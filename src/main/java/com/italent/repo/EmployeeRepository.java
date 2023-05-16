package com.italent.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.italent.entity.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	public Employee getEmbloyeById(Long empId);
}
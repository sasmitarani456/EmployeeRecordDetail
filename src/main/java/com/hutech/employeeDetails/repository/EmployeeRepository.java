package com.hutech.employeeDetails.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.hutech.employeeDetails.entity.EmployeeDetail;

@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeDetail, Long> {
	
}

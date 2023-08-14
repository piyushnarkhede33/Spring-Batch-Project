package com.employee.config;

import org.springframework.batch.item.ItemProcessor;

import com.employee.DTO.EmployeeDTO;
import com.employee.entity.Employee;

public class JobProcessor implements ItemProcessor<EmployeeDTO, Employee> {

	@Override
	public Employee process(EmployeeDTO item) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.app.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.EmployeeDaoI;
import com.app.entity.EmployeeEntity;
import com.app.exception.CustomerNotFoundException;
import com.app.pojo.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDaoI dao;

	public EmployeeEntity saveEntity(Employee employee) {
		EmployeeEntity entity = new EmployeeEntity();
		employee.setId(1);
		BeanUtils.copyProperties(employee, entity);
		EmployeeEntity savedEntity = dao.save(entity);
		return savedEntity;
	}

	public EmployeeEntity findById(int id) throws CustomerNotFoundException {
		EmployeeEntity employeeEntity=null;
		try {
		employeeEntity = dao.findById(id).get();
		}catch(Exception e) {
			throw new CustomerNotFoundException("Employee Not Found For ID: "+id);
		}
		return employeeEntity;			
	}
}

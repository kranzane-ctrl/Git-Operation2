package com.app.service;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.EmployeeDaoI;
import com.app.entity.EmployeeEntity;
import com.app.exception.CustomerNotFoundException;
import com.app.pojo.Employee;

/**
 * @author Kishor R
 *
 */
@Service
public class EmployeeService {

	@Autowired
	private EmployeeDaoI dao;

	private static Logger log=Logger.getLogger(EmployeeService.class);
	
	/**
	 * @param employee
	 * @return
	 */
	public EmployeeEntity saveEntity(Employee employee) {
		PropertyConfigurator.configure(System.getProperty("user.dir")+ File.separator + "log4j.properties");
		
		EmployeeEntity entity = new EmployeeEntity();
		employee.setId(1);
		log.info("data copy to pojo to entity to save in database ");
		BeanUtils.copyProperties(employee, entity);
		log.info("data copyed successfully ");
		EmployeeEntity savedEntity = dao.save(entity);
		log.info("data saved to DB");
		return savedEntity;
	}

	/**
	 * @param id
	 * @return
	 * @throws CustomerNotFoundException
	 */
	public EmployeeEntity findById(int id) throws CustomerNotFoundException {
		PropertyConfigurator.configure(System.getProperty("user.dir")+ File.separator + "log4j.properties");
		log.info("findById call");
		
		EmployeeEntity employeeEntity=null;
		try {
		employeeEntity = dao.findById(id).get();
		}catch(Exception e) {
			log.error("catched Exception: "+e);
			log.info("findById is now catch in Custom Exception");
			throw new CustomerNotFoundException("Employee Not Found For ID: "+id);
		}
		log.info("finfById data Found successfully");
		return employeeEntity;			
	}
}

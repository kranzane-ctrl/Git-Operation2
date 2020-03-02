package com.app;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.stubbing.OngoingStubbing;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.dao.EmployeeDaoI;
import com.app.entity.EmployeeEntity;
import com.app.service.EmployeeService;

@SpringBootTest
@RunWith(PowerMockRunner.class)
class GitOperation2ApplicationTests {

	@Mock
	private EmployeeDaoI dao;

	private static Logger logger = Logger.getLogger(GitOperation2ApplicationTests.class);

	@InjectMocks
	private EmployeeService service;

	/**
	 * 
	 */
	@Test
	public void testFindById() {
		PropertyConfigurator.configure(System.getProperty("user.dir") + File.separator + "log4j.properties");
		logger.info("Creating Entity");
		EmployeeEntity entity = new EmployeeEntity();
		logger.info("Set entity values");
		entity.setId(1);
		entity.setName("Santosh");
		entity.setCity("Ashti");
		entity.setClg("Amolok kada");
		entity.setPhone(9075422212l);
		logger.info("Execute to test Case");
		
		OngoingStubbing<EmployeeEntity> thenReturn = when(dao.findById(1).get()).thenReturn(entity);
		
		//EmployeeEntity findById = (EmployeeEntity) when(dao.findById(1).get()).thenReturn(entity);
		logger.info("assert return entity object: "+thenReturn.toString());
		assertNotNull(thenReturn);
	}

}

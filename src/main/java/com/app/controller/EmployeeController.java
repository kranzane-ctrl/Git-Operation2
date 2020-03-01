package com.app.controller;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.app.entity.EmployeeEntity;
import com.app.exception.CustomerNotFoundException;
import com.app.pojo.Employee;
import com.app.service.EmployeeService;

@RestController
//@RequestMapping(value = "/")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	private static Logger log=Logger.getLogger(EmployeeController.class);
	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public ModelAndView loadWelcomePage() {
		PropertyConfigurator.configure(System.getProperty("user.dir")+ File.separator + "log4j.properties");
		log.info("Welcome Page to Load");
		ModelAndView mav=new ModelAndView("welcome");
		return mav;
	}
	
	@RequestMapping(value = "/registration" , method = RequestMethod.GET)
	public ModelAndView loadLoginPage() {
		PropertyConfigurator.configure(System.getProperty("user.dir")+ File.separator + "log4j.properties");
		log.info("Open to Registration Page");
		
		ModelAndView mav=new ModelAndView("login");
		mav.addObject("welMsg", "Welcome to Registration Page");
		mav.addObject("emp", new Employee());
		return mav;
	}
	
	@RequestMapping(value = "/review", method = RequestMethod.POST)
	public ModelAndView reviewData(@ModelAttribute("emp") Employee emp) {
		PropertyConfigurator.configure(System.getProperty("user.dir")+ File.separator + "log4j.properties");
		log.info("Data bind by @ModelAttributive to save");
		
		ModelAndView mav=new ModelAndView("review");
		log.info("data saved to DB");
		EmployeeEntity saveEntity = service.saveEntity(emp);
		
		log.info("Data Successfully Saved to Database");
		mav.addObject("reviewData", "Please Review Your Data And Confirm ");
		mav.addObject("empReview", saveEntity);
		return mav;
	}
	
	@RequestMapping(value = "/findById", method = RequestMethod.GET)
	public ModelAndView findById() {
		PropertyConfigurator.configure(System.getProperty("user.dir")+ File.separator + "log4j.properties");
		log.info("findDataById to Load");
		
		ModelAndView mav=new ModelAndView("findDataById");
		return mav;
	}
	
	@RequestMapping(value = "/findDataById", method = RequestMethod.GET)
	public ModelAndView findDataById(@RequestParam("id") int id) throws CustomerNotFoundException {
		EmployeeEntity entity=service.findById(id);
		ModelAndView mav=new ModelAndView("review");
		mav.addObject("reviewData", "Please Review ID "+id+" Data And Confirm ");
		mav.addObject("empReview", entity);
		return mav;
	}
}

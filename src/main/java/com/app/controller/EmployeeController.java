package com.app.controller;

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
	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public ModelAndView loadWelcomePage() {
		ModelAndView mav=new ModelAndView("welcome");
		return mav;
	}
	
	@RequestMapping(value = "/registration" , method = RequestMethod.GET)
	public ModelAndView loadLoginPage() {
		ModelAndView mav=new ModelAndView("login");
		mav.addObject("welMsg", "Welcome to Registration Page");
		mav.addObject("emp", new Employee());
		return mav;
	}
	
	@RequestMapping(value = "/review", method = RequestMethod.POST)
	public ModelAndView reviewData(@ModelAttribute("emp") Employee emp) {
		ModelAndView mav=new ModelAndView("review");
		EmployeeEntity saveEntity = service.saveEntity(emp);
		mav.addObject("reviewData", "Please Review Your Data And Confirm ");
		mav.addObject("empReview", saveEntity);
		return mav;
	}
	
	@RequestMapping(value = "/findById", method = RequestMethod.GET)
	public ModelAndView findById() {
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

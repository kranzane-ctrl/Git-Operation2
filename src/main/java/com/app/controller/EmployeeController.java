package com.app.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.app.pojo.Employee;

@RestController
//@RequestMapping(value = "/")
public class EmployeeController {
	
	@RequestMapping(value = "/login" , method = RequestMethod.GET)
	public ModelAndView loadLoginPage() {
		ModelAndView mav=new ModelAndView("login");
		mav.addObject("welMsg", "Welcome to Registration Page");
		mav.addObject("emp", new Employee());
		return mav;
	}
	
	@RequestMapping(value = "/review", method = RequestMethod.POST)
	public ModelAndView reviewData(@ModelAttribute("emp") Employee emp) {
		ModelAndView mav=new ModelAndView("review");
		mav.addObject("reviewData", "Please Review Your Data And Confirm ");
		mav.addObject("empReview", emp);
		return mav;
	}
}

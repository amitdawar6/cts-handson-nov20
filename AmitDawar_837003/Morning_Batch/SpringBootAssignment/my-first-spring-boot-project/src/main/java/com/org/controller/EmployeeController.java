package com.org.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

	
//	public ModelAndView getMessage() {
//		ModelAndView mav = new ModelAndView("hello.jsp" , "msg" , "Hello World");
//		return mav;
//	}
	
	@RequestMapping(value = "/greeting" , method = RequestMethod.GET)
	public String getMessage() {
		return "greeting";
	}
	
}

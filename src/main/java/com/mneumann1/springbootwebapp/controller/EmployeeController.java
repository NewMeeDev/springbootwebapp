/**
 * 
 */
package com.mneumann1.springbootwebapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.mneumann1.springbootwebapp.entity.Employee;
import com.mneumann1.springbootwebapp.repository.EmployeeRepository;

/**
 * @author MNEUMANN1
 *
 */
@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository eRepo;
	
	@GetMapping({"/showEmployees", "/", "/list"})
	public ModelAndView showEmployees() {
		ModelAndView mav = new ModelAndView("list-employees");
		List<Employee> list = eRepo.findAll();
		mav.addObject("employees", list);
		return mav;
	}

}

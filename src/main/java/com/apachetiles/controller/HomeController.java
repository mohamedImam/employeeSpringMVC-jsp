package com.apachetiles.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.models.EmployeeDTO;

import services.EmployeeService;

@Controller
public class HomeController {
	
	private  EmployeeService service;
	@RequestMapping("/")
	public String showHome(Model model) {
	        return "home" ; 
			 
		}
	
	@RequestMapping("/employeeList")
	public String employeeList(Model model) {
		 
		List<EmployeeDTO> list=  new ArrayList<EmployeeDTO>(); 
		list=service.listAll();
		model.addAttribute("list",list);  
			return "list";
		}


	@RequestMapping("/addNewEmployee")
	public String addemployeeList(Model model) {
		  List<EmployeeDTO> employees=service.listAll();
		List<String> employeeList = new  ArrayList<>();
		employees.forEach(employee -> {
			employeeList.add(employee.getFirstname()+" "+ employee.getLastname());
		});
	    
	      model.addAllAttributes(employeeList); 
			return "addNewEmployee";
		}
	
}

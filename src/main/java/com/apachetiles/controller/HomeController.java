package com.apachetiles.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.models.EmployeeDTO;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String showHome(Model model) {
	        return "home" ; 
			 
		}
	
	@RequestMapping("/employeeList")
	public String employeeList(Model model) {
		 
		
		List<EmployeeDTO> list=  new ArrayList<EmployeeDTO>(); 
		 list.add(new EmployeeDTO(1,"moh","osm","h","HR",200,"ahmed"));
		 list.add(new EmployeeDTO(2,"ali","abr","j","IT",2,"KOKO"));
		model.addAttribute("list",list);  
			return "list";
		}


	@RequestMapping("/addNewEmployee")
	public String addemployeeList(Model model) {
			return "addNewEmployee";
		}
	
}

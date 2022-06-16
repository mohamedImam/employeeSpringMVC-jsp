package com.apachetiles.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.models.EmployeeDTO;

import services.EmployeeService;

 

@Controller  
public class OprationControlle {

	 EmployeeService service;
	
	
 //@PostMapping("/saveEmployee")
	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
    public String saveEmployee( @ModelAttribute("employee") EmployeeDTO employee) {
    	  System.out.println(employee.getFirstname()+"*********");
    	  service.save(employee);
        return "redirect:/";
    }

	@RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET)
    public String getAllEmployees(Model m) {

		   List<EmployeeDTO> listEmployee = service.listAll();
	
		m.addAttribute("list", listEmployee);
        return "redirect:/";
    }

	@RequestMapping(value="/editemp/{id}")    
    public String edit(@PathVariable Long id, Model m){    
		//EmployeeDTO emp=service.get(id);
		EmployeeDTO emp= new EmployeeDTO(2,"ali","abr","j","IT",2,"KOKO");
		System.out.println("--"+id);
        m.addAttribute("employee",emp);  
        return "edit_Employee";    
    }    
	
	  @RequestMapping(value="/editsave",method = RequestMethod.POST)    
	    public String editsave(@ModelAttribute("employee") EmployeeDTO emp){    
		  service.save(emp);    
	        return "redirect:/viewemp";    
	    }    
	  
	  @RequestMapping(value="/deleteemp/{id}",method = RequestMethod.GET)    
	    public String delete(@PathVariable Long id){    
		  service.delete(id);    
	        return "redirect:/viewemp";    
	    }     
}

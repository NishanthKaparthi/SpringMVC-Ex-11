package com.montrealcollege.exercise11.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.montrealcollege.exercise11.model.Employee;

@Controller
public class EmployeeController {
	@Autowired
	private Employee employee;

//	@RequestMapping(method = RequestMethod.GET, value = "/create/{name}")
	@GetMapping(value = "/create/{name}")
	public String createEmployee(@PathVariable String name, ModelMap modelMap) {
		employee.setFirstName(name);
		modelMap.addAttribute("message", "Employee created with name: " + employee.getFirstName());

		return "hello";
	}

	@RequestMapping(method = RequestMethod.GET, path = "/createSalary")
	public String createemployee(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName,
			@RequestParam("salary") Integer salary, ModelMap modelMap) {
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		employee.setSalary(salary);
		modelMap.addAttribute("message", "Employee created with name: " + employee.getFirstName() + " "
				+ employee.getLastName() + "and salary " + employee.getSalary());
		return "hello";
	}

}

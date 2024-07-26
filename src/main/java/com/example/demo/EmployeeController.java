package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	
	@Autowired
	Employeerepo repo;
	@RequestMapping("/") // open form
	public String details() {
		return "group";
	}
	
	@RequestMapping("/details")   //save detail in h2 database
	public String Group(Employee employee) {
		repo.save(employee);
		return "group";
	}
	
	@RequestMapping("/getdetails")    //go to view Employee details
	public String getdetails() {
		return "ViewEmployee";
	}
	

	@PostMapping("/getdetails")
	public  ModelAndView getdetails(@RequestParam int cid ) {
			ModelAndView mv = new ModelAndView("Retrive");
			Employee employee = repo.findById(cid).orElse(null);
			mv.addObject(employee);
			return mv;
			
//			modelMap.put("cid", cid );
//			modelMap.put("cname", cname );
//			modelMap.put("cemail", cemail );
//			return "ViewEmployee";
	} 
	
	@RequestMapping("/employees")
	@ResponseBody
	public List<Employee>  getEmployees() {
		return repo.findAll();
	}
	
	
	@RequestMapping("/employees/{cid}")
	@ResponseBody
	public Optional<Employee> getEmployees2(@PathVariable("cid") int cid) {
		return repo.findById(cid);
	}
	
	
	@PostMapping("/employees")
	public Employee  getEmployees3(@RequestBody Employee employees) {
		repo.save(employees);
		return employees;
	}
	
	
	@DeleteMapping("/employees/{cid}")
	public Employee  getEmployees4(@PathVariable("cid") int cid ) {
	 Employee emp = repo.getOne(cid);
	 repo.delete(emp);
	 return emp;
	
	}
	
	
	
	@PutMapping(path="/employees", consumes= {"application/json"})
	public Employee  getEmployees5(@RequestBody Employee employee) {
	
	 repo.save(employee);
	 return employee;
	
	}
	
	
}

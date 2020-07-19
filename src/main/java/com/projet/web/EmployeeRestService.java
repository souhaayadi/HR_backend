package com.projet.web;

import java.util.List;

import com.projet.dao.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.projet.entites.Employee;

@RestController
@CrossOrigin("*")
public class EmployeeRestService {
	@Autowired
	private EmployeeRepository employeeRepository;

	@GetMapping("/employees")
	public List<Employee> getAllEmployee(){
		return employeeRepository.findAll();
	}


	@GetMapping("/employees/{codeEmployee}")
	public Employee consulterEmployee(@PathVariable Long codeEmployee) {

		return employeeRepository.findById(codeEmployee).orElse(null);

	}

	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee cl) {

		return employeeRepository.save(cl);

	}

	@DeleteMapping("/employees/{codeEmployee}")
	public Boolean supprimerEmployee(@PathVariable Long codeEmployee) {
		employeeRepository.deleteById(codeEmployee);
		return true;
	}


	@PutMapping("/employees/{codeEmployee}")
	public Employee updateEmployee(@PathVariable Long codeEmployee, @RequestBody Employee cl) {
		cl.setCode(codeEmployee);
		return  employeeRepository.save(cl);

	}

	@GetMapping("employees/listEmployee")
	public Page<Employee> listEmployee(@RequestParam(name = "mc", defaultValue = "") String mc,
									 @RequestParam (name = "page", defaultValue ="0") int page,
									 @RequestParam (name = "size", defaultValue = "5") int size) {
		return employeeRepository.listEmployee("%"+mc+"%",  PageRequest.of(page, size));

	}
}
	

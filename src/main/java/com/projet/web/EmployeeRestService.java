package com.projet.web;

import java.util.List;

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

import com.projet.dao.EmployeeRepository;
import com.projet.entites.Employee;

@RestController
@CrossOrigin("*")
public class EmployeeRestService {
	@Autowired
	private EmployeeRepository EmployeeRepository;

	@GetMapping("/Employees")
	public List<Employee> getAllEmployee(){
		return EmployeeRepository.findAll();
	}



	@GetMapping("/Employees/{codeEmployee}")
	public Employee consulterEmployee(@PathVariable Long codeEmployee) {

		return EmployeeRepository.findById(codeEmployee).orElse(null);

	}

	@PostMapping("/Employees")
	public Employee addEmployee(@RequestBody Employee cl) {

		return EmployeeRepository.save(cl);

	}

	@DeleteMapping("/Employees/{codeEmployee}")
	public Boolean supprimerEmployee(@PathVariable Long codeEmployee) {
		EmployeeRepository.deleteById(codeEmployee);
		return true;
	}


	@PutMapping("/Employees/{codeEmployee}")
	public Employee updateEmployee(@PathVariable Long codeEmployee, @RequestBody Employee cl) {
		cl.setCode(codeEmployee);
		return  EmployeeRepository.save(cl);

	}

	@GetMapping("Employees/listEmployee")
	public Page<Employee> listEmployee(@RequestParam(name = "mc", defaultValue = "") String mc,
									 @RequestParam (name = "page", defaultValue ="0") int page,
									 @RequestParam (name = "size", defaultValue = "5") int size) {
		return EmployeeRepository.listEmployee("%"+mc+"%",  PageRequest.of(page, size));

	}
}
	

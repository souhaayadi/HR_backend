package com.projet.web;

import java.util.Date;
import java.util.List;

import com.projet.dao.CongeRepository;
import com.projet.entites.DemandeConge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projet.dao.EmployeeRepository;
import com.projet.entites.Employee;

@RestController
@CrossOrigin("*")
public class CongeRestService {


	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private CongeRepository congeRepository;

	@GetMapping("/conges")
	public List<DemandeConge> getAllConges(){
		return congeRepository.findAll();
	}





}

package com.projet;


import com.projet.dao.CongeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.projet.dao.EmployeeRepository;

@SpringBootApplication
public class HrBackend implements CommandLineRunner{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private CongeRepository congeRepository;


	public static void main(String[] args) {
   SpringApplication.run(HrBackend.class, args);
    
      
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		/*
		 * Client C1= clientRepository.save(new Client("salim","salim@gmail.com"));
		 * Client C2= clientRepository.save(new Client("jamel","jamel@gmail.com"));
		 * 
		 * Compte cp1= compteRepository.save(new CompteCourant("cp1", new Date(), 9000,
		 * C1, 6000)); 
		 * Compte cp2= compteRepository.save(new CompteEpargne("cp2", new
		 * Date(), 6000, C2, 5.5));
		 * 
		 * 
		 * operationRepository.save(new Versement(new Date(), 6000, cp1));
		 * operationRepository.save(new Versement(new Date(), 6000, cp1));
		 * operationRepository.save(new Versement(new Date(), 2300, cp1));
		 * operationRepository.save(new Retrait(new Date(), 9000, cp1));
		 * 
		 * operationRepository.save(new Versement(new Date(), 2300, cp2));
		 * operationRepository.save(new Versement(new Date(), 400, cp2));
		 * operationRepository.save(new Versement(new Date(), 2300, cp2));
		 * operationRepository.save(new Retrait(new Date(), 3000, cp2));
		 */
	 
	 

	
	}

	

}

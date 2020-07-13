package com.projet.web;

import java.util.Date;

import com.projet.dao.CongeRepository;
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




	/*@GetMapping("/comptes")
	public List<Compte> getAllCompte(){
		return compteRepository.findAll();
	}


	@GetMapping("/comptes/{codeCompte}")
	public Compte consulterCompte(@PathVariable String codeCompte) {
		Compte cp=compteRepository.findById(codeCompte).orElse(null);
		if(cp==null) throw new RuntimeException("Compte introuvable");
		return cp;
	}

	@PutMapping("/comptes/verser/{codeCompte}&{montant}")
	public void verser(@PathVariable  String codeCompte, @PathVariable double montant) {
		Compte cp=consulterCompte(codeCompte);
		cp.setSolde(cp.getSolde()+montant);
		Versement v =new Versement(new Date(), montant, cp);
		operationRepository.save(v);
	}

	@PutMapping("/comptes/retirer/{codeCompte}&{montant}")
	public void retirer(@PathVariable  String codeCompte, @PathVariable double montant) {
		Compte cp=consulterCompte(codeCompte);
		double faciliteCaisse=0;
		if(cp instanceof CompteCourant)
			faciliteCaisse=((CompteCourant) cp).getDecouvert();
		if(cp.getSolde()+faciliteCaisse < montant)throw new RuntimeException("Solde insuffisant");
		else {
			cp.setSolde(cp.getSolde()-montant);
			Retrait v =new Retrait(new Date(), montant, cp);
			operationRepository.save(v);
		}
	}

	@PutMapping("/comptes/virement/{codeCompte1}&{codeCompte2}&{montant}")
	public void virement(@PathVariable String codeCompte1, @PathVariable String codeCompte2, @PathVariable double montant)
	{
		retirer(codeCompte1, montant);
		verser(codeCompte2, montant);
	}

	@GetMapping("/comptes/listOperation")
	public Page<Operation> listOperation(@RequestParam(name = "codeCompte") String codeCompte,
										 @RequestParam (name = "page", defaultValue ="0") int page,
										 @RequestParam (name = "size", defaultValue = "5") int size) {

		return operationRepository.listOperation(codeCompte, PageRequest.of(page, size));

	}

	@PutMapping("/comptes/addCpCourant/{codeClient}&{codeCompte}&{solde}&{decouvert}")
	public void addComptecourant(@PathVariable Long codeClient,@PathVariable String codeCompte ,@PathVariable double solde,@PathVariable double decouvert) {
		Employee c= employeeRepository.findById(codeClient).orElse(null);
		//if(typeCompte == "CC")	
		CompteCourant cc =  new CompteCourant(codeCompte,new Date(),solde,c,decouvert);
		compteRepository.save(cc);

	}

	@PutMapping("/comptes/addCpEpargne/{codeClient}&{codeCompte}&{solde}&{taux}")
	public void addCompteEpargne(@PathVariable Long codeClient,@PathVariable String codeCompte ,@PathVariable double solde,@PathVariable double taux) {
		Employee c= employeeRepository.findById(codeClient).orElse(null);
		//if(typeCompte == "CC")	
		CompteEpargne ce=new CompteEpargne(codeCompte,new Date(),solde,c,taux);
		compteRepository.save(ce);
	}
*/


}

package com.projet.entites;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * @author ci
 *
 */

@Entity
public class Employee implements Serializable{


@Id
@GeneratedValue
private Long code;
private String matricule;
private String nom;
private String prenom;
private Integer  cin;
private Date dateEntree;
private Integer nbrEnfants;
private Date dateNaiss;
private String email;
private Integer numTel;
private String situationFamiliale;
private Integer soldeConge;
private Integer droitAnnuel;
private String bulletinPaie;
private String sexe;
private String comment;
@OneToOne(targetEntity = Diplome.class,cascade = CascadeType.ALL)
@JoinColumn(name="diplome",referencedColumnName ="id")
private Diplome diplome;
@OneToOne(targetEntity = Adresse.class,cascade = CascadeType.ALL)
@JoinColumn(name="adr_client",referencedColumnName ="code_adresse")
private Adresse address;
@OneToOne(targetEntity = DemandeConge.class,cascade = CascadeType.ALL)
@JoinColumn(name="demande_conge",referencedColumnName ="id")
private DemandeConge demandeConge;
@OneToOne(targetEntity = Fonction.class,cascade = CascadeType.ALL)
@JoinColumn(name="fonction",referencedColumnName ="id")
private Fonction fonction;
@OneToOne(targetEntity = Service.class,cascade = CascadeType.ALL)
@JoinColumn(name="service",referencedColumnName ="id")
private Service service;

public Employee() {
	super();
}



public Employee(String nom, String prenom, Date dateNaiss, String email, String sexe, Adresse adress , String matricule,Integer cin
,Date dateEntree,Integer nbrEnfants,Integer numTel,String situationFamiliale,Integer soldeConge,Integer droitAnnuel,String bulletinPaie,Diplome diplome,DemandeConge demandeConge,Fonction fonction,Service service,String comment) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.dateNaiss = dateNaiss;
	this.email = email;
	this.sexe=sexe;
	this.address=adress;
	this.matricule=matricule;
	this.cin=cin;
	this.dateEntree=dateEntree;
    this.nbrEnfants=nbrEnfants;
    this.numTel=numTel;
	this.situationFamiliale=situationFamiliale;
	this.soldeConge=soldeConge;
	this.droitAnnuel=droitAnnuel;
	this.bulletinPaie=bulletinPaie;
	this.diplome=diplome;
	this.demandeConge=demandeConge;
	this.fonction=fonction;
	this.service=service;
	this.comment=comment;
}


public Long getCode() {
	return code;
}
public void setCode(Long code) {
	this.code = code;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

	public Diplome getDiplome() {
		return diplome;
	}

	public void setDiplome(Diplome diplome) {
		this.diplome = diplome;
	}

	public String getPrenom() {
	return prenom;
}


public void setPrenom(String prenom) {
	this.prenom = prenom;
}


public Date getDateNaiss() {
	return dateNaiss;
}


public void setDateNaiss(Date dateNaiss) {
	this.dateNaiss = dateNaiss;
}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public Adresse getAddress() {
		return address;
	}

	public void setAddress(Adresse address) {
		this.address = address;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}


	public Date getDateEntree() {
		return dateEntree;
	}

	public void setDateEntree(Date dateEntree) {
		this.dateEntree = dateEntree;
	}

	public Integer getNbrEnfants() {
		return nbrEnfants;
	}

	public void setNbrEnfants(Integer nbrEnfants) {
		this.nbrEnfants = nbrEnfants;
	}


	public String getSituationFamiliale() {
		return situationFamiliale;
	}

	public void setSituationFamiliale(String situationFamiliale) {
		this.situationFamiliale = situationFamiliale;
	}



	public String getBulletinPaie() {
		return bulletinPaie;
	}

	public void setBulletinPaie(String bulletinPaie) {
		this.bulletinPaie = bulletinPaie;
	}

	public DemandeConge getDemandeConge() {
		return demandeConge;
	}

	public void setDemandeConge(DemandeConge demandeConge) {
		this.demandeConge = demandeConge;
	}

	public Fonction getFonction() {
		return fonction;
	}

	public void setFonction(Fonction fonction) {
		this.fonction = fonction;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Integer getCin() {
		return cin;
	}

	public void setCin(Integer cin) {
		this.cin = cin;
	}

	public Integer getNumTel() {
		return numTel;
	}

	public void setNumTel(Integer numTel) {
		this.numTel = numTel;
	}

	public Integer getSoldeConge() {
		return soldeConge;
	}

	public void setSoldeConge(Integer soldeConge) {
		this.soldeConge = soldeConge;
	}

	public Integer getDroitAnnuel() {
		return droitAnnuel;
	}

	public void setDroitAnnuel(Integer droitAnnuel) {
		this.droitAnnuel = droitAnnuel;
	}
}

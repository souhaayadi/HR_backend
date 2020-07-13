package com.projet.entites;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

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
private String cin;
private Date dateEntree;
private String nbrEnfants;
private Date dateNaiss;
private String email;
private String numTel;
private String situationFamiliale;
private String soldeConge;
private String droitAnnuel;
private String bulletinPaie;
private String sexe;

@OneToOne()
@JsonIgnore
private Diplome diplome;
@OneToOne()
@JsonIgnore
private Adresse address;
@OneToOne()
@JsonIgnore
private DemandeConge demandeConge;
@OneToOne()
@JsonIgnore
private Fonction fonction;

public Employee() {
	super();
}



public Employee(String nom, String prenom, Date dateNaiss, String email, String sexe, Adresse adress , String matricule,String cin
,Date dateEntree,String nbrEnfants,String numTel,String situationFamiliale,String soldeConge,String droitAnnuel,String bulletinPaie,Diplome diplome,DemandeConge demandeConge,Fonction fonction) {
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

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public Date getDateEntree() {
		return dateEntree;
	}

	public void setDateEntree(Date dateEntree) {
		this.dateEntree = dateEntree;
	}

	public String getNbrEnfants() {
		return nbrEnfants;
	}

	public void setNbrEnfants(String nbrEnfants) {
		this.nbrEnfants = nbrEnfants;
	}

	public String getNumTel() {
		return numTel;
	}

	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}

	public String getSituationFamiliale() {
		return situationFamiliale;
	}

	public void setSituationFamiliale(String situationFamiliale) {
		this.situationFamiliale = situationFamiliale;
	}

	public String getSoldeConge() {
		return soldeConge;
	}

	public void setSoldeConge(String soldeConge) {
		this.soldeConge = soldeConge;
	}

	public String getDroitAnnuel() {
		return droitAnnuel;
	}

	public void setDroitAnnuel(String droitAnnuel) {
		this.droitAnnuel = droitAnnuel;
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
}

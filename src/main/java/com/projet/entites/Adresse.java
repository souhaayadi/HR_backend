package com.projet.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Adresse implements Serializable {
    @Id
    @GeneratedValue
<<<<<<< Updated upstream
    private Long code_adresse;
    private String postalCode;
    private String country;
    private String city;
    private String principalAdress;
    private String phoneNumber;

    public Adresse() {
    }

    public Long getCode_adresse() {
        return code_adresse;
    }

    public void setCode_adresse(Long code_adresse) {
        this.code_adresse = code_adresse;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPrincipalAdress() {
        return principalAdress;
    }

    public void setPrincipalAdress(String principalAdress) {
        this.principalAdress = principalAdress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
=======
    private String codePostal;
    private String pays;
    private String ville;
    private String adressePrincipale;
    private String code_adresse;
    public Adresse() {
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getAdressePrincipale() {
        return adressePrincipale;
    }

    public void setAdressePrincipale(String adressePrincipale) {
        this.adressePrincipale = adressePrincipale;
    }

    public String getCode_adresse() {
        return code_adresse;
    }

    public void setCode_adresse(String code_adresse) {
        this.code_adresse = code_adresse;
>>>>>>> Stashed changes
    }
}

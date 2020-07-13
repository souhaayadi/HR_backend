package com.projet.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Adresse implements Serializable {
    @Id
    @GeneratedValue
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
    }
}

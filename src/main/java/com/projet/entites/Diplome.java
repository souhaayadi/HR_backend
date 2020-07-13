package com.projet.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Diplome implements Serializable {

    @Id
    @GeneratedValue
    private long id;
    private String libelle;
    private String typeDiplome;

    public Diplome() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getTypeDiplome() {
        return typeDiplome;
    }

    public void setTypeDiplome(String typeDiplome) {
        this.typeDiplome = typeDiplome;
    }
}

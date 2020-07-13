package com.projet.dao;

import com.projet.entites.DemandeConge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CongeRepository extends JpaRepository<DemandeConge,Long> {

}

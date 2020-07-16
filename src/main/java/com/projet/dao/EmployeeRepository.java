package com.projet.dao;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.projet.entites.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    @Query("select c from Employee c where c.nom Like :x ")
    Page<Employee> listEmployee(@Param("x") String mc, Pageable pageable);
    Employee findByNom(String nom);
}

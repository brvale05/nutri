package com.sistema.nutri.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistema.nutri.entities.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long>{

    Optional<Patient> findByName(String name);

    Optional<Patient> findByCpf(String cpf);

}

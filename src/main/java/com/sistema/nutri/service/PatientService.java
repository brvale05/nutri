package com.sistema.nutri.service;

import org.springframework.stereotype.Service;

import com.sistema.nutri.dto.requests.PatientCreateRequestDTO;
import com.sistema.nutri.dto.responses.PatientResponseDTO;
import com.sistema.nutri.entities.Patient;
import com.sistema.nutri.repository.PatientRepository;

import jakarta.transaction.Transactional;

@Service
public class PatientService {

    private final PatientRepository repository;

    public PatientService(PatientRepository patientRepository)
    {
        this.repository = patientRepository;
    }

//    public PatientResponseDTO create(PatientCreateRequestDTO dto)
//    {
//
//    }

    private PatientResponseDTO toResponse(Patient patient)
    {
        return PatientResponseDTO.builder()
                .Id(patient.getId())
                .name(patient.getName())
                .cpf(patient.getCpf())
                .phone_number(patient.getPhone_number())
                .birthDate(patient.getBirthDate())
                .objective(patient.getObjective())
                .food_restrictions(patient.getFood_restrictions())
                .build();
    }

}

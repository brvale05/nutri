package com.sistema.nutri.dto.requests;

import java.time.LocalDateTime;
import java.util.List;

import com.sistema.nutri.enums.EnumMainObjective;

import jakarta.validation.constraints.Size;

public record PatientUpdateRequestDTO(

    @Size(max=80)
    String name,

    @Size(min=11, max=11, message="CPF deve possuir 11 números")
    String cpf,

    @Size(max=15)
    String phone_number,

    LocalDateTime birthDate,
  
    EnumMainObjective objective,

    List<String> food_restrictions

) {

}

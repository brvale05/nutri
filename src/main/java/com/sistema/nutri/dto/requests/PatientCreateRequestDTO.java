package com.sistema.nutri.dto.requests;

import java.time.LocalDateTime;
import java.util.List;

import com.sistema.nutri.enums.EnumMainObjective;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record PatientCreateRequestDTO(
    
    @NotBlank
    @Size(max=80)
    String name,

    @NotBlank
    @Size(min=11, max=11, message="CPF deve possuir 11 números")
    String cpf,

    @NotBlank
    @Size(max=15)
    String phone_number,

    @NotNull
    LocalDateTime birthDate,
  
    @NotNull
    EnumMainObjective objective,

    List<String> food_restrictions

) {

}

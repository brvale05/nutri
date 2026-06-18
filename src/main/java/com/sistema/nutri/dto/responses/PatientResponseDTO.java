package com.sistema.nutri.dto.responses;

import java.time.LocalDateTime;
import java.util.List;

import com.sistema.nutri.enums.EnumMainObjective;

import lombok.Builder;

@Builder
public record PatientResponseDTO(

    Long Id,

    String name,

    String cpf,

    String phone_number,

    LocalDateTime birthDate,
  
    EnumMainObjective objective,

    List<String> food_restrictions
    
) {
}

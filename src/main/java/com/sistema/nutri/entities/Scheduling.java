package com.sistema.nutri.entities;

import java.time.LocalDateTime;

import com.sistema.nutri.enums.EnumStatusScheduling;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_scheduling")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Scheduling {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @NotNull
    private LocalDateTime startDate;

    @NotNull
    private LocalDateTime endDate;

    @NotNull
    @Enumerated(EnumType.STRING)
    private EnumStatusScheduling status = EnumStatusScheduling.AGENDADO;

}

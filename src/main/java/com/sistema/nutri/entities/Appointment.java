package com.sistema.nutri.entities;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_appointment")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "ID_SCHEDULING", nullable = false)
    private Scheduling scheduling;

    @OneToOne
    @JoinColumn(name = "ID_PATIENT", nullable = false)
    private Patient patient;

    @NotNull
    private Double weight;

    @NotNull
    private Double height;

    @NotNull
    private Double fat_percentage;

    @Column(length = 500)
    private String observations;

}

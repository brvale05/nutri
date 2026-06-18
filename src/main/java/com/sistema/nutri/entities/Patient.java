package com.sistema.nutri.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.sistema.nutri.enums.EnumMainObjective;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_patient")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @NotNull
    @Column(nullable = false, length = 80)
    private String name;

    @NotNull
    @Size(min = 11, max = 11)
    @Column(nullable = false, length = 11)
    private String cpf;

    @NotNull
    @Column(nullable = false, length = 15)
    private String phone_number;

    @NotNull
    private LocalDateTime birthDate;

    @NotNull
    @Enumerated(EnumType.STRING)
    private EnumMainObjective objective;

    private List<String> food_restrictions = new ArrayList<>();

    @Override
    public String toString()
    {
        return "Patient{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", birthDate=" + birthDate +
                ", objective=" + objective +
                ", food_restrictions=" + food_restrictions +
                '}';
    }
}

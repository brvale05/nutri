package com.sistema.nutri.entities;

import com.sistema.nutri.enums.EnumAgendamento;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_agendamento")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Agendamento
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private LocalDateTime dataDaConsulta;

    private EnumAgendamento status = EnumAgendamento.CRIADA;

    @ManyToOne(fetch = FetchType.LAZY)
    private Paciente paciente;

}

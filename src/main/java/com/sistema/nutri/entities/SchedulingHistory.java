package com.sistema.nutri.entities;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_schedulingHistory")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SchedulingHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_SCHEDULING",  nullable = false)
    private Scheduling scheduling;

    @NotNull
    private LocalDateTime updatedDate;

}

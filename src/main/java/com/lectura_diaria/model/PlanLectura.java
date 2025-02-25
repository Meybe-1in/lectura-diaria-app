package com.lectura_diaria.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter @Setter
@Table(name = "plan_lectura")
public class PlanLectura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String Libro;

    @Column(nullable = false)
    private int capitulo;

    @Column(nullable = false)
    private LocalDate fecha;
}

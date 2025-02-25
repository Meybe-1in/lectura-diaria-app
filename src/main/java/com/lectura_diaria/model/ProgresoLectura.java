package com.lectura_diaria.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table(name = "progreso_lectura")
public class ProgresoLectura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "plan_lectura_id", nullable = false)
    private PlanLectura planLectura;

    @Column(nullable = false)
    private boolean completado;
}

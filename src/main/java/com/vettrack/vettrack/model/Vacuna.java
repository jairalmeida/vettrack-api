package com.vettrack.vettrack.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Vacuna {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private LocalDate fechaAplicacion;
    private LocalDate proximaAplicacion;

    @ManyToOne
    @JoinColumn(name = "mascota_id")
    private Mascota mascota;
}

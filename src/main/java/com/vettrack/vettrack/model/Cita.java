package com.vettrack.vettrack.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime fechaHora;
    private String motivo;
    private String diagnostico;

    @ManyToOne
    @JoinColumn(name = "mascota_id")
    private Mascota mascota;
}

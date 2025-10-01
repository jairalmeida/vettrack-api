/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.vettrack.vettrack.controller;

import com.vettrack.vettrack.model.Cita;
import com.vettrack.vettrack.repository.CitaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/citas")
public class CitaController {
    private final CitaRepository citaRepository;

    public CitaController(CitaRepository citaRepository) {
        this.citaRepository = citaRepository;
    }

    @GetMapping
    public List<Cita> getAll() {
        return citaRepository.findAll();
    }

    @PostMapping
    public Cita create(@RequestBody Cita cita) {
        return citaRepository.save(cita);
    }
}
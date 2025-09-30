/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.vettrack.vettrack.controller;

import com.vettrack.model.Vacuna;
import com.vettrack.repository.VacunaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vacunas")
public class VacunaController {
    private final VacunaRepository vacunaRepository;

    public VacunaController(VacunaRepository vacunaRepository) {
        this.vacunaRepository = vacunaRepository;
    }

    @GetMapping
    public List<Vacuna> getAll() {
        return vacunaRepository.findAll();
    }

    @PostMapping
    public Vacuna create(@RequestBody Vacuna vacuna) {
        return vacunaRepository.save(vacuna);
    }
}
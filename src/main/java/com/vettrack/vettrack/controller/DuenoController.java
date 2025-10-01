/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.vettrack.vettrack.controller;

import com.vettrack.vettrack.model.Dueno;
import com.vettrack.vettrack.repository.DuenoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/duenos")
public class DuenoController {
    private final DuenoRepository duenoRepository;

    public DuenoController(DuenoRepository duenoRepository) {
        this.duenoRepository = duenoRepository;
    }

    @GetMapping
    public List<Dueno> getAll() {
        return duenoRepository.findAll();
    }

    @PostMapping
    public Dueno create(@RequestBody Dueno dueno) {
        return duenoRepository.save(dueno);
    }
}
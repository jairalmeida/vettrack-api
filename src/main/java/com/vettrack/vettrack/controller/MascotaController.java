/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.vettrack.vettrack.controller;

import com.vettrack.model.Mascota;
import com.vettrack.repository.MascotaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mascotas")
public class MascotaController {
    private final MascotaRepository mascotaRepository;

    public MascotaController(MascotaRepository mascotaRepository) {
        this.mascotaRepository = mascotaRepository;
    }

    @GetMapping
    public List<Mascota> getAll() {
        return mascotaRepository.findAll();
    }

    @PostMapping
    public Mascota create(@RequestBody Mascota mascota) {
        return mascotaRepository.save(mascota);
    }
}
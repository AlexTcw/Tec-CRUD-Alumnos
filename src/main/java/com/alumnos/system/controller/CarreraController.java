package com.alumnos.system.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alumnos.system.Model.Carrera;
import com.alumnos.system.Repository.CarreraRepository;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/escuela/carrera")
public class CarreraController {

    @Autowired
    CarreraRepository carreraRepository;

    @GetMapping("/getAllCarrerasNames")
    public List<String> getAllCarrerasNames() {
        List<Carrera> allCarrearas = carreraRepository.findAll();
        List<String> carrerasNames = new ArrayList<>();

        for (Carrera carrera : allCarrearas) {
            carrerasNames.add(carrera.getNombreCarrera());
        }

        return carrerasNames;
    }

}

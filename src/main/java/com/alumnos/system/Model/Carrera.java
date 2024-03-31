package com.alumnos.system.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Carrera {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cveCarrera;
    private String nombreCarrera;

    public Carrera(Long cveCarrera, String nombreCarrera) {
        this.cveCarrera = cveCarrera;
        this.nombreCarrera = nombreCarrera;
    }

    public Carrera() {
    }

    public Long getCveCarrera() {
        return cveCarrera;
    }

    public void setCveCarrera(Long cveCarrera) {
        this.cveCarrera = cveCarrera;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

}

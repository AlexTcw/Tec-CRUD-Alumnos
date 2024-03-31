package com.alumnos.system.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alumnos.system.Model.Alumno;
import com.alumnos.system.Model.StringLongDTO;
import com.alumnos.system.Repository.AlumnoRepository;
import com.alumnos.system.service.Alumno.AlumnoService;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/escuela/alumno")
public class AlumnoController {

    @Autowired
    AlumnoService alumnoService;

    @Autowired
    AlumnoRepository alumnoRepository;

    @PostMapping("/createOrUpdate")
    public ResponseEntity<Object> createOrUpdateAlumno(@RequestBody Alumno alumno) {
        try {
            Alumno responseAlumno = alumnoService.createOrUpdateAlumno(alumno);
            if (responseAlumno != null) {
                return ResponseEntity.ok().body(responseAlumno);
            }
            return ResponseEntity.badRequest().body("No se pudo crear o actualizar el Alumno.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al procesar la solicitud.");
        }
    }

    @PostMapping("/getAlumno")
    public ResponseEntity<Object> recoverAlumnoByID(@RequestBody StringLongDTO dto) {
        Optional<Alumno> response = alumnoService.findAlumnoByID(dto.getCve());
        if (response != null) {
            return ResponseEntity.ok().body(response);
        }
        return ResponseEntity.badRequest().body("No se pudo recuperar los Alumnos.");
    }

    @GetMapping("/findAll")
    public ResponseEntity<Object> findAllAlumno() {
        List<Alumno> responseAlumno = alumnoService.findAllAlumnos();
        if (responseAlumno != null) {
            return ResponseEntity.ok().body(responseAlumno);
        }
        return ResponseEntity.badRequest().body("No se pudo recuperar los Alumnos.");
    }

    @PostMapping("delete")
    public void deleteAlumnoById(@RequestBody StringLongDTO dto) {
        alumnoService.deleteAlumnoById(dto.getCve());
    }

    @PostMapping("deleteCurso")
    public ResponseEntity<Object> deleteCursoAlumno(@RequestBody StringLongDTO dto) {
        if (alumnoService.deleteCursoAlumno(dto.getCve(), dto.getLabel())) {
            return ResponseEntity.ok().body("Curso borrado exitosamente");
        }

        return ResponseEntity.badRequest().body("error al borrar curso");
    }

    @PostMapping("addCurso")
    public ResponseEntity<Object> addCursoALumno(@RequestBody StringLongDTO dto) {
        if (alumnoService.addCursoAlumno(dto.getCve(), dto.getLabel())) {
            return ResponseEntity.ok().body("curso añadido");
        }

        return ResponseEntity.badRequest().body("error al añadir curso");
    }

}

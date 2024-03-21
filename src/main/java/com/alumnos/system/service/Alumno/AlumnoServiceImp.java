package com.alumnos.system.service.Alumno;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alumnos.system.Model.Alumno;
import com.alumnos.system.Repository.AlumnoRepository;

import jakarta.persistence.Id;

@Service
public class AlumnoServiceImp implements AlumnoService {

	
	@Autowired
	AlumnoRepository alumnoRepository;
	
	@Override
	public Alumno createOrUpdateAlumno(Alumno alumno) {		
		return alumnoRepository.save(alumno);
	}
	
	@Override
	public List<Alumno> findAllAlumnos(){
		return alumnoRepository.findAll();
	}
	
	@Override
	public Optional<Alumno> findAlumnoByID(Long cveAlumno) {
		return alumnoRepository.findById(cveAlumno);
	}
	
	@Override
	public void deleteAlumnoById(Long cveAlumno){
		alumnoRepository.deleteById(cveAlumno);
	}
	
	@Override
	public Boolean addCursoByID(Long cveAlumno) {
		if (cveAlumno!= null) {
			if (alumnoRepository.existsById(cveAlumno)) {
			}
			return false;
		}
		return false;
	}
	
}

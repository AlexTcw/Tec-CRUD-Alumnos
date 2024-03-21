package com.alumnos.system.service.Alumno;

import java.util.List;
import java.util.Optional;

import com.alumnos.system.Model.Alumno;

public interface AlumnoService {

	Alumno createOrUpdateAlumno(Alumno alumno);

	List<Alumno> findAllAlumnos();

	Optional<Alumno> findAlumnoByID(Long cveAlumno);

	void deleteAlumnoById(Long cveAlumno);

	Boolean addCursoByID(Long cveAlumno);

}

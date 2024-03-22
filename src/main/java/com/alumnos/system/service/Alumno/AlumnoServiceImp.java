package com.alumnos.system.service.Alumno;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alumnos.system.Model.Alumno;
import com.alumnos.system.Repository.AlumnoRepository;

@Service
public class AlumnoServiceImp implements AlumnoService {

	@Autowired
	AlumnoRepository alumnoRepository;

	@Override
	public Alumno createOrUpdateAlumno(Alumno alumno) {

		if (alumno.getCveAlumno() != null) {
			if (alumnoRepository.existsById(alumno.getCveAlumno())) {
				// El curso ya existe, cargarlo de la base de datos y actualizar sus atributos
				Alumno existingAlumno = alumnoRepository.findAlumnoByCveAlumno(alumno.getCveAlumno());
				existingAlumno.setNombre(alumno.getNombre());
				existingAlumno.setApellido(alumno.getApellido());
				existingAlumno.setFechaNacimiento(alumno.getFechaNacimiento());
				existingAlumno.setDireccion(alumno.getDireccion());
				existingAlumno.setCorreoElectronico(alumno.getCorreoElectronico());
				existingAlumno.setTelefono(alumno.getTelefono());
				existingAlumno.setCarrera(alumno.getCarrera());

				// Puedes actualizar más atributos aquí según sea necesario

				// Guardar el curso actualizado en la base de datos y devolverlo
				return alumnoRepository.save(existingAlumno);
			}

		}
		return alumnoRepository.save(alumno);
	}

	@Override
	public List<Alumno> findAllAlumnos() {
		return alumnoRepository.findAll();
	}

	@Override
	public Optional<Alumno> findAlumnoByID(Long cveAlumno) {
		return alumnoRepository.findById(cveAlumno);
	}

	@Override
	public void deleteAlumnoById(Long cveAlumno) {
		alumnoRepository.deleteById(cveAlumno);
	}
}

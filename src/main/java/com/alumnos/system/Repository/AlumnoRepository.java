package com.alumnos.system.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alumnos.system.Model.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Long>{
	
	
}

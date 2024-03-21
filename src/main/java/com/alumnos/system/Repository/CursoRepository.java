package com.alumnos.system.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alumnos.system.Model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long>{
	
}

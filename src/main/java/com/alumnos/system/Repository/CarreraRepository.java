package com.alumnos.system.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alumnos.system.Model.Carrera;

@Repository
public interface CarreraRepository extends JpaRepository<Carrera, Long> {

}

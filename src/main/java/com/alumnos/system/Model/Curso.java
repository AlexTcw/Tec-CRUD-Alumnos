package com.alumnos.system.Model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Curso {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long cveCurso;
	String nombreCurso;
	int creditos;
	String maestro;

	@ManyToMany(mappedBy = "cursos") // Relación inversa de la lista de cursos en la clase Alumno
	private List<Alumno> alumnos;

	public Curso(Long cveCurso, String nombreCurso, int creditos, String maestro, List<Alumno> alumnos) {
		super();
		this.cveCurso = cveCurso;
		this.nombreCurso = nombreCurso;
		this.creditos = creditos;
		this.maestro = maestro;
		this.alumnos = alumnos;
	}

	public Curso() {
		super();
	}

	public Long getCveCurso() {
		return cveCurso;
	}

	public void setCveCurso(Long cveCurso) {
		this.cveCurso = cveCurso;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public String getMaestro() {
		return maestro;
	}

	public void setMaestro(String maestro) {
		this.maestro = maestro;
	}

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

}

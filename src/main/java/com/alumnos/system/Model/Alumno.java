package com.alumnos.system.Model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Alumno {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cveAlumno;
	private String nombre;
	private String apellido;
	private Date fechaNacimiento;
	private String direccion;
	private String correoElectronico;
	private String telefono;
	private String carnetIdentidad;
	private String carrera;
	private Date fechaInscripcion;

	@ManyToMany
	private List<Curso> cursos;

	public Alumno() {
		super();
	}

	public Alumno(Long cveAlumno, String nombre, String apellido, Date fechaNacimiento, String direccion,
			String correoElectronico, String telefono, String carnetIdentidad, String carrera, Date fechaInscripcion,
			List<Curso> cursos) {
		super();
		this.cveAlumno = cveAlumno;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.correoElectronico = correoElectronico;
		this.telefono = telefono;
		this.carnetIdentidad = carnetIdentidad;
		this.carrera = carrera;
		this.fechaInscripcion = fechaInscripcion;
		this.cursos = cursos;
	}

	public Long getCveAlumno() {
		return cveAlumno;
	}

	public void setCveAlumno(Long cveAlumno) {
		this.cveAlumno = cveAlumno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCarnetIdentidad() {
		return carnetIdentidad;
	}

	public void setCarnetIdentidad(String carnetIdentidad) {
		this.carnetIdentidad = carnetIdentidad;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public Date getFechaInscripcion() {
		return fechaInscripcion;
	}

	public void setFechaInscripcion(Date fechaInscripcion) {
		this.fechaInscripcion = fechaInscripcion;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

}

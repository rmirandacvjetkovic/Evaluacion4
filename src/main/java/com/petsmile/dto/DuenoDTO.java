package com.petsmile.dto;

import java.io.Serializable;

public class DuenoDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String rut;
	private String nombre;
	private String apellido;
	private String direccion;
	private String correo;
	private String telefono;
	private String nombreMascota;
	
	public DuenoDTO(String rut, String nombre, String apellido, String direccion, String correo, String telefono,
			String nombreMascota) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.correo = correo;
		this.telefono = telefono;
		this.nombreMascota = nombreMascota;
	}
	
	public DuenoDTO() {
		super();
	}

	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getNombreMascota() {
		return nombreMascota;
	}
	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}
	
	
}

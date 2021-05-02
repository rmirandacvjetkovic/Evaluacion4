package com.petsmile.dto;

import java.io.Serializable;

public class MascotaDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer idMascota;
	private String rutDueno;
	private String tipoMascota;
	private Integer edad;
	private String nombreMascota;
	
	public MascotaDTO(Integer idMascota, String rutDueno, String tipoMascota, Integer edad, String nombreMascota) {
		super();
		this.idMascota = idMascota;
		this.rutDueno = rutDueno;
		this.tipoMascota = tipoMascota;
		this.edad = edad;
		this.nombreMascota = nombreMascota;
	}
	
	public MascotaDTO() {
		super();
	}

	public Integer getIdMascota() {
		return idMascota;
	}
	public void setIdMascota(Integer idMascota) {
		this.idMascota = idMascota;
	}
	public String getRutDueno() {
		return rutDueno;
	}
	public void setRutDueno(String rutDueno) {
		this.rutDueno = rutDueno;
	}
	public String getTipoMascota() {
		return tipoMascota;
	}
	public void setTipoMascota(String tipoMascota) {
		this.tipoMascota = tipoMascota;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getNombreMascota() {
		return nombreMascota;
	}
	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}
	
	
}

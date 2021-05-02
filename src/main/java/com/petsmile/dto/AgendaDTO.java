package com.petsmile.dto;

import java.io.Serializable;
import java.util.Date;

public class AgendaDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer idMascota;
	private String rutDueno;
	private String nombreMascota;
	private String hora;
	private Date fecha;
	private MascotaDTO mascota;
	private DuenoDTO dueno;

	

	public AgendaDTO(Integer id, Integer idMascota, String rutDueno, String nombreMascota, String hora, Date fecha,
			MascotaDTO mascota, DuenoDTO dueno) {
		super();
		this.id = id;
		this.idMascota = idMascota;
		this.rutDueno = rutDueno;
		this.nombreMascota = nombreMascota;
		this.hora = hora;
		this.fecha = fecha;
		this.mascota = mascota;
		this.dueno = dueno;
	}

	public AgendaDTO() {
		super();
		dueno = new DuenoDTO();
		mascota = new MascotaDTO();
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
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
	
	public String getNombreMascota() {
		return nombreMascota;
	}
	
	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}
	
	public String getHora() {
		return hora;
	}
	
	public void setHora(String hora) {
		this.hora = hora;
	}
	
	public Date getFecha() {
		return fecha;
	}
	
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public MascotaDTO getMascota() {
		return mascota;
	}

	public void setMascota(MascotaDTO mascota) {
		this.mascota = mascota;
	}

	public DuenoDTO getDueno() {
		return dueno;
	}

	public void setDueno(DuenoDTO dueno) {
		this.dueno = dueno;
	}
	

}

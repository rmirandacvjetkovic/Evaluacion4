package com.petsmile.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer id; 
	private String nombreUsuario;
	private String password;
	private List<MascotaDTO> mascotas;
	
	public UsuarioDTO(Integer id, String nombreUsuario, String password, List<MascotaDTO> mascotas) {
		super();
		this.id = id;
		this.nombreUsuario = nombreUsuario;
		this.password = password;
		this.setMascotas(mascotas);
	}
	
	public UsuarioDTO() {
		super();
		setMascotas(new ArrayList<MascotaDTO>());
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public List<MascotaDTO> getMascotas() {
		return mascotas;
	}

	public void setMascotas(List<MascotaDTO> mascotas) {
		this.mascotas = mascotas;
	}

	
}

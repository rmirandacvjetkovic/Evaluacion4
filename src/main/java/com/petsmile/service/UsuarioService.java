package com.petsmile.service;

import com.petsmile.dto.UsuarioDTO;

public interface UsuarioService {
	public UsuarioDTO login(String username, String password);
}

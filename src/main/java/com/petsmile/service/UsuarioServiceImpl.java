package com.petsmile.service;

import com.petsmile.dao.UsuarioDAO;
import com.petsmile.dto.UsuarioDTO;

public class UsuarioServiceImpl implements UsuarioService {

	public UsuarioDAO dao;
	
	@Override
	public UsuarioDTO login(String username, String password) {
		dao = new UsuarioDAO();
		return dao.findUsuarioByUsernameAndPassword(username, password);
	}

}

package com.petsmile.service;

import java.util.List;

import com.petsmile.dao.AgendaDAO;
import com.petsmile.dto.AgendaDTO;

public class AgendaServiceImpl implements AgendaService {

	public AgendaDAO dao;
	
	@Override
	public List<AgendaDTO> listarAgendas() {
		dao = new AgendaDAO();
		return dao.findAllAgenda();
	}

	@Override
	public void insertarAgenda(AgendaDTO agenda) {
		dao = new AgendaDAO();
		dao.insertAgenda(agenda);
	}

}

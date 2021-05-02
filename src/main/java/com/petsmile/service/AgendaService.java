package com.petsmile.service;

import java.util.List;

import com.petsmile.dto.AgendaDTO;

public interface AgendaService {
	public List<AgendaDTO> listarAgendas();
	public void insertarAgenda(AgendaDTO agenda);
}

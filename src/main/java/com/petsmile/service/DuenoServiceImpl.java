package com.petsmile.service;

import java.util.List;

import com.petsmile.dao.DuenoDAO;
import com.petsmile.dto.DuenoDTO;

public class DuenoServiceImpl implements DuenoService {

	public DuenoDAO dao;
	
	@Override
	public List<DuenoDTO> listarDuenos() {
		dao = new DuenoDAO();
		return dao.selectAllDueno();
	}

}

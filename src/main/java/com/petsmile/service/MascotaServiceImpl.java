package com.petsmile.service;

import java.util.List;

import com.petsmile.dao.MascotaDAO;
import com.petsmile.dto.MascotaDTO;

public class MascotaServiceImpl implements MascotaService {

	MascotaDAO dao;
	
	@Override
	public List<MascotaDTO> buscarMascotasPorDueno(String rut) {
		dao = new MascotaDAO();
		return dao.findMascotarByRutDueno(rut);
	}

}

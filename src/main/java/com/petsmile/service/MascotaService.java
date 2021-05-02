package com.petsmile.service;

import java.util.List;

import com.petsmile.dto.MascotaDTO;

public interface MascotaService {
	public List<MascotaDTO> buscarMascotasPorDueno(String rut);
}

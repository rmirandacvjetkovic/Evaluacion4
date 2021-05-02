package com.petsmile.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.petsmile.constantes.constantesDB;
import com.petsmile.db.conexion.Conexion;
import com.petsmile.dto.MascotaDTO;

public class MascotaDAO extends Conexion {
	public List<MascotaDTO> findMascotarByRutDueno(String rut) {
		
		List<MascotaDTO> mascotas = new ArrayList<MascotaDTO>();
		
		try {
			cn = conectar();
			ps = cn.prepareStatement(constantesDB.SELECT_ALL_MASCOTA_BY_RUT_DUENO);
			ps.setString(1, rut);
			rs = ps.executeQuery();
			while(rs.next()) {
				mascotas.add(new MascotaDTO(rs.getInt("id_mascota"), rs.getString("rut_dueno"), rs.getString("tipo_mascota"), rs.getInt("edad"), rs.getString("nombre_mascota")));
			}
		} catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			closeResultSet();
			closePreparedStatement();
			closeConnection();
		}
		
		return mascotas;
		
	}
}

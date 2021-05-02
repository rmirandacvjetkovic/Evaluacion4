package com.petsmile.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.petsmile.constantes.constantesDB;
import com.petsmile.db.conexion.Conexion;
import com.petsmile.dto.DuenoDTO;

public class DuenoDAO extends Conexion {
	public List<DuenoDTO> selectAllDueno() {
		List<DuenoDTO> duenos = new ArrayList<DuenoDTO>();
		
		try {
			cn = conectar();
			ps = cn.prepareStatement(constantesDB.SELECT_ALL_DUENO);
			rs = ps.executeQuery();
			while(rs.next()) {
				duenos.add(new DuenoDTO(
						rs.getString("rut"), 
						rs.getString("nombre"), 
						rs.getString("apellido"), 
						rs.getString("direccion"), 
						rs.getString("correo"), 
						rs.getString("telefono"), 
						rs.getString("nombre_mascota")));
			}
		} catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			closeResultSet();
			closePreparedStatement();
			closeConnection();
		}
		
		return duenos;
	}
}

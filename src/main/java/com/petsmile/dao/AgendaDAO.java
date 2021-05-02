package com.petsmile.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.petsmile.constantes.constantesDB;
import com.petsmile.db.conexion.Conexion;
import com.petsmile.dto.AgendaDTO;

public class AgendaDAO extends Conexion {
	
	public void insertAgenda(AgendaDTO agenda) {
		
		try {
			cn = conectar();
			ps = cn.prepareStatement(constantesDB.INSERT_AGENDA);
			ps.setInt(1, agenda.getIdMascota());
			ps.setString(2, agenda.getRutDueno());
			ps.setString(3, agenda.getNombreMascota());
			ps.setString(4, agenda.getHora());
			ps.setDate(5, new java.sql.Date(agenda.getFecha().getTime()));
			ps.executeUpdate();
		} catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			closePreparedStatement();
			closeConnection();
		}
		
	}
	
	public List<AgendaDTO> findAllAgenda() {
		
		List<AgendaDTO> agendas = new ArrayList<AgendaDTO>();
		
		try {
			cn = conectar();
			ps = cn.prepareStatement(constantesDB.SELECT_ALL_AGENDA);
			rs = ps.executeQuery();
			while(rs.next()) {
				agendas.add(new AgendaDTO(
						rs.getInt("id"), 
						rs.getInt("id_mascota"), 
						rs.getString("rut_dueno"), 
						rs.getNString("nombre_mascota"),
						rs.getNString("hora"), 
						rs.getDate("fecha"), 
						null, 
						null));
			}
		} catch(SQLException | ClassNotFoundException e ) {
			e.printStackTrace();
		} finally {
			closeResultSet();
			closePreparedStatement();
			closeConnection();
		}
		
		return agendas;
	}
}

package com.petsmile.dao;

import java.sql.SQLException;

import com.petsmile.constantes.constantesDB;
import com.petsmile.db.conexion.Conexion;
import com.petsmile.dto.UsuarioDTO;

public class UsuarioDAO extends Conexion {
	public UsuarioDTO findUsuarioByUsernameAndPassword(String username, String password){
		UsuarioDTO usuario = null;
		
		try {
			cn = conectar();
			ps = cn.prepareStatement(constantesDB.SELECT_USUARIO_BY_USERNAME_AND_PASSWORD);
			ps.setString(1, username);
			ps.setString(2, password);
			rs = ps.executeQuery();
			if (rs.next()) {
				usuario = new UsuarioDTO(rs.getInt("id"), rs.getString("nombre_usuario"), null, null);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			closeResultSet();
			closePreparedStatement();
			closeConnection();
		}
		return usuario;
	}
	
	public static void main(String args[]) {
		UsuarioDAO dao = new UsuarioDAO();
		UsuarioDTO usuario = dao.findUsuarioByUsernameAndPassword("rene", "4321");
		System.out.println(usuario.getNombreUsuario());
	}
}

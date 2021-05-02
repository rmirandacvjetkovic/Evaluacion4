package com.petsmile.db.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexion {
	
	public Connection cn = null;
	public PreparedStatement ps = null;
	public ResultSet rs = null;
	
	public Connection conectar() throws ClassNotFoundException, SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			cn =DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/clinica","root","sasa"); 
			return cn;
		}catch(ClassNotFoundException e) {
			throw new ClassNotFoundException("Driver de conexión no válido");
		}catch(SQLException e) {
			throw new SQLException("Error al intentar conexión a la base de datos");
		}
	}

	public void closeConnection() {
		try {
			this.cn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void closePreparedStatement() {
		try {
			this.ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void closeResultSet() {
		try {
			this.rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		Conexion cn = new Conexion();
		cn.conectar();
	}
}

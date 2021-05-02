package com.petsmile.constantes;

public class constantesDB {
	public static final String SELECT_USUARIO_BY_USERNAME_AND_PASSWORD = 
			
	"SELECT usuario.id,\r\n" + 
	"    usuario.nombre_usuario,\r\n" + 
	"    usuario.password\r\n" + 
	"FROM \r\n" + 
	"	clinica.usuario\r\n" + 
	"WHERE \r\n" + 
	"	usuario.nombre_usuario = ? \r\n" + 
	"and \r\n" + 
	"	usuario.password = ?" ;
	
	public static final String INSERT_AGENDA = 
			
	"INSERT INTO clinica.agenda\r\n" + 
	"	(id_mascota, rut_dueno, nombre_mascota, hora, fecha)\r\n" + 
	"VALUES(?, ?, ?, ?, ?);\r\n";
	
	public static final String SELECT_ALL_DUENO = 
			
	"SELECT \r\n" + 
	"	dueno.rut,\r\n" + 
	"    dueno.nombre,\r\n" + 
	"    dueno.apellido,\r\n" + 
	"    dueno.direccion,\r\n" + 
	"    dueno.correo,\r\n" + 
	"    dueno.telefono,\r\n" + 
	"    dueno.nombre_mascota\r\n" + 
	"FROM \r\n" + 
	"	clinica.dueno;\r\n" + 
	"";
	
	public static final String SELECT_ALL_MASCOTA_BY_RUT_DUENO = 
			
	"SELECT \r\n" + 
	"	mascota.id_mascota,\r\n" + 
	"    mascota.rut_dueno,\r\n" + 
	"    mascota.tipo_mascota,\r\n" + 
	"    mascota.edad,\r\n" + 
	"    mascota.nombre_mascota\r\n" + 
	"FROM \r\n" + 
	"	clinica.mascota\r\n" + 
	"WHERE\r\n" + 
	"	mascota.rut_dueno = ?\r\n" + 
	"";
	
	public static final String SELECT_ALL_AGENDA = 
			
	"SELECT \r\n" + 
	"	 agenda.id,\r\n" + 
	"    agenda.id_mascota,\r\n" + 
	"    agenda.rut_dueno,\r\n" + 
	"    agenda.nombre_mascota,\r\n" +
	"    agenda.hora,\r\n" + 
	"    agenda.fecha\r\n" + 
	"FROM \r\n" + 
	"	clinica.agenda;\r\n" + 
	"";
}

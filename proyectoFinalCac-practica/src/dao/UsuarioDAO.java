package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import dataBase.ConexionDB;


public class UsuarioDAO {
	public Boolean validarUsuarioYPass(String usuario, String contrasenia) {
		try {
			ConexionDB conexionDB = new ConexionDB();
			Connection connection = conexionDB.establecerConexion();
			Statement statement = connection.createStatement();
			String sql = new String("SELECT * FROM usuarios WHERE usuario = '" + usuario.trim() + "' AND clave ='"+ contrasenia.trim() +"' ");
			System.out.println(sql);
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				return true;
			}
			
			return false;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	}
	
	/**
	 * Ingresa un nuevo usuario
	 * @param usuario ingresado por el nuevo usuario
	 * @param contrasenia ingresado por el nuevo usuario
	 * @return si se establece la conex retorna verdadero
	 */
	
	
	
	public Boolean registrarNuevo(String usuario, String contrasenia) {
		try {
			ConexionDB conexionDB = new ConexionDB();
			Connection connection = conexionDB.establecerConexion();
			Statement statement = connection.createStatement();
			
			String sqql = new String();
			sqql ="INSERT INTO `usuarios`(`usuario`, `clave`) VALUES ('usuario','contrasenia')";
			System.out.println(sqql);
						
			ResultSet resultSet = statement.executeQuery(sqql);
			while (resultSet.next()) {
				return true;
			}
		
			return false;
			}
		catch (SQLException e) {
		
			e.printStackTrace();
		}
		return false;
		
	}
	

		
	}



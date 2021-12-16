package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dataBase.ConexionDB;
import model.Localidad;
import model.Pedido;

public class LocalidadDAO {
	
	public Boolean guardarLocalidad(Localidad localidad) {
		try 
			{ConexionDB conexionDB = new ConexionDB();
			Connection connection = conexionDB.establecerConexion();
			Statement statement = connection.createStatement();
		
				String sql = new String();
				sql = "INSERT INTO localidades" + "(´localidad´)"+ "VALUES ("
				+ "´"+ localidad.getNombre() + ")";
			
				System.out.println(sql);
				statement.executeUpdate(sql);
				
				return true;
				
			} catch (SQLException e) {
				e.printStackTrace();
				return false;
			}
	}
	public List<Localidad>  listarLocalidad() {
		try {
			ConexionDB conexionDB = new ConexionDB();
			Connection connection = conexionDB.establecerConexion();
			Statement statement = connection.createStatement();
			
			String sql = new String("SELECT * FROM localidades");
			ResultSet resultSet = statement.executeQuery(sql);
			List<Localidad> listLocalidad = new ArrayList<Localidad>();
			while (resultSet.next()) {
				Localidad localidad = new Localidad(
						resultSet.getString("nombrelocalidad"));
				listLocalidad.add(localidad);
			}
			 
			return listLocalidad;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		}
}


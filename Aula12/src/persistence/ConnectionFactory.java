package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	String urlConexao = "jdbc:postgresql://localhost:5432/bancoteste";
	String usuario = "postgres";
	String senha = "postgres";
	Connection connection;
	
	public Connection getConnection() {
		System.out.println("Conectando com o banco...");
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(urlConexao, usuario, senha);
			
			if (connection != null) {
				System.out.println("Conectado ao banco!");
			}
			else {
				System.out.println("N�o foi poss�vel conectar...");
			}
			
			return connection;
		}
		catch (ClassNotFoundException e) {
			System.out.println("Driver n�o encontrado.");
			return null;
		}
		catch (SQLException e) {
			System.out.println("N�o foi poss�vel conectar. Exception: " + e.toString());
			return null;
		}
	}
}

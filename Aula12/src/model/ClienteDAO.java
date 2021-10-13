package model;

import java.io.Closeable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import persistence.ConnectionFactory;

public class ClienteDAO implements Closeable {
	private Connection connection;
	
	public ClienteDAO() {
		this.connection = new ConnectionFactory().getConnection(); 
	}
	
	public void adicionar(Cliente cliente) {
		String sql = "insert into cliente(nome, telefone, email) values(?,?,?);";
		
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, cliente.getNome());
			statement.setString(2, cliente.getTelefone());
			statement.setString(3, cliente.getEmail());
			
			statement.execute();
			statement.close();
		}
		catch (SQLException e) {
			System.out.println(e);
		}
	}
	
	public void atualizar(Cliente cliente) {
		String sql = "update cliente set nome = ?, telefone = ?, email = ? where codigo = ?";
		
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, cliente.getNome());
			statement.setString(2, cliente.getTelefone());
			statement.setString(3, cliente.getEmail());
			statement.setInt(4, cliente.getCodigo());
			
			statement.execute();
			statement.close();
		}
		catch (SQLException e) {
			System.out.println(e);
		}
	}
	
	public void deletar(Cliente cliente) {
		String sql = "delete from cliente where codigo = ?";
		
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, cliente.getCodigo());
			statement.execute();
			statement.close();
		}
		catch (SQLException e) {
			System.out.println(e);
		}
	}
	
	public List<Cliente> obterTodos() {
		String sql = "select * from cliente";
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultado = statement.executeQuery();
			
			while (resultado.next()) {
				Cliente cliente = new Cliente();
				cliente.setCodigo(resultado.getInt("codigo"));
				cliente.setNome(resultado.getString("nome"));
				cliente.setEmail(resultado.getString("email"));
				cliente.setTelefone(resultado.getString("telefone"));
				clientes.add(cliente);
			}
			
			return clientes;
		}
		catch (SQLException e) {
			System.out.println(e);
			return null;
		}
	}
	
	public Cliente obter(String email) {
		String sql = "SELECT * FROM cliente WHERE email = ?";
		
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, email);
			ResultSet resultado = statement.executeQuery();
			
			if (resultado.next()) {
				Cliente cliente = new Cliente();
				cliente.setCodigo(resultado.getInt("codigo"));
				cliente.setNome(resultado.getString("nome"));
				cliente.setTelefone(resultado.getString("telefone"));
				cliente.setEmail(resultado.getString("email"));
				return cliente;
			}
			else {
				return null;
			}
		}
		catch (SQLException e) {
			System.out.println(e);
			return null;
		}
	}

	@Override
	public void close() {
		try {
			this.connection.close();
		} catch (SQLException e) {
			System.out.println("Erro ao fechar conexão. " + e);
		}
	}
}

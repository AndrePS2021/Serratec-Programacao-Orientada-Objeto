package Controller;

import java.util.List;

import model.Cliente;
import model.ClienteDAO;

public class ClienteController {
	
	public void adicionar(Cliente cliente) {
		try (ClienteDAO dao = new ClienteDAO()) {
			dao.adicionar(cliente);
		}
	}
	
	public void atualizar(Cliente cliente) {
		try (ClienteDAO dao = new ClienteDAO()) {
			dao.atualizar(cliente);
		}
	}
	
	public void deletar(Cliente cliente) {
		try (ClienteDAO dao = new ClienteDAO()) {
			dao.deletar(cliente);
		}
	}
	
	public List<Cliente> obterClientes() {
		try (ClienteDAO dao = new ClienteDAO()) {
			return dao.obterTodos();
		}
	}
	
	public Cliente obter(String email) {
		try (ClienteDAO dao = new ClienteDAO()) {
			return dao.obter(email);
		}
	}
}

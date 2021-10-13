package persistence;

import java.util.List;

import Controller.ClienteController;
import model.Cliente;

public class TesteConexao {
	private ClienteController controller;
	
	public TesteConexao() {
		this.controller = new ClienteController();
	}
	
	public static void main(String[] args) {
		TesteConexao teste = new TesteConexao();
		teste.adicionar();
		 teste.atualizar();
		 teste.deletar();
		teste.obtencaoTodos();
		 teste.obtencao();
		teste.obtencaoEAtualizacao();
	}
	
	private void obtencaoEAtualizacao() {
		Cliente cliente = this.controller.obter("gustavinn@gmail.com");
		cliente.setNome("Guilherme");
		cliente.setTelefone("92146");
		this.controller.atualizar(cliente);
	}

	private void obtencao() {
		Cliente cliente = this.controller.obter("gustavinn@gmail.com");
		System.out.println(cliente);
	}

	public void adicionar() {
		Cliente cliente = new Cliente();
		cliente.setNome("Gustavo");
		cliente.setEmail("gustavinn@gmail.com");
		cliente.setTelefone("2112345678");
		this.controller.adicionar(cliente);
	}
	
	public void atualizar() {
		Cliente cliente = new Cliente(2, "Gustavo Ponte", "gustavin@gmail.com", "2112345678");
		this.controller.atualizar(cliente);
	}
	
	public void deletar() {
		Cliente cliente = new Cliente(2, "Gustavo Ponte", "gustavin@gmail.com", "2112345678");
		this.controller.deletar(cliente);
	}
	
	public void obtencaoTodos() {
		List<Cliente> clientes = this.controller.obterClientes();
		
		for (Cliente cliente : clientes) {
			System.out.println(cliente);
		}
	}
}

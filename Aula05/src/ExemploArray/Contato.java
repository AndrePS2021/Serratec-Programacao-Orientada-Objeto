package Exemplo;

import java.util.ArrayList;
import java.util.List;

public class Contato {
	private String nome;
	private List<Telefone> Telefones;
	
	
	public Contato() {
		this.Telefones = new ArrayList<Telefone>();
	}

	public void setTelefone(Telefone telefone) {
		this.Telefones.add(telefone);
	}
	
	public List<Telefone> getTelefones(){
		return this.Telefones;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}

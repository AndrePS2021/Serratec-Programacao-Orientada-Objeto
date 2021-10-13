package aula8;

import java.util.List;

public class Contato {
	private Endereco endereco;
	private List<Telefone> telefones;
	
	public Contato(Endereco endereco, List<Telefone> telefones) {
		this.telefones = telefones;
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		String numeros = this.telefones
				.toString()
				.replace("[", "")
				.replace("]", "");
		
		return String.format("Contato - %s - %s", 
				this.endereco, numeros);
	}
}

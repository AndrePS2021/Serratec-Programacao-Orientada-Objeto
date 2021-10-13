package Exemplo;

import java.util.List;

public class Program {
	public static void main(String[] args) {
		
		Telefone telefone1 = new Telefone ();
		telefone1.setNumero("12345-6789");
		
		Telefone telefone2 = new Telefone ();
		telefone2.setNumero("54321-9876");
		
		Contato contato = new Contato();
		
		contato.setTelefone(telefone1);
		contato.setTelefone(telefone2);
		
		List<Telefone> telefones = contato.getTelefones();
		System.out.println(telefones.get(0).getNumero());
		System.out.println(telefones.get(1).getNumero());
	}
}

package aula8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		ExemploException();
		System.out.println("Boa noite, Usuário. Adeus :)");
	}
	
	private static void ExemploException() {
		Calculadora c = new Calculadora();
		
		//try {
			int[] a = new int[1];
			a[2] = 1;
		/*}
		catch (ArrayIndexOutOfBoundsException e) {
			
			String erro = e.toString();
			
			System.out.println("index out of bounds - mensagem: " + e);
		}*/
		
		
		try {
			double resultado = c.Divisao(5, 1);
			System.out.println(resultado);
		}
		catch (NumeroNaoPodeSerZeroException e) {
			System.out.println(e.getMessage());
		}
		catch (CalculoComNumeroCincoException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static void ExemploContato() {
		Telefone t1 = new Telefone();
		t1.numero = "57";
		
		Telefone t2 = new Telefone();
		t2.numero = "23";
		
		List<Telefone> telefones = new ArrayList<Telefone>();
		telefones.add(t1);
		telefones.add(t2);
		
		Endereco e = new Endereco();
		e.rua = "uma rua qualquer";
		
		Contato contato = new Contato(e, telefones);
		
		System.out.println(contato);
	}
}
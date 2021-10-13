package exercicios;

import java.util.Scanner;

public class Exercicio2 {
	public void executar() {
		Scanner scanner = new Scanner(System.in);
		int opcao = 0;
		
		do {
			System.out.println("Informe o calculo desejado.");
			System.out.println("1 - soma");
			System.out.println("2 - subtração");
			System.out.println("3 - multiplicação");
			System.out.println("4 - divisão");
			System.out.println("5 - sair");
			
			opcao = scanner.nextInt();
			Calculadora calculadora = new Calculadora();
			
			if (opcao != 5) {
				double resultado = 0;

				switch (opcao) {
					case 1: 
						double valor1Adicao = LerValor(scanner, "Informe o primeiro valor:");
						double valor2Adicao = LerValor(scanner, "Informe o segundo valor:");
						resultado = calculadora.somar(valor1Adicao, valor2Adicao);
						break;
					case 2:
						double valor1Subtracao = LerValor(scanner, "Informe o primeiro valor:");
						double valor2Subtracao = LerValor(scanner, "Informe o segundo valor:");
						resultado = calculadora.subtrair(valor1Subtracao, valor2Subtracao);
						break;
					case 3:
						double valor1Multiplicacao = LerValor(scanner, "Informe o primeiro valor:");
						double valor2Multiplicacao = LerValor(scanner, "Informe o segundo valor:");
						resultado = calculadora.multiplicar(valor1Multiplicacao, valor2Multiplicacao);
						break;
					case 4: 
						double valor1Dividir = LerValor(scanner, "Informe o primeiro valor:");
						double valor2Dividir = LerValor(scanner, "Informe o segundo valor:");
						resultado = calculadora.dividir(valor1Dividir, valor2Dividir);
						break;
					default:
						System.out.println("Opção inválida.");
						continue;
				}
				
				System.out.println(String.format("Resultado: %f", resultado));
			}
		
		} while (opcao != 5);
			
		
		System.out.println("Aplicação finalizada.");
	}
	
	private double LerValor(Scanner scanner, String mensagem) {
		System.out.println(mensagem);
		return scanner.nextDouble();
	} 
}

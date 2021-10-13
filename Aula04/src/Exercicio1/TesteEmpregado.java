package Exercicio1;

public class TesteEmpregado {
	public void Executar() {
		Empregado empregado1  = new Empregado("Andre", "Ponte", 2500);
		Empregado empregado2 = new Empregado("Antonio", "Ventura", 4320.3);
	
		empregado1.calcularImpostoRenda();
		empregado2.calcularImpostoRenda();
		
		MostrarEmpregado(empregado1);
		MostrarEmpregado(empregado2);
				
	
	}
	private void MostrarEmpregado(Empregado empregado) {
		System.out.println(String.format(
				"Nome: %s, Sobrenome: %s, Salario com desconto: %.2f",
				 empregado.getNome(), empregado.getSobrenome(), empregado.getSalario()));
	}
}


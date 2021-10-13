package Exercicio1;

public class Empregado {
	private String nome;
	private String sobrenome;
	private double salario;

	public Empregado(String nome, String sobrenome, double salario) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salario = salario;
	}
	
	public void calcularImpostoRenda() {
		if (salario <= 1903.98) {
			salario = salario - salario * 0 / 100;
		} else if (salario >= 1903.99 && salario <= 2826.65) {
			salario = salario - salario * 7.5 / 100;
		} else if (salario >= 2826.66 && salario <= 3751.05) {
			salario = salario - salario * 15 / 100;
		} else if (salario >= 3751.06 && salario <= 4664.68) {
			salario = salario - salario * 22.5 / 100;
		} else {
			salario = salario - salario * 27.5 / 100;
		}
		
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}

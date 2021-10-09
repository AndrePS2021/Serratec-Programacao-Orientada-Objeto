package aula;

import java.text.NumberFormat;

public class Funcionario {
	private String nome;
	private String cargo;
	private double salario;



	public String getNome() {
		return nome;
	}

	public String getCargo() {
		return cargo;
	}

	public double getSalario() {
		return salario;
	}

	public double abonoSalario(double abono) {
		return this.salario += abono;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cargo=" + cargo + ", salario=" + NumberFormat.getCurrencyInstance().format(salario) + "]";
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}

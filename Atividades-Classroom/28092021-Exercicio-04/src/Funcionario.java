package exercicio4;

public class Funcionario {
	protected String nome;
	protected String cpf;
	protected double salario;
	protected String turno;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	public String toString() {
		return String.format("Funcionario - nome: %s, salario: %.2f",
				this.nome, this.salario);
	}
   
	public void bonificarComParticipacao() {
    	this.salario += this.salario * 0.01;
    	
    }
}

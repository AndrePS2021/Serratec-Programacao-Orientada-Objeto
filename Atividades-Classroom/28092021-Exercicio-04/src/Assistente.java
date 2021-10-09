package exercicio4;

public class Assistente extends Funcionario {
	private double adicional;
	
	public Assistente(String nome, double salario, double adicional) {
		super(nome,salario);
		this.adicional = adicional;
	}
	
	@Override
	public void bonificarComParticipacao() {
		super.bonificarComParticipacao();
		this.salario += adicional;
	}

}

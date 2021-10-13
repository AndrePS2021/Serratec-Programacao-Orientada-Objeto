package exercicio4;

public class Exercicio4 {
	public void Executar() {
		Gerente gerente = new Gerente("Jorge Luiz", 5830.35);
		Assistente assistente = new Assistente("Jalcimir Torres", 1800, 50.00);
		Funcionario funcionario = new Funcionario("Juliana", 3200);
		
		CalcularBonificacao(gerente);
		CalcularBonificacao(assistente);
		CalcularBonificacao(funcionario);
		
		
	}
public void CalcularBonificacao(Funcionario funcionario) {
	funcionario.bonificarComParticipacao();
	System.out.println(funcionario);
}
}

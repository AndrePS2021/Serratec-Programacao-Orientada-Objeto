package exercicio4;

public class Gerente extends Funcionario {
	private String nivel;

	public Gerente(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public void bonificarComParticipacao() {
		super.bonificarComParticipacao();
		this.salario += 200;
	}

//Foi gerado um getters e um setters para corrigir um erro que dava dando por nao usar o campo nivel do gerente.	
	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
}

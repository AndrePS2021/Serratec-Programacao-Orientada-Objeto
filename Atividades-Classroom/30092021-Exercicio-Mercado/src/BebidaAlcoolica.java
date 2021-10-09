package ExercicioMercado;

public class BebidaAlcoolica extends Produto {
	private String teoralcoolico;

	public BebidaAlcoolica(String nome, double valor, String teoralcoolico) {
		super(nome, valor);
		this.teoralcoolico = teoralcoolico;
	}

	public String getTeoralcoolico() {
		return teoralcoolico;
	}

	public void setTeoralcoolico(String teoralcoolico) {
		this.teoralcoolico = teoralcoolico;
	}

}

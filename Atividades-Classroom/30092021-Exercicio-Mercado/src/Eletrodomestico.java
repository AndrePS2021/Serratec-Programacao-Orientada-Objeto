package ExercicioMercado;

public class Eletrodomestico extends Produto {
	private String voltagem;

	public Eletrodomestico(String nome, double valor, String voltagem) {
		super(nome, valor);
		this.voltagem = voltagem;
	}

	public String getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(String voltagem) {
		this.voltagem = voltagem;
	}

}

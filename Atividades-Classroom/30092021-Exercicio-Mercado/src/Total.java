package ExercicioMercado;

public class Total {
	private double total;

	public double getTotal() {
		return total;
	}

	public void calcularTotal(Produto produto) {
		total += produto.getValor();
	}
}

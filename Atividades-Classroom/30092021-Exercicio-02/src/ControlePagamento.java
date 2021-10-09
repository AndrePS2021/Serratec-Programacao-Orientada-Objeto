package Exercicio1;

public class ControlePagamento {
	private double totalPago;

	public double getTotalPago() {
		return totalPago;
	}

	public void calcularTotalPago(Plano plano) {
		totalPago += plano.getValorPago();
	}
}

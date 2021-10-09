package Exercicio1;

import java.text.NumberFormat;

public class Plano {

	public double getValorPago() {
		return valorPago;
	}

	protected String empresa;
	protected double valorPago = 80;
	protected double valorIss = 5;

	public Plano(String empresa) {
		super();
		this.empresa = empresa;
	}

	public double calcularPagamento() {
		return valorPago = valorPago - valorPago * valorIss/100;
	}

	@Override
	public String toString() {
		return "Plano:" + " " + empresa + " " + "ValorPago:" + " " + NumberFormat.getCurrencyInstance().format(valorPago);
	}
}

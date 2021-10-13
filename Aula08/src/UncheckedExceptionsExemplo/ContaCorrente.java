package aula;

import java.text.NumberFormat;

public class ContaCorrente implements Conta {
	private String numero;
	private double saldo;

	public ContaCorrente(String numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "ContaCorrente: " + numero + " " + "Saldo: " + NumberFormat.getCurrencyInstance().format(saldo);
	}

	@Override
	public void depositaConta(double valor) {
		this.saldo += valor;

	}

	@Override
	public boolean saqueConta(double valor) {
		if (this.saldo < valor) {
			throw new SaldoNegativo("Saldo Negativo");
		} else {
			this.saldo -= valor;
			return true;
		}

	}

}

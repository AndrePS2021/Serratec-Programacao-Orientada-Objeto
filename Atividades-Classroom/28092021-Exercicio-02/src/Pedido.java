package exercicio2;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Pedido {
	private int numero;
	private LocalDate dataPedido;
	private double quantidade;
	private double valor;
	private double total;

	
	public Pedido(int numero, LocalDate dataPedido, double quantidade, double valor) {
		super();
		this.numero = numero;
		this.dataPedido = dataPedido;
		this.quantidade = quantidade;
		this.valor = valor;
	}
    	
public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public LocalDate getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(LocalDate dataPedido) {
		this.dataPedido = dataPedido;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	public void finalizar() {
		if (this.dataPedido.getDayOfWeek().equals(DayOfWeek.SUNDAY)){
			this.total = (this.valor - this.valor * 0.1) * this.quantidade;
		} else {
			this.total = this.valor * this.quantidade;
		}
	}
}

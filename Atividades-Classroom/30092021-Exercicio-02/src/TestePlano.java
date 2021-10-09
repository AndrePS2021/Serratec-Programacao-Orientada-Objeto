package Exercicio1;

import java.text.NumberFormat;

public class TestePlano {
	public static void main(String[] args) {

		Clinica clinica = new Clinica("Golden Cross", "Cardiograma", "123.321.654/0001-98");
		Medico medico = new Medico("Bradesco", "Luiz Ribeiro", 123456);
		Anestesista anestesista = new Anestesista("ItauPlanos", "Amanda Monteiro", 632145, "Requidiana");

		ControlePagamento cp = new ControlePagamento();
		
		clinica.calcularPagamento();
		medico.calcularPagamento();
		anestesista.calcularPagamento();
		
		cp.calcularTotalPago(clinica);
		cp.calcularTotalPago(medico);
		cp.calcularTotalPago(anestesista);

		System.out.println(clinica.toString());
		System.out.println(medico.toString());
		System.out.println(anestesista.toString());
		
		System.out.println("O Total pago pelo Plano:" + " " + NumberFormat.getCurrencyInstance().format(cp.getTotalPago()));
	}
}

package Exercicio1;

public class TestePlano {
	public static void main(String[] args) {

		Clinica clinica = new Clinica("Golden Cross", "Cardiograma", "123.321.654/0001-98");
		Medico medico = new Medico("Bradesco", "Luiz Ribeiro", 123456);
		Anestesista anestesista = new Anestesista("ItauPlanos", "Amanda Monteiro", 632145, "Requidiana");

		clinica.calcularPagamento();
		medico.calcularPagamento();
		anestesista.calcularPagamento();

		System.out.println(clinica.toString());
		System.out.println(medico.toString());
		System.out.println(anestesista.toString());
	}
}

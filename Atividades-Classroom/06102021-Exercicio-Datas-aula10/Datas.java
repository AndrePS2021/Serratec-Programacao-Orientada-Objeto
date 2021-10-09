package Exercicio;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Datas {
	public static void main(String[] args) {
		Date dataDeHoje = new Date();
		
		System.out.println("Data de Hoje:" + dataDeHoje);
		System.out.println("Milisegendos desde 1 janeiro de 1970:" + dataDeHoje.getTime());
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		String dataFormatada = formato.format(dataDeHoje);
		System.out.println("data Formatada:" + dataFormatada);
		
	}

}

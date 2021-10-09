package Exercicio;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Program {
	public static void main(String[] args) {
		LocalDateTime dataHoraNasc = LocalDateTime.of(1978, Month.AUGUST, 20, 11, 00, 00);
		LocalDateTime hojeAgora = LocalDateTime.now();
		DateTimeFormatter formatadorBarra = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Data Nascimento: " + dataHoraNasc.format(formatadorBarra));
		System.out.println("Hoje: " + hojeAgora.format(formatadorBarra));

		System.out.println("Ano de nascimento era bissexto: " + dataHoraNasc.toLocalDate().isLeapYear());

		Duration duracao = Duration.between(dataHoraNasc, hojeAgora);
		System.out.println("Desde o nascimento se passaram " + duracao.getSeconds() + " segundos");
	}

}

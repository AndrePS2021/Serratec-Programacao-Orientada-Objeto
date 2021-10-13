import java.time.LocalDate;
import java.time.Period;

public class MainLocalDate {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now().minusDays(0);

		System.out.println(localDate);
		System.out.println("Dia da semana: " + localDate.getDayOfWeek().name());
		System.out.println("Dia da semama: " + localDate.getDayOfWeek().getValue());
		System.out.println("Mes: " + localDate.getMonthValue());
		System.out.println("Mes: " + localDate.getMonth().name());
		System.out.println("Ano: " + localDate.getYear());

		LocalDate dataAniversario = LocalDate.of(1978, 8, 20);
		Period periodo = Period.between(dataAniversario, localDate);
		System.out.println(periodo.getYears());

	}

}

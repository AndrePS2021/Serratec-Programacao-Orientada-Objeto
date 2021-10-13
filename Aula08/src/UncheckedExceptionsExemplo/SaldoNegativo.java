package aula;

@SuppressWarnings("serial")
public class SaldoNegativo extends RuntimeException {
	public SaldoNegativo(String message) {
		super(message);
	}
}

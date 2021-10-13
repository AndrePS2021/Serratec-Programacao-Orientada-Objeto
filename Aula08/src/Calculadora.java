package aula8;

public class Calculadora {
	public double Divisao(int valor1, int valor2) throws NumeroNaoPodeSerZeroException, CalculoComNumeroCincoException {
		
		if (valor2 == 0) {
			//throw new ArithmeticException("Valor 2 não pode ser 0.");
			throw new NumeroNaoPodeSerZeroException("Valor 2 não pode ser 0.");
		}
		else if (valor1 == 5 || valor2 == 5) {
			throw new CalculoComNumeroCincoException("Nao pode fazer calculos com o numero 5.");
		}
		else {
			return (double)valor1 / valor2;
		}
	}
}

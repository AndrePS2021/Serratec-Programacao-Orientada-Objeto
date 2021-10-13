package exercicios;

public class CalculadoraSalario {
	public static void main(String[] args) {
		double salario = 10736.50;

		if (salario <= 1751.81) {
			salario = salario - salario * 8 / 100;
		} else if (salario >= 1751.82 && salario <= 2919.72) {
			salario = salario - salario * 9 / 100;
		} else if (salario >= 2919.73 && salario <= 5839.45) {
			salario = salario - salario * 10 / 100;
		} else {
			salario = salario - salario * 11 / 100;
		}
		System.out.println("Salario com desconto: " + salario);
	}
}

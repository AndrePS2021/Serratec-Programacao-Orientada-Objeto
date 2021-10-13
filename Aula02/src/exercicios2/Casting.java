package exercicios;

public class Casting {
	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		int soma = a + b;
		System.out.println("Soma:" + soma);
		double divisao = ((double) a + (double) b) / 2;
		System.out.println("Divisão:" + divisao);
	}
}

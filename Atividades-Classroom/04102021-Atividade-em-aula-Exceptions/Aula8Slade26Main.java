package Slade26;

public class Main {
	public static void main(String[] args) {
		int[] numerador = { 1, 2, 3, 4, 5 };
		int[] denominador = { 3, 0, 2 };

		for (int i = 0; i < numerador.length; i++) {
			try {
				System.out.println(
						"dividindo: " + numerador[i] + "/" + denominador[i] + " = " + (numerador[i / denominador[i]]));
			} catch (ArithmeticException e) {
				System.out.println("Ocorreu um problema na divis�o");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Ocorreu um problema ao acessar um indice do vetor que nao existe");
			}
		}
	}
}
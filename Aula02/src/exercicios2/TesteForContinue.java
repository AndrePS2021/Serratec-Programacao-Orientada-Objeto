//A mensagem nao sera exibida quando i for igual a 5 e 6
package exercicios;

public class TesteForContinue {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i < 2) {
				continue;
			}
			System.out.println(i);
		}
	}
}

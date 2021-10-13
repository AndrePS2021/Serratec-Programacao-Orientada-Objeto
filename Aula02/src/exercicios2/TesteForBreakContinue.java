//A mensagem será exibida até quando i for igual a 4.
package exercicios;

public class TesteForBreakContinue {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
	}
}

/*package aula8;

public class DivisaoPorZero {
	public static int divisao(int i, int j) {
// Usando o throw
//		if (j == 0)
//			throw new ArithmeticException("Erro !! Voc� dividiu um numero por zero");
		return i / j;
	}

	public static void main(String[] args) {
// Usando o try/catch
		try {
		//Bloco onde pode ocorre a exce��o
		System.out.println(divisao(20, 0));
		} catch (ArithmeticException a) {
		//Bloco onde � feito o tratamento para exce�oes arithmeticas
		System.out.println("Erro !! Voc� dividiu um n�mero por zero");
		} catch (Exception e) {
		//Bloco onde � feito o tratamento de outras exce�oes	
		} finally {
		//Comandos finais a executar independentes de ter ocorrido exce��o
		//O bloco finally � opcional	
		}
		
	}

}
*/
/*package aula8;

public class DivisaoPorZero {
	public static int divisao(int i, int j) {
// Usando o throw
//		if (j == 0)
//			throw new ArithmeticException("Erro !! Você dividiu um numero por zero");
		return i / j;
	}

	public static void main(String[] args) {
// Usando o try/catch
		try {
		//Bloco onde pode ocorre a exceção
		System.out.println(divisao(20, 0));
		} catch (ArithmeticException a) {
		//Bloco onde é feito o tratamento para exceçoes arithmeticas
		System.out.println("Erro !! Você dividiu um número por zero");
		} catch (Exception e) {
		//Bloco onde é feito o tratamento de outras exceçoes	
		} finally {
		//Comandos finais a executar independentes de ter ocorrido exceção
		//O bloco finally é opcional	
		}
		
	}

}
*/
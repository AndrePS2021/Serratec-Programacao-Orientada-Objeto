package MultiplasExceções;

public class TratandoExceção {
	
	@SuppressWarnings("null")
	public static void main(String[] args) {
		int vetor[] = {10,3,5};
		int a = 10;
		int b = 0;
		int c = 0;
		String str = null;
		try {
			c=a/b;
			System.out.println("Resultado: "+c);
			System.out.println("Resultado: "+vetor[3]);
			System.out.println("Resultado: "+str.equals("xpto"));
		}catch (ArithmeticException e){
			System.out.println("Falha ao realizar divisão");
			System.out.println("Erro: "+e.getMessage());
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Falha ao acessar o indice do vetor");
			System.out.println("Erro: "+e.getMessage());
		}catch (Exception e) {
			System.out.println("Falha no programa");
			System.out.println("Erro: "+e.getMessage());
		}
	}

}

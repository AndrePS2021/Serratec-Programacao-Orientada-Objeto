package aula;

public class Conversao {
	public static void main(String[] args) {
//Convers�o impl�cita. A vari�vel b de um tipo maior receber� o valor da vari�vel a.	
		int a = 100;
		float b = a;
//Casting de um double para um inteiro.
		double c = 4.19;
//int d = c; n�o executa
		int d = (int) c;
//Uma vari�vel float n�o pode receber um double sem convers�o pois todos os literais com ponto flutuante s�o double. A letra f indica que a vari�vel � um do tipo float.
		float e = (float) c;
		float f = 6.18f;
		System.out.println(b + "\n" + c + "\n" + d + "\n" + e + "\n" + f);
	}
}

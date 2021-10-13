package aula;

public class Conversao {
	public static void main(String[] args) {
//Conversão implícita. A variável b de um tipo maior receberá o valor da variável a.	
		int a = 100;
		float b = a;
//Casting de um double para um inteiro.
		double c = 4.19;
//int d = c; não executa
		int d = (int) c;
//Uma variável float não pode receber um double sem conversão pois todos os literais com ponto flutuante são double. A letra f indica que a variável é um do tipo float.
		float e = (float) c;
		float f = 6.18f;
		System.out.println(b + "\n" + c + "\n" + d + "\n" + e + "\n" + f);
	}
}

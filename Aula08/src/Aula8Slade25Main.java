package Slide25;

public class Main {
	public static void main(String[] args) {
		int [] numerador = {1,2,3,4,5};
		int [] denominador = {3,0,2};
		
		for (int i = 0; i < numerador.length; i++) {
			System.out.println("dividindo: "+numerador[i]+"/"+denominador[i]+" = "+ (numerador[i/denominador[i]]));
		}
	}
}

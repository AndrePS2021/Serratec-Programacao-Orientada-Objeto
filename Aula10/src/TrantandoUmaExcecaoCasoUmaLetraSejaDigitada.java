package Exemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TrantandoUmaExcecaoCasoUmaLetraSejaDigitada {
	public static void main(String[] args) {
		try {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero:");
		@SuppressWarnings("unused")
		int numero = sc.nextInt();
		} catch (InputMismatchException e){
		System.out.println("Erro !! Digite um numero inteiro");
		
		}
	}
}

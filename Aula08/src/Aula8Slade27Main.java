package Slide27;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main m = new Main();
		System.out.println("Digite um numero inteiro:");
		try {
			double num = m.lerNumero();
			System.out.println("Você digitou:" + num);
		} catch (Exception e) {
			System.out.println("Falha ao ler seu numero");
		}

	}

	public double lerNumero() throws Exception {
		Scanner in = new Scanner(System.in);
		double num = in.nextDouble();
		in.close();
		return num;
	}
}
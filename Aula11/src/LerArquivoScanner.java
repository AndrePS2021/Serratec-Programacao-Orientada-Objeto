package Exercicios;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LerArquivoScanner {
	public static void main(String[] args) throws IOException {
		File arquivo = new File("C:\\Serratec\\Programação Orientada a Objetos\\Aula11\\Teste.txt");
		Scanner sc = new Scanner(arquivo);
		while (sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
	}
}

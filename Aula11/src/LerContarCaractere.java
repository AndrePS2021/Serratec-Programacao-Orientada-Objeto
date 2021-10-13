package LerArquivoContarCaractere;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerContarCaractere {
	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(
					new FileReader("C:\\Serratec\\Programação Orientada a Objetos\\Aula11\\Teste.txt"));
			int qntCaracteres = 0;
			while (in.ready()) {
				String linha = in.readLine();
				qntCaracteres += linha.length();
			}
			System.out.println(qntCaracteres);
			in.close();
		} catch (IOException e) {
			System.out.println("Erro ao acessar arquivo");
		}
	}
}

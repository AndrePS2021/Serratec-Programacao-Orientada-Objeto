package LerArquivoPassandoBinario;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class LerAquivoPassandoBinario {
	public static void main(String[] args) {
		try {
			FileOutputStream arq = new FileOutputStream(
					"C:\\Serratec\\Programação Orientada a Objetos\\Aula11\\Teste.dat");
			DataOutputStream gravarArq = new DataOutputStream(arq);
			gravarArq.writeChars("Bom dia");
			gravarArq.close();
		} catch (IOException e) {
			System.out.println("Erro ao acessar arquivo");
		}
	}
}

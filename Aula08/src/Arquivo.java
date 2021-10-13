package aula;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Arquivo {
	public static void main(String[] args) {
		try {
			@SuppressWarnings({ "unused", "resource" })
			FileReader pv = new FileReader("aula14.txt");
		} catch (FileNotFoundException f) {
			System.out.println("Arquivo não exste");
		}
	}
}

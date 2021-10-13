package ExemploDelimiter;

import java.util.Scanner;

public class ExampleDelimiter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner("Gol, Hb20, Fiesta, Sandero, Onix");
		scanner.useDelimiter("\\d, ?");
		while (scanner.hasNext())
			System.out.println(scanner.next());
		scanner.close();
	}
}

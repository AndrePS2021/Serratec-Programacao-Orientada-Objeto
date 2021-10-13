package Map;

import java.util.HashMap;
import java.util.Map;

public class TesteVeiculo {
	public static void main(String[] args) {
		
	Map<String, String> carros = new HashMap<String, String>();
	carros.put("Ford", "Delrey");
	carros.put("Fiat", "Uno");
	carros.put("VW", "Fusca");
	carros.put("Toyota", "Corolla");
	
	for(String s: carros.keySet()) {
		System.out.println(s);
	}
	
	for (Map.Entry<String, String> entrada : carros.entrySet()) {
		System.out.println(entrada);
	}
  }
}
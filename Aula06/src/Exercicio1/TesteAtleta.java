package Exercicio1;

public class TesteAtleta {
	public static void main(String[] args) {
		Pais pais1 = new Pais("Portugal");
		Pais pais2 = new Pais("Alemanha");
		
		Atleta atleta1 = new Atleta("Joao do Pulo", 100, pais1);
		Atleta atleta2 = new Atleta("Manoel", 55, pais1);
		Atleta atleta3 = new Atleta("Ranseingbaun", 75, pais2);
		
		atleta1.verificarSituacao();
		atleta2.verificarSituacao();
		atleta3.verificarSituacao();
		
		System.out.println(atleta1);
	    System.out.println(atleta2);
	    System.out.println(atleta3);
	}

}

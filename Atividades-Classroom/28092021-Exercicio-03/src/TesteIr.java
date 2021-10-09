package Exercicio3;

public class TesteIr {
	public void Executar() {
		PessoaFisica fisica = new PessoaFisica("Andre", 10.00, "123456789-87", "11192006-2");
		PessoaJuridica juridica = new PessoaJuridica("VDDL", 12.00, "32165489000198", "1234568");
		
		fisica.CalculoIr();
		juridica.CalculoIr();
		
		System.out.println(fisica);
		System.out.println(juridica);
			
	}

}

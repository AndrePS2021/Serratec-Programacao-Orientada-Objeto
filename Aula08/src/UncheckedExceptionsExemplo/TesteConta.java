package aula;

public class TesteConta {
	public static void main(String[] args) {
		Conta cc = new ContaCorrente("23334-98", 2300.);

		cc.depositaConta(1000);
		try {
			cc.saqueConta(15400);
		} catch (SaldoNegativo s) {
			System.out.println(s.getMessage());
		}
		System.out.println(cc.toString());
	}
}

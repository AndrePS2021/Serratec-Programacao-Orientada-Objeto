package exercicios;

public class Exercicio1 {
	public void executar() {
		Imovel imovel1 = new Imovel(1, "Centro", "apto", 25000);
		Imovel imovel2 = new Imovel(2, "Quitandinha", "casa", 98900);
		
		mostrarReajuste(imovel1);
		mostrarReajuste(imovel2);
		
		imovel1.mostrarCategoria();
		imovel2.mostrarCategoria();
	}
	
	private void mostrarReajuste(Imovel imovel) {
		double resultado = imovel.CalcularReajuste();
		System.out.println(resultado);
	}
}

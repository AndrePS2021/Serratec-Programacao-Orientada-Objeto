package Narnia;

public class Caminhao extends Veiculo {
	public int Tamanho;
	
	@Override
	public void AdicionarIpva(double valor) {
		super.setIpva(valor*2);
		
		
		/*
		 * Exemplo de como chamar o método que foi sobrescrito.
		 * 
		super.AdicionarIpva(valor);
		super.setIpva(super.getIpva() * 2);
		*/
	}
}

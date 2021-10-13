package Narnia;

public class Veiculo {
	private double ipva;
	
	public void AdicionarIpva(double valor) {
		this.ipva = valor;
	}
	
	public void AdicionarIpva(String arg) {
		
	}
	
	public double getIpva() {
		return this.ipva;
	}
	
	public void setIpva(double ipva) {
		this.ipva = ipva;
	}
}

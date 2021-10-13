package exercicios;

public class Imovel {
	private int codigoImovel;
	private String bairro;
	private String tipo;
	private double valor;
	
	public Imovel(int codigoImovel, String bairro, String tipo, double valor) {
		this.codigoImovel = codigoImovel;
		this.bairro = bairro;
		this.tipo = tipo;
		this.valor = valor;
	}

	public int getCodigoImovel() {
		return codigoImovel;
	}
	
	public void setCodigoImovel(int codigoImovel) {
		this.codigoImovel = codigoImovel;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	// overload
	public double CalcularReajuste() {
		if (this.tipo.equals("casa")) {
			return CalcularReajuste(0.05);
		}
		else if (this.tipo.equals("apto" )) {
			return CalcularReajuste(0.08);
		}
		
		return 0;
	}
	
	// overload
	private double CalcularReajuste(double porcentagem) {
		return this.valor * (1 + porcentagem);
	}
	
	public void mostrarCategoria() {
		
		if (this.valor > 50000) {
			System.out.println("Categoria A.");
		}
		else if (this.valor < 10000) {
			System.out.println("Categoria C.");
		}
		else {
			System.out.println("Categoria B.");
		}
	}
}

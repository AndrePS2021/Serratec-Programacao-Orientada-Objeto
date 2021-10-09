package Exercicio1;

public class Imovel {
  public int codimovel;
  public String bairro;
  public String tipo;
  public double valor;
  
  public void calcularReajuste() {
	  if (this.tipo == "casa") { 
		  this.valor *= 1.05;
} else {
	this.valor *= 1.08;
}
  }
  public String verificarCategoria() {
	  String categoria;
	  if (this.valor < 10000) {
		  categoria = "C";
		   } else if (this.valor <= 50000) {
			   categoria ="B";
			    } else {
			    	categoria = "C";
			    	 }
	  return categoria;
  }
}

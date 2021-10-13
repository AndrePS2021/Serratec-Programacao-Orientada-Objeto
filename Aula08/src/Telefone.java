package aula8;

public class Telefone {
	public String numero;
	
	@Override
	public String toString() {
		return String.format("Numero: %s", this.numero);
	}
}

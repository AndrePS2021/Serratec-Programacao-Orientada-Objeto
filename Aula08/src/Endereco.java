package aula8;

public class Endereco {
	public String rua;
	
	@Override
	public String toString() {
		return String.format("Endereco: %s", this.rua);
	}
}

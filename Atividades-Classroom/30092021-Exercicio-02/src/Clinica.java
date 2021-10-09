package Exercicio1;

public class Clinica extends Plano {

	@Override
	public String toString() {
		return super.toString() + " " + " Clinica:" + " " + nome;
	}

	private String nome;
	private String cgc;

	public String getNome() {
		return nome;
	}

	public String getCgc() {
		return cgc;
	}

	public Clinica(String empresa, String nome, String cgc) {
		super(empresa);
		this.nome = nome;
		this.cgc = cgc;
	}

}

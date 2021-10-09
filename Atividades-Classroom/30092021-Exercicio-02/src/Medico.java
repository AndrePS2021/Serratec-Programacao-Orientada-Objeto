package Exercicio1;

public class Medico extends Plano {
	protected String nome;
	private int crm;

	public Medico(String empresa, String nome, int crm) {
		super(empresa);
		this.nome = nome;
		this.crm = crm;
	}

	@Override
	public double calcularPagamento() {
		return valorPago = super.calcularPagamento() * 1.10;
	}

	public String getNome() {
		return nome;
	}

	public int getCrm() {
		return crm;
	}

	@Override
	public String toString() {
		return super.toString() + " " + "Médico:" + " "+ nome;
	}

}

package exercicios;

public class Medico {
	private int crm;
	private String nome;
	private double salario;
	private double consulta;
	public static int TotalDeMedicos;
	
	public Medico() {
		TotalDeMedicos += 1;
	}
	
	public Medico(Integer crm, String nome, double salario, double consulta) {
		this();
		this.crm = crm;
		this.nome = nome;
		this.salario = salario;
		this.consulta = consulta;
	}
	
	public void pagamentoDinheiro() {
		this.salario += this.consulta;  
	}
	
	public void pagamentoPlano() {
		this.salario += this.consulta * 0.7;
	}

	public int getCrm() {
		return crm;
	}

	public void setCrm(int crm) {
		this.crm = crm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getConsulta() {
		return consulta;
	}

	public void setConsulta(double consulta) {
		this.consulta = consulta;
	}
}

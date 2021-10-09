package Exercicio1;

public class Atleta implements Olimpiadas {
	private String nome;
	private double peso;
	private String modalidade;
	private static int totalParticipantes;
	private Pais pais;

	public Atleta(String nome, double peso, Pais pais) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.pais = pais;
		totalParticipantes += 1;
	}

	public String getNome() {
		return nome;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public double getPeso() {
		return peso;
	} 

	public String getModalidade() {
		return modalidade;
	}

	public int getTotalParticipantes() {
		return totalParticipantes;
	}

	public Pais getPais() {
		return pais;
	}


	public String verificarSituacao() {
		if(this.peso > 90) {
			this.modalidade = "Peso Pesado"; 
		return "Participara";
		} else if (this.peso < 90 && this.peso > 60) {
			this.modalidade = "Peso Medio";
			return "Participará";
		} else {
			return "Não Participará";
		}
	}

	@Override
	public String toString() {
		return "Atleta:" + nome + ", Modalidade:" + modalidade + ", Pais:" + pais + ", Situacao:"
				+ verificarSituacao();
	}

	
	}
	
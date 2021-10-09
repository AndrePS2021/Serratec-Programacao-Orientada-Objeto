package ExercicioClassroom;

import java.util.List;

public class Aluno implements Comparable<Aluno> {
	private String nome;
	private double nota1;
	private double nota2;
	private double media;
	private List<Aluno> aluno;

	public String getNome() {
		return nome;
	}

	public double getMedia() {
		return media;
	}

	public double getNota1() {
		return nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public double calcularMedia() {
		if (nota1 > 10 || nota2 > 10 || nota1 < 0 || nota2 < 0) {
			try {
				return 0 / 0;
			} catch (Exception e) {
				System.out.println("Erro !! A nota não pode ser menor que zero e maior que dez!!");
			}
		} else {
			return media = (nota1 + nota2) / 2;
		}
		return 0;
	}

	public Aluno(String nome, double nota1, double nota2) {
		super();
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	@Override
	public String toString() {
		return String.format("Aluno:%s N1=%s N2=%s Média=%s", this.nome, this.nota1, this.nota2, this.media);

	}

	public List<Aluno> getAluno() {
		return aluno;
	}

	@Override
	public int compareTo(Aluno outroAluno) {
		if (this.media > outroAluno.getMedia()) {
			return -1;
		}
		if (this.media < outroAluno.getMedia()) {
			return 1;
		}
		return 0;
	}
}

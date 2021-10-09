package ExercicioClassroom;

import java.util.ArrayList;
import java.util.List;

public class Teste {
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("João", 9,10);
		Aluno a2 = new Aluno("José", 1,15);
		Aluno a3 = new Aluno("Karina", 6,8);
		
		a1.calcularMedia();
	    a2.calcularMedia();
	    a3.calcularMedia();
	    
	    List<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
			    
		System.out.println(alunos);
	     
	    }
	 }


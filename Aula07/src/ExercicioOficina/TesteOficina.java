package ExercicioOficina;

import java.time.LocalDate;

public class TesteOficina {
	public static void main(String[] args) {

//com desconto por ser no mes de agosto		
		Proprietario proprietario1 = new Proprietario("Luiz Guilherme");
		Veiculo veiculo1 = new Carro("Palio", LocalDate.of(2021, 8, 20), proprietario1, "Hatch");
		
//com desconto por ser no sabado fiz para testar		
		Proprietario proprietario2 = new Proprietario("Joao");
		Veiculo veiculo2 = new Carro("Siena", LocalDate.of(2021, 10, 2), proprietario1, "Sedan");

		veiculo1.trocaOleo();
		veiculo1.revisao();
		
		
		veiculo2.trocaOleo();
		veiculo2.revisao();


		System.out.println("Proprietario:" + proprietario1.getNome()+ " " + veiculo1.toString());
		
		System.out.println("Proprietario:" + proprietario2.getNome()+ " " + veiculo2.toString());

		
		
	}
}

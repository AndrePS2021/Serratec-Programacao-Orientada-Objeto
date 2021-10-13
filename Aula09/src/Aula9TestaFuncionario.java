package aula;

import java.text.NumberFormat;

public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario func[] = new Funcionario[2];
		func[0] = new Funcionario();
		func[0].setCargo("Gerente");
		func[0].setNome("Ricardo");
		func[0].setSalario(2500);

		func[1] = new Funcionario();
		func[1].setCargo("Secretaria");
		func[1].setNome("Joana");
		func[1].setSalario(1500);

		for (int i = 0; i < func.length; i++) {
			System.out.println(func[i].toString());
			System.out.println("Salario com abono:" + NumberFormat.getCurrencyInstance().format(func[i].abonoSalario(100)));
		}

	}
}

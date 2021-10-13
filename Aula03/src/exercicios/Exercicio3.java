package exercicios;

public class Exercicio3 {
	public void Executar() {
		Medico medico1 = new Medico(12345, "Ana Maria", 0, 250);
		Medico medico2 = new Medico(456789, "Antônio", 0, 300);
		
		medico1.pagamentoDinheiro();
		medico2.pagamentoDinheiro();
		
		medico1.pagamentoPlano();
		medico2.pagamentoPlano();
		
		MostrarMedico(medico1);
		MostrarMedico(medico2);
		
		System.out.println(Medico.TotalDeMedicos);
	}
	
	private void MostrarMedico(Medico medico) {
		System.out.println(String.format(
				"Medico - Crm: %d, nome: %s, salario: %.2f, consulta: %.2f", 
				medico.getCrm(), medico.getNome(), medico.getSalario(), medico.getConsulta()));
	}
}

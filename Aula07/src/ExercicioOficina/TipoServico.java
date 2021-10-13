package ExercicioOficina;

public enum TipoServico {
	OLEO(100), LAVAGEM(50), REVISAO(200);
	
	private TipoServico(double valorPorServico) {
		this.valorPorServico = valorPorServico;
	}
	private double valorPorServico;
	
	public double getValorPorServico() {
		return valorPorServico;
	}

}

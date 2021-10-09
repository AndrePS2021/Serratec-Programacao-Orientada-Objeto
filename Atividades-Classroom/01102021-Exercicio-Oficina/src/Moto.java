package ExercicioOficina;

import java.time.LocalDate;

public final class Moto extends Veiculo {
	private int cilindradas;

	public Moto(String modelo, LocalDate dataConserto, Proprietario proprietario, int cilindradas) {
		super(modelo, dataConserto, proprietario);
		this.cilindradas = cilindradas;
	}

	@Override
	public double lavarVeiculo() {
		return valorCobrado = TipoServico.LAVAGEM.getValorPorServico();
	}

	@Override
	public double trocaOleo() {
		return valorCobrado = TipoServico.OLEO.getValorPorServico();
	}

	@Override
	public double revisao() {
		return valorCobrado = TipoServico.REVISAO.getValorPorServico();
	}

	public int getCilindradas() {
		return cilindradas;
	}

}

package ExercicioOficina;

import java.time.LocalDate;

public final class Carro extends Veiculo {
	private String categoria;

	public Carro(String modelo, LocalDate dataConserto, Proprietario proprietario, String categoria) {
		super(modelo, dataConserto, proprietario);
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	@Override
	public double lavarVeiculo() {
		return valorCobrado = TipoServico.LAVAGEM.getValorPorServico();
	}

	@Override
	public double trocaOleo() {
		if (dataConserto.getDayOfWeek().name().equals("SATURDAY")) {
			valorCobrado = valorCobrado + TipoServico.OLEO.getValorPorServico() - 50;
		} else {
			valorCobrado = valorCobrado + TipoServico.OLEO.getValorPorServico();
		}
		return valorCobrado;
	}

	@Override
	public double revisao() {
		if (dataConserto.getMonthValue() == 8) {
			valorCobrado = valorCobrado + TipoServico.REVISAO.getValorPorServico() * 0.90;
		} else {
			valorCobrado = valorCobrado + TipoServico.REVISAO.getValorPorServico();
		}
		return valorCobrado;
	}
	

}

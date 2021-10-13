package Narnia;

public class CarroPasseio extends Veiculo {

	@Override
	public String toString() {
		return String.format("Carro - ipva: %.2f", 
				super.getIpva());
	}
}

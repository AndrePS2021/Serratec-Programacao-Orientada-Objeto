package Narnia;

public class Program {

	public static void main(String[] args) {
		
		CarroPasseio carro = new CarroPasseio();
		Caminhao caminhao = new Caminhao();
		
		// Polimorfismo
		MostrarIpva(carro);
		MostrarIpva(caminhao);
	} 
	
	// Polimorfismo - Veiculo veiculo
	public static void MostrarIpva(Veiculo veiculo) {
		System.out.println(veiculo.getIpva());
	}

}

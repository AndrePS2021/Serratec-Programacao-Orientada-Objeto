package Exercicio3;

public class Program {
	public static void main(String[] args) {

		Estado estado1 = new Estado("São Paulo", "SP");
		Cidade cidade1 = new Cidade("Atibaia", estado1);
		Endereco endereco1 = new Endereco("Rua dos Sabias 230", "Jd Pinheiros", "12945-840", cidade1);
		Telefone telefone1 = new Telefone("2534-3215");
		Telefone telefone2 = new Telefone("6423-3652");

		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone1;
		telefones[1] = telefone2;

		Contato contato1 = new Contato("Luiz Guilherme", endereco1);
		contato1.setTelefones(telefones);

		System.out.println("Nome:" + contato1.getNome() + "\n" + contato1.getEndereco().getRua() + " "
				+ contato1.getEndereco().getBairro() + " " + contato1.getEndereco().getCidade().getNomeCidade() + "\n"
				+ contato1.getEndereco().getCidade().getEstado().getNomeEstado() + " " 
				+ contato1.getEndereco().getCidade().getEstado().getSigla() + " " + "Cep:" + contato1.getEndereco().getCep());
		contato1.mostrarTelefones();

	}
}

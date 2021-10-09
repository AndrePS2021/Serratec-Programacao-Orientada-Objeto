package ExercicioMercado;

import java.text.NumberFormat;

public class Program {
	public static void main(String[] args) {
		Produto produto1 = new BebidaAlcoolica("Cerveja", 12, "6%");
		Produto produto2 = new BebidaAlcoolica("Vinho", 150, "13.5%");
		Produto produto3 = new Eletrodomestico("Tv", 2000, "Bivolt");
		Produto produto4 = new Eletrodomestico("Geladeira", 2352.64, "Bivolt");
		Produto produto5 = new Eletrodomestico("Radio", 837.59, "Bivolt");

		produto1.Vender(5);
		produto2.Vender(3);
		produto3.Vender(9);
		produto4.Vender(3);
		produto5.Vender(1);

		Total t = new Total();
		t.calcularTotal(produto1);
		t.calcularTotal(produto2);
		t.calcularTotal(produto3);
		t.calcularTotal(produto4);
		t.calcularTotal(produto5);

		System.out.println(produto1.toString() + "\n" + produto2.toString() + "\n" + produto3.toString() + "\n"
				+ produto4.toString() + "\n" + produto5.toString());

		System.out.println("Valor Total dos Produtos:" + " " + NumberFormat.getCurrencyInstance().format(t.getTotal()));

	}
}

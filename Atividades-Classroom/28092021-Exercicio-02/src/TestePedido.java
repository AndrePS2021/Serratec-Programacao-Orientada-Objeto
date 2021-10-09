package exercicio2;

import java.time.LocalDate;

public class TestePedido {
public void Executar() {
	LocalDate data = LocalDate.now();
	Pedido pedido1 = new Pedido(1, data, 2, 50.00);
	Pedido pedido2 = new Pedido(2, LocalDate.of(2021, 10, 3), 3, 20.00);
	
	pedido1.finalizar();
	pedido2.finalizar();
	
	System.out.println(pedido1.getTotal());
	System.out.println(pedido2.getTotal());
}
}

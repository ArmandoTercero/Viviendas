package ParcialViviendas.ParcialViviendas;

import java.util.Date;
import java.util.List;

public class Prueba {

	public static void main(String[] args) {

		Sistema sistema = new Sistema();
		
		Cliente cliente = sistema.agregarCliente("A", "B");
		Servicio limpieza = sistema.servicioDeLimpieza(1, 1, 1);
		Unico contratoUnico = sistema.contratoUnico(cliente, new Date(), limpieza);
		
		Cliente cliente2 = sistema.agregarCliente("C", "D");
		
		Cliente cliente3 = sistema.agregarCliente("E", "F");
		
		System.out.println("Prueba . . .");
		System.out.println(contratoUnico.contieneCliente(cliente));
		List<Contrato> lista = sistema.contratosDeCliente(cliente);
		
		
	}

}

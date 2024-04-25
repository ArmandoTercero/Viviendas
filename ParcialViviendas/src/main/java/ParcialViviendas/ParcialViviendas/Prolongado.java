package ParcialViviendas.ParcialViviendas;

import java.util.Date;

public class Prolongado extends Contrato {
	public int cantidadDeDias;
	
	public Prolongado(Cliente cliente, Date fecha, Servicio servicio, int cantidadDeDias) {
		super(cliente, fecha, servicio);
		this.cantidadDeDias = cantidadDeDias;
	}

}

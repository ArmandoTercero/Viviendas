package ParcialViviendas.ParcialViviendas;

import java.util.Date;

public class Unico extends Contrato {

	public Unico(Cliente cliente, Date fecha, Servicio servicio) {
		super(cliente, fecha, servicio);
	}

	public double monto() {
		if (!this.finde()) {
			return this.getServicio().monto(); 
		} else {
			return this.getServicio().monto() * 1.15;
		}
	}
}

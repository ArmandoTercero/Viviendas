package ParcialViviendas.ParcialViviendas;

import java.time.DayOfWeek;
import java.util.Date;

public abstract class Contrato {
	private Cliente cliente;
	private Date fecha;
	private Servicio servicio;
	
	public Contrato (Cliente cliente, Date fecha, Servicio servicio) {
		this.cliente = cliente;
		this.fecha = fecha;
		this.servicio = servicio;
	}
	
	public boolean contieneCliente(Cliente unCliente) {
		return this.cliente.equals(unCliente);
	}
	
	public Servicio getServicio() {
		return this.servicio;
	}
	
	public boolean finde() {
		int dia = this.fecha.getDay();
        return dia == 0 || dia == 6;
	}
	
	public abstract double monto();
}

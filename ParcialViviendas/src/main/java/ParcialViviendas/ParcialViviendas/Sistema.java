package ParcialViviendas.ParcialViviendas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Sistema {
	private List<Cliente> clientes;
	private List<Servicio> servicios;
	private List<Contrato> contratos;
	
	public Sistema() {
		this.clientes = new ArrayList<Cliente>();
		this.servicios = new ArrayList<Servicio>();
		this.contratos = new ArrayList<Contrato>();
	}
	
	public Cliente agregarCliente(String nombre, String direccion) {
		Cliente c = new Cliente(nombre, direccion);
		this.clientes.add(c);
		return c;
	}
	
	public Limpieza servicioDeLimpieza(double precioPorHora, int cantidadDeHoras, double tarifaMinima) {
		Limpieza l = new Limpieza(precioPorHora, cantidadDeHoras, tarifaMinima);
		this.servicios.add(l);
		return l;
	}
	
	public Parquizacion servicioDeParquizacion(double precioPorHora, int cantidadDeHoras, int maquinasUtilizadas, double costoDeMantenimiento) {
		Parquizacion p = new Parquizacion(precioPorHora, cantidadDeHoras, maquinasUtilizadas, costoDeMantenimiento);
		this.servicios.add(p);
		return p;
	}
	
	public Unico contratoUnico(Cliente c, Date fecha, Servicio s) {
		Unico u = new Unico(c, fecha, s);
		this.contratos.add(u);
		return u;
	}
	
	public Prolongado contratoProlongado(Cliente c, Date fecha, Servicio s, int dias) {
		Prolongado p = new Prolongado(c, fecha, s, dias);
		this.contratos.add(p);
		return p;
	}
	
	public List<Contrato> contratosDeCliente(Cliente c) {
		return this.contratos.stream()
				.filter(contrato -> contrato.contieneCliente(c))
				.collect(Collectors.toList());
	}
}

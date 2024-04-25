package ParcialViviendas.ParcialViviendas;

public class Parquizacion extends Servicio {
	private int maquinasUtilizadas;
	private double costoDeMantenimiento;

	public Parquizacion(double precioPorHora, int cantidadDeHoras, int maquinasUtilizadas, double costoDeMantenimiento) {
		super(precioPorHora, cantidadDeHoras);
		this.maquinasUtilizadas = maquinasUtilizadas;
		this.costoDeMantenimiento = costoDeMantenimiento;
	}
	
	public double monto() {
		double total = this.getPrecioPorHora() * this.getCantidadDeHoras();
		return total + (this.costoDeMantenimiento * this.maquinasUtilizadas);
	}
}

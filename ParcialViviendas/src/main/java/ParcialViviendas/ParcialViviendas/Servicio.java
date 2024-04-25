package ParcialViviendas.ParcialViviendas;

public abstract class Servicio {
	private double precioPorHora;
	public int cantidadDeHoras;
	
	public double getPrecioPorHora() {
		return precioPorHora;
	}
	
	public int getCantidadDeHoras() {
		return cantidadDeHoras;
	}
	
	public Servicio(double precioPorHora, int cantidadDeHoras) {
		this.precioPorHora = precioPorHora;
		this.cantidadDeHoras = cantidadDeHoras;
	}
	
	public abstract double monto();
	
	public boolean montoMayorQue(double unMonto) {
		return this.monto() > unMonto; 
	}

}

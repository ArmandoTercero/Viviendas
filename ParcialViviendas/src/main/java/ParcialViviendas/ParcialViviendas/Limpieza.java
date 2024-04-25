package ParcialViviendas.ParcialViviendas;

public class Limpieza extends Servicio {
	public double tarifaMinima;
	
	public Limpieza(double precioPorHora, int cantidadDeHoras, double tarifaMinima) {
		super(precioPorHora, cantidadDeHoras);
		this.tarifaMinima = tarifaMinima;
	}
	
	public double monto() {
		double total = this.getPrecioPorHora() * this.getCantidadDeHoras();
		if (total > this.tarifaMinima) {
			return total;
		} else {
			return this.tarifaMinima;
		}
	}

}

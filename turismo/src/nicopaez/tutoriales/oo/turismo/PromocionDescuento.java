package nicopaez.tutoriales.oo.turismo;

import java.util.List;

public class PromocionDescuento extends Promocion{

	private int descuento;

	public PromocionDescuento(int descuento, List<Atraccion> atracciones) {
		this.descuento =  descuento;
		this.atracciones = atracciones;
	}
	
	public int getCosto() {
		int total = 0;
		for (Atraccion atraccion : this.atracciones) {
			total += atraccion.getCosto();
		}
		return total - this.descuento;
	}
	

}

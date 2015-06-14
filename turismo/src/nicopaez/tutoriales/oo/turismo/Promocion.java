package nicopaez.tutoriales.oo.turismo;

import java.util.List;

public abstract class Promocion {

	protected List<Atraccion> atracciones;

	public abstract int getCosto();

	public List<Atraccion> getAtracciones() {
		return this.atracciones;
	}
	
}

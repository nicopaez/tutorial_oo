package nicopaez.tutoriales.oo.turismo;

import java.util.ArrayList;
import java.util.List;

public class Sugerencia {

	protected List<Atraccion> atracciones = new ArrayList<Atraccion>();
	protected int puntuacionUsuario;
	
	public int getTiempoRequerido(int velocidad) {
		int total = 0;
		for(Atraccion atraccion : this.atracciones) {
			total += atraccion.getTiempoDeVisita();
		}
		/* este metodo esta simplificado, faltaria que tambien calculase el tiempo
		 * requerido para desplazamiento entre las atracciones */
		return total;
	}

	public void agregarAtraccion(Atraccion atraccion) {
		this.atracciones.add(atraccion);
	}

	public List<Atraccion> getAtracciones() {
		return this.atracciones;
	}

	public int getPuntuacionUsuario() {
		return this.puntuacionUsuario;
	}

	public void setPuntuacionUsuario(int puntuacion) {
		this.puntuacionUsuario = puntuacion;
	}

	public int getPresupuestoRequerido() {
		int total = 0;
		for(Atraccion atraccion : this.atracciones) {
			total += atraccion.getCosto();
		}
		return total;
	}

	public boolean incluyeTipoAtraccion(TipoAtraccion preferenciaTipoAtraccion) {
		for(Atraccion atraccion : this.atracciones) {
			if (atraccion.esTipo(preferenciaTipoAtraccion)) {
				return true;
			}
		}
		return false;
	}

	public Sugerencia clonar() {
		Sugerencia copia = new Sugerencia();
		copia.getAtracciones().addAll(this.getAtracciones());
		return copia;
	}

}

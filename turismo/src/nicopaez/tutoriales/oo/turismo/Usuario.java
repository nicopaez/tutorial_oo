package nicopaez.tutoriales.oo.turismo;

public class Usuario {

	
	private int tiempoDisponible;
	private int presupuestoDisponible;
	private TipoAtraccion preferenciaTipoAtraccion;
	private int velocidad;

	public void setTiempoDisponible(int tiempo) {
		this.tiempoDisponible = tiempo;
	}

	public int getTiempoDisponible() {
		return this.tiempoDisponible;
	}

	public void puntuarSugerencia(Sugerencia sugerencia) {
		
		/* esto esta simplicaficado, pues falta considerar el tiempo de translado */
		if (sugerencia.getTiempoRequerido(this.velocidad) > this.tiempoDisponible) {
			sugerencia.setPuntuacionUsuario(0);
			return;
		}
		
		if (sugerencia.getPresupuestoRequerido() > this.presupuestoDisponible) {
			sugerencia.setPuntuacionUsuario(0);
			return;
		}
		
		if (!sugerencia.incluyeTipoAtraccion(this.preferenciaTipoAtraccion)) {
			sugerencia.setPuntuacionUsuario(0);
			return;
		}
		/*aqui se podria agregar alguna logica para ponderar la oferta en base algun criterio especifico
		 * por el momento la pondera en base a la cantidad de atracciones que incluye */
		sugerencia.setPuntuacionUsuario(sugerencia.getAtracciones().size());
	}

	public void setPresupuestoDisponible(int presupuestoDisponible) {
		this.presupuestoDisponible = presupuestoDisponible;
	}

	public void setPrefenciaTipoAtraccion(TipoAtraccion tipo) {
		this.preferenciaTipoAtraccion = tipo;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

}

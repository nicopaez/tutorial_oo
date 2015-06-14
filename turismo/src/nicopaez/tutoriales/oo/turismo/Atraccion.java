package nicopaez.tutoriales.oo.turismo;

public class Atraccion {

	private int tiempoDeVisita;
	private int costo;
	private TipoAtraccion tipoAtraccion;
	private Coordenadas coordenadas;

	public Atraccion(int tiempoRequeridoDeVisita, int costo, TipoAtraccion tipo) {
		this.tiempoDeVisita = tiempoRequeridoDeVisita;
		this.costo = costo;
		this.tipoAtraccion = tipo;
	}

	public Atraccion(int tiempoRequerido, int costo, TipoAtraccion tipo,
			Coordenadas coordenadas) {
		this.tiempoDeVisita = tiempoRequerido;
		this.costo = costo;
		this.tipoAtraccion = tipo;
		this.coordenadas = coordenadas;
	}

	public int getTiempoDeVisita() {
		return this.tiempoDeVisita;
	}

	public int getCosto() {
		return this.costo;
	}

	public boolean esTipo(TipoAtraccion unTipoDeAtraccion) {
		return this.tipoAtraccion.equals(unTipoDeAtraccion);
	}

	public double distanciaA(Atraccion atraccion2) {
		return this.coordenadas.diff(atraccion2.coordenadas);
	}

}

package nicopaez.tutoriales.oo.turismo;

public class Coordenadas {

	private double x;
	private double y;

	public Coordenadas(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double diff(Coordenadas coordenadas) {
		double dx = this.x - coordenadas.x;
		double dy = this.y - coordenadas.x;
		
		return Math.sqrt( (dx * dx) + (dy * dy));
	}

	public boolean equals(Object other) {
		  if ( this == other ) return true;
		  if ( !(other instanceof Coordenadas) ) return false;
		  Coordenadas coord = (Coordenadas)other;
		  return this.x == coord.x && this.y == coord.y;
	}
}

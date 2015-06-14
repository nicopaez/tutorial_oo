package nicopaez.tutoriales.oo.turismo;

public class SugerenciaPromocional extends Sugerencia {

	protected Promocion promocion;

	public SugerenciaPromocional(Promocion promocion) {
		this.promocion = promocion;
		this.atracciones = promocion.getAtracciones();
	}
	
	public int getPresupuestoRequerido() {
		return this.promocion.getCosto();
	}


}

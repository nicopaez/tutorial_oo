package nicopaez.tutoriales.oo.turismo;

import java.util.ArrayList;
import java.util.List;

public class Agente {

	public List<Sugerencia> generarSurgerenciasParaUsuario(Usuario usuario,
			List<Atraccion> atraccionesDisponbles, List<Promocion> promocionesVigentes) {
		
		List<Sugerencia> sugerencias = new ArrayList<Sugerencia>();
		
		Sugerencia sugerencia =  new Sugerencia();
		for (Atraccion atraccion : atraccionesDisponbles) {
			sugerencia.agregarAtraccion(atraccion);
			usuario.puntuarSugerencia(sugerencia);
			if (sugerencia.getPuntuacionUsuario() > 0) {
				sugerencias.add(sugerencia);
				sugerencia = sugerencia.clonar();
			}
		}
		
		for (Promocion promocion : promocionesVigentes) {
			sugerencia = new SugerenciaPromocional(promocion);
			usuario.puntuarSugerencia(sugerencia);
			if (sugerencia.getPuntuacionUsuario() > 0) {
				sugerencias.add(sugerencia);
			}
		}
		
		return sugerencias;
	}

}

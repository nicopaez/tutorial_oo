package nicopaez.tutoriales.oo.turismo;;

import nicopaez.tutoriales.oo.turismo.Atraccion;
import nicopaez.tutoriales.oo.turismo.Sugerencia;
import nicopaez.tutoriales.oo.turismo.TipoAtraccion;
import nicopaez.tutoriales.oo.turismo.Usuario;
import org.junit.Assert;
import org.junit.Test;

public class UsuarioTest {


	@Test
	public void puntuarSugerenciaDeberiaSetearMayorACeroContemplaTipoPresupuestoTiempo() {
		Usuario usuario = new Usuario();
		usuario.setTiempoDisponible(50);
		usuario.setPrefenciaTipoAtraccion(TipoAtraccion.PAISAJE);
		usuario.setPresupuestoDisponible(50);
		Sugerencia sugerencia = new Sugerencia();
		int tiempoRequeridoDeVisita = 5;
		int costo = 5;
		sugerencia.agregarAtraccion(new Atraccion(tiempoRequeridoDeVisita, costo, TipoAtraccion.PAISAJE));
		sugerencia.agregarAtraccion(new Atraccion(tiempoRequeridoDeVisita, costo, TipoAtraccion.PAISAJE));
		
		usuario.puntuarSugerencia(sugerencia);
		
		Assert.assertTrue(sugerencia.getPuntuacionUsuario() > 0);
	}
	
	@Test
	public void puntuarSugerenciaDeberiaSetearCeroSiSuperaTiempoDisponible() {
		Usuario usuario = new Usuario();
		usuario.setTiempoDisponible(5);
		usuario.setPresupuestoDisponible(Integer.MAX_VALUE);
		usuario.setPrefenciaTipoAtraccion(TipoAtraccion.PAISAJE);
		Sugerencia sugerencia = new Sugerencia();
		int tiempoRequeridoDeVisita = 5;
		int costo = 10;
		sugerencia.agregarAtraccion(new Atraccion(tiempoRequeridoDeVisita, costo, TipoAtraccion.PAISAJE));
		sugerencia.agregarAtraccion(new Atraccion(tiempoRequeridoDeVisita, costo, TipoAtraccion.PAISAJE));
		
		usuario.puntuarSugerencia(sugerencia);
		
		Assert.assertEquals(0, sugerencia.getPuntuacionUsuario());
	}

	@Test
	public void puntuarSugerenciaDeberiaSetearCeroSiSuperaPresupuestoDisponible() {
		Usuario usuario = new Usuario();
		usuario.setTiempoDisponible(Integer.MAX_VALUE);
		usuario.setPrefenciaTipoAtraccion(TipoAtraccion.PAISAJE);
		usuario.setPresupuestoDisponible(5);
		Sugerencia sugerencia = new Sugerencia();
		int tiempoRequeridoDeVisita = 5;
		int costo = 5;
		sugerencia.agregarAtraccion(new Atraccion(tiempoRequeridoDeVisita, costo, TipoAtraccion.PAISAJE));
		sugerencia.agregarAtraccion(new Atraccion(tiempoRequeridoDeVisita, costo, TipoAtraccion.PAISAJE));
		
		usuario.puntuarSugerencia(sugerencia);
		
		Assert.assertEquals(0, sugerencia.getPuntuacionUsuario());
	}
	
	@Test
	public void puntuarSugerenciaDeberiaSetearCeroSinoContemplaTipoPreferido() {
		Usuario usuario = new Usuario();
		usuario.setTiempoDisponible(Integer.MAX_VALUE);
		usuario.setPrefenciaTipoAtraccion(TipoAtraccion.AVENTURA);
		usuario.setPresupuestoDisponible(Integer.MAX_VALUE);
		Sugerencia sugerencia = new Sugerencia();
		int tiempoRequeridoDeVisita = 5;
		int costo = 5;
		sugerencia.agregarAtraccion(new Atraccion(tiempoRequeridoDeVisita, costo, TipoAtraccion.PAISAJE));
		sugerencia.agregarAtraccion(new Atraccion(tiempoRequeridoDeVisita, costo, TipoAtraccion.PAISAJE));
		
		usuario.puntuarSugerencia(sugerencia);
		
		Assert.assertEquals(0, sugerencia.getPuntuacionUsuario());
	}

}

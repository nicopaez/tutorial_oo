package nicopaez.tutoriales.oo.turismo;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class AgenteTest {


	@Test
	public void generarSugerenciasDeberiaIncluirSugerenciasPuntuadasPositivamente() {
		Usuario usuario = crearUsuario();
		List<Atraccion> atraccionesDisponbles = crearAtracciones(10);
		List<Promocion> promociones = crearPromociones(5);
		Agente agente = new Agente();
		List<Sugerencia> sugerencias = agente.generarSurgerenciasParaUsuario(usuario, atraccionesDisponbles, promociones);
		
		Assert.assertTrue(sugerencias.size() > 0);
		
		for (Sugerencia sugerencia : sugerencias) {
			Assert.assertTrue(sugerencia.getPuntuacionUsuario() > 0);
		}
		
	}
	
	@Test
	public void generarSugerenciasDeberiaIncluirSugerenciasPromocionalesPuntuadasPositivamente() {
		Usuario usuario = crearUsuario();
		List<Atraccion> atraccionesDisponbles = crearAtracciones(0);
		List<Promocion> promociones = crearPromociones(5);
		Agente agente = new Agente();
		List<Sugerencia> sugerencias = agente.generarSurgerenciasParaUsuario(usuario, atraccionesDisponbles, promociones);
		
		Assert.assertTrue(sugerencias.size() > 0);
		
		for (Sugerencia sugerencia : sugerencias) {
			Assert.assertTrue(sugerencia.getPuntuacionUsuario() > 0);
		}
		
	}
	
	private List<Promocion> crearPromociones(int cantidad) {
		List<Promocion> promociones = new ArrayList<Promocion>();
		for (int i = 0; i < cantidad; i++) {
			int descuento = 10  + i;
			PromocionDescuento promocion = new PromocionDescuento(descuento, crearAtracciones(i+1));
			promociones.add(promocion);
		}
		
		return promociones;
	}

	private List<Atraccion> crearAtracciones(int cantidad) {
		List<Atraccion> atracciones = new ArrayList<Atraccion>();
		int tiempoRequeridoDeVisita = 10;
		int costo = 1;
		for(int i = 0; i < cantidad; i++) {
			atracciones.add(new Atraccion(tiempoRequeridoDeVisita, costo, TipoAtraccion.PAISAJE));
		}
		return atracciones;
	}

	private Usuario crearUsuario() {
		Usuario usuario = new Usuario();
		usuario.setTiempoDisponible(Integer.MAX_VALUE);
		usuario.setPrefenciaTipoAtraccion(TipoAtraccion.PAISAJE);
		usuario.setPresupuestoDisponible(5);
		return usuario;
	}

	@Test
	public void generarSugerenciasDeberiaDevolverVacioSinoHayAtracciones() {
		Usuario usuario = crearUsuario();
		List<Atraccion> atraccionesDisponbles = new ArrayList<Atraccion>();
		List<Promocion> promociones = new ArrayList<Promocion>();
		Agente agente = new Agente();
		List<Sugerencia> sugerencias = agente.generarSurgerenciasParaUsuario(usuario, atraccionesDisponbles, promociones);
		
		Assert.assertEquals(0, sugerencias.size());
		
	}

}

package nicopaez.tutoriales.oo.turismo;;

import nicopaez.tutoriales.oo.turismo.Atraccion;
import nicopaez.tutoriales.oo.turismo.Coordenadas;
import nicopaez.tutoriales.oo.turismo.Sugerencia;
import nicopaez.tutoriales.oo.turismo.TipoAtraccion;
import org.junit.Assert;
import org.junit.Test;


public class SugerenciaTest {

	@Test
	public void tiempoRequeridoDeberiaSerCeroSinoTieneAtracciones() {
		Sugerencia sugerencia = new Sugerencia();
		int velocidadDeDesplazamiento = 1;
		Assert.assertEquals(0, sugerencia.getTiempoRequerido(velocidadDeDesplazamiento));
	}

	@Test
	public void tiempoRequeridoDeberiaSerLaSumaDelTiempoDeAtraccionesMasDesplazamiento() {
		Sugerencia sugerencia = new Sugerencia();
		int tiempoRequerido = 3;
		int costo = 1;
		sugerencia.agregarAtraccion(new Atraccion(tiempoRequerido, costo, null, new Coordenadas(1,0)));
		sugerencia.agregarAtraccion(new Atraccion(tiempoRequerido, costo, null, new Coordenadas(2,0)));
		int velocidadDeDesplazamiento = 1;
		Assert.assertEquals(6, sugerencia.getTiempoRequerido(velocidadDeDesplazamiento));
	}
	
	@Test
	public void clonarDeberiaCrearUnaCopia() {
		Sugerencia sugerencia = new Sugerencia();
		sugerencia.agregarAtraccion(new Atraccion(1, 1, null));
		
		Sugerencia copia = sugerencia.clonar();
		
		Assert.assertFalse(sugerencia.equals(copia));
	}


	@Test
	public void clonarDeberiaCrearUnaCopiaConLasMismaAtracciones() {
		Sugerencia sugerencia = new Sugerencia();
		sugerencia.agregarAtraccion(new Atraccion(1, 1, null));
		
		Sugerencia copia = sugerencia.clonar();
		
		Assert.assertNotSame(sugerencia.getAtracciones(), copia.getAtracciones());
		
		for (Atraccion atraccion : sugerencia.getAtracciones()) {
			Assert.assertTrue(copia.getAtracciones().contains(atraccion));
		}
	}
	
	@Test
	public void incluyeTipoAtraccionDeberiaSerFalseSiNoIncluye() {
		Sugerencia sugerencia = new Sugerencia();
		int tiempoRequerido = 1;
		int costo = 5;
		sugerencia.agregarAtraccion(new Atraccion(tiempoRequerido, costo, TipoAtraccion.AVENTURA, new Coordenadas(1,0)));
		sugerencia.agregarAtraccion(new Atraccion(tiempoRequerido, costo, TipoAtraccion.AVENTURA, new Coordenadas(2,0)));
		Assert.assertFalse(sugerencia.incluyeTipoAtraccion(TipoAtraccion.PAISAJE));
	}
	
	@Test
	public void incluyeTipoAtraccionDeberiaSerTrueSiIncluye() {
		Sugerencia sugerencia = new Sugerencia();
		int tiempoRequerido = 1;
		int costo = 5;
		sugerencia.agregarAtraccion(new Atraccion(tiempoRequerido, costo, TipoAtraccion.AVENTURA, new Coordenadas(1,0)));
		sugerencia.agregarAtraccion(new Atraccion(tiempoRequerido, costo, TipoAtraccion.AVENTURA, new Coordenadas(2,0)));
		Assert.assertTrue(sugerencia.incluyeTipoAtraccion(TipoAtraccion.AVENTURA));
	}

}

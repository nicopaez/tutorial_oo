package nicopaez.tutoriales.oo.turismo;


import nicopaez.tutoriales.oo.turismo.Atraccion;
import nicopaez.tutoriales.oo.turismo.Coordenadas;
import org.junit.Assert;
import org.junit.Test;

public class AtraccionTest {

	@Test
	public void distanciaDeberiaDevolverLaDiferenciaEntreCoordinadas() {
		Atraccion atraccion1 = new Atraccion(1, 1, null, new Coordenadas(0,0));
		Atraccion atraccion2 = new Atraccion(1, 1, null, new Coordenadas(1,1));
		
		Assert.assertEquals(Math.sqrt(2),atraccion1.distanciaA(atraccion2), 0.01 );
	}

}

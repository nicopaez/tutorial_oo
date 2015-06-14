package nicopaez.tutoriales.oo.turismo;;

import nicopaez.tutoriales.oo.turismo.Coordenadas;
import org.junit.Assert;
import org.junit.Test;

public class CoordenadasTest {

	@Test
	public void equalDeberiaSerTrueParaMismosValores() {
		Coordenadas coord1 = new Coordenadas(1, 1);
		Coordenadas coord2 = new Coordenadas(1, 1);
		
		Assert.assertTrue(coord1.equals(coord2));
	}

	@Test
	public void equalDeberiaSerFalseParaDistintosValores() {
		Coordenadas coord1 = new Coordenadas(1, 1);
		Coordenadas coord2 = new Coordenadas(1, 2);
		
		Assert.assertFalse(coord1.equals(coord2));
	}
}

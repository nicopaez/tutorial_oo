package nicopaez.tutoriales.oo.votaciones;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nicopaez on 6/13/15.
 */
public class VotoTest {

    @Test
    public void deberiaAgregarseALaProvincia(){
        Partido partido = new Partido("K");
        Candidato candidatoNestor = new Candidato("Nestor", partido);
        Provincia santaCruz = new Provincia("SantaCruz");
        Voto unVoto = new Voto(candidatoNestor, santaCruz);

        Assert.assertEquals(1, santaCruz.votosTotales());


    }
}

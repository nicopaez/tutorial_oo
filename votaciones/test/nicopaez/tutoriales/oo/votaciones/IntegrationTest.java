package nicopaez.tutoriales.oo.votaciones;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nicopaez on 6/13/15.
 */
public class IntegrationTest {

    @Test
    public void siHayUnicoCandidatoDeberiaSerGanador() {
        Partido partido = new Partido("K");
        Candidato candidatoNestor = new Candidato("Nestor", partido);
        Provincia santaCruz = new Provincia("SantaCruz");
        Voto unVoto = new Voto(candidatoNestor, santaCruz);
        JuntaElectoral junta = new JuntaElectoral();
        junta.agregarPartido(partido);
        junta.agregarCandidato(candidatoNestor);
        junta.agregarProvincia(santaCruz);


        Candidato candidatoGanador = junta.obtenerCandidatoGanadorEn(santaCruz);

        Assert.assertEquals(candidatoGanador, candidatoNestor);
    }
}

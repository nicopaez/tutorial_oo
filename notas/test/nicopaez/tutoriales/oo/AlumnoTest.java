package nicopaez.tutoriales.oo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nicopaez on 6/13/15.
 */
public class AlumnoTest {

    @Test
    public void aproboTPEsFalsoSiNoEntregoSolucion(){
        Materia materia = new Materia("aydoo");
        TrabajoObligatorio trabajo1 = new TrabajoObligatorio("TP1", materia);
        Alumno juan = new Alumno("juan");

        Assert.assertFalse(juan.aproboTP(trabajo1));
    }

    @Test
    public void aproboTPEsVerdaderoSiAproboSolucion(){
        Materia materia = new Materia("aydoo");
        TrabajoObligatorio trabajo1 = new TrabajoObligatorio("TP1", materia);

        Alumno juan = new Alumno("juan");
        Solucion solucionDeJuan = new Solucion(juan, trabajo1);
        solucionDeJuan.setNota(4);

        Assert.assertTrue(juan.aproboTP(trabajo1));
    }
}

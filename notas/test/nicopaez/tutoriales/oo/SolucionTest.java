package nicopaez.tutoriales.oo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by nicopaez on 6/13/15.
 */
public class SolucionTest {

    private Materia materia;
    private Alumno alumno;
    private TrabajoObligatorio tp;

    @Before
    public void init(){
        this.materia = new Materia("Programacion 1");
        this.alumno = new Alumno("Juan");
        this.tp = new TrabajoObligatorio("TP1", materia);
    }

    @Test
    public void estaAprobadaSiNotaMayorIgual4(){
        Solucion solucion = new Solucion(alumno, tp);
        solucion.setNota(4);
        Assert.assertTrue(solucion.estaAprobada());
    }

    @Test
    public void noEstaAprobadaSiNotaMenor4(){
        Solucion solucion = new Solucion(alumno, tp);
        solucion.setNota(2);
        Assert.assertFalse(solucion.estaAprobada());
    }
}

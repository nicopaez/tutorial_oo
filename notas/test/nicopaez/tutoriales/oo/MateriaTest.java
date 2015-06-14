package nicopaez.tutoriales.oo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nicopaez on 6/13/15.
 */
public class MateriaTest {

    @Test
    public void alumnoAprobadoSiTPObligatorioAprobados() {
        Alumno juan = new Alumno("juan");
        Materia materia = new Materia("aydoo");

        TrabajoPractico trabajo1 = new TrabajoObligatorio("TP1", materia);
        TrabajoPractico trabajo2 = new TrabajoObligatorio("TP2 es Opcional", materia);

        Solucion solucionDeJuan = new Solucion(juan, trabajo1);
        solucionDeJuan.setNota(4);

        Solucion solucion2DeJuan = new Solucion(juan, trabajo2);
        solucion2DeJuan.setNota(4);

        Assert.assertTrue(materia.estaAlumnoAprobado(juan));

    }

    @Test
    public void alumnoNoAprobadoSiTPObligatorioNoAprobado() {
        Alumno juan = new Alumno("juan");
        Materia materia = new Materia("aydoo");

        TrabajoPractico trabajo1 = new TrabajoObligatorio("TP1", materia);
        TrabajoPractico trabajo2 = new TrabajoObligatorio("TP2 es Opcional", materia);

        Solucion solucionDeJuan = new Solucion(juan, trabajo1);
        solucionDeJuan.setNota(4);

        Solucion solucion2DeJuan = new Solucion(juan, trabajo2);
        solucion2DeJuan.setNota(2);

        Assert.assertFalse(materia.estaAlumnoAprobado(juan));

    }

    @Test
    public void alumnoAprobadoAunConTPOpcionalesNoAprobados() {
        Alumno juan = new Alumno("juan");
        Materia materia = new Materia("aydoo");

        TrabajoPractico trabajo1 = new TrabajoObligatorio("TP1", materia);
        TrabajoPractico trabajo2 = new TrabajoOpcional("TP2 es Opcional", materia);

        Solucion solucionDeJuan = new Solucion(juan, trabajo1);
        solucionDeJuan.setNota(4);

        Solucion solucion2DeJuan = new Solucion(juan, trabajo2);
        solucion2DeJuan.setNota(2);

        Assert.assertTrue(materia.estaAlumnoAprobado(juan));

    }
}

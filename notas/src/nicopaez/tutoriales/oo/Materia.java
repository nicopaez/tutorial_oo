package nicopaez.tutoriales.oo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nicopaez on 6/13/15.
 */
public class Materia {

    private final String nombre;
    private List<RequisitoParaAprobacion> requisitoParaAprobar;
    private List<TrabajoPractico> trabajosPracticos;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.trabajosPracticos = new ArrayList<TrabajoPractico>();
        this.requisitoParaAprobar = new ArrayList<RequisitoParaAprobacion>();
    }

    public boolean estaAlumnoAprobado(Alumno alumno) {

        for (RequisitoParaAprobacion requisito : requisitoParaAprobar) {
            if (!requisito.puedeAlumnoAprobar(alumno)) {
                return false;
            }
        }
        return true;
    }

    public void agregarRequisitoParaAprobar(RequisitoParaAprobacion requisito) {
        this.requisitoParaAprobar.add(requisito);
    }

    public void agregarTrabajoPractico(TrabajoPractico trabajo) {
        this.trabajosPracticos.add(trabajo);
    }
}

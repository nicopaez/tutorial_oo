package nicopaez.tutoriales.oo.notas;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nicopaez on 6/13/15.
 */
public class Alumno {

    private final String nombre;
    private List<Solucion> soluciones;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.soluciones = new ArrayList<Solucion>();

    }

    public boolean aproboTP(TrabajoPractico tp) {
        for (Solucion solucion : soluciones) {
            if (solucion.perteneceA(tp)) {
                if (solucion.estaAprobada()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void agregarSolucion(Solucion solucion) {
        this.soluciones.add(solucion);
    }
}

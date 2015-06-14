package nicopaez.tutoriales.oo;

/**
 * Created by nicopaez on 6/13/15.
 */
public abstract class TrabajoPractico {

    public TrabajoPractico(String nombre, Materia materia) {
        materia.agregarTrabajoPractico(this);
    }
    
}

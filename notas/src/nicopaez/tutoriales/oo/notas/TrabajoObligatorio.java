package nicopaez.tutoriales.oo.notas;

/**
 * Created by nicopaez on 6/13/15.
 */
public class TrabajoObligatorio extends TrabajoPractico implements RequisitoParaAprobacion{

    public TrabajoObligatorio(String nombre, Materia materia) {
        super(nombre, materia);
        materia.agregarRequisitoParaAprobar(this);
    }

    @Override
    public boolean puedeAlumnoAprobar(Alumno alumno) {
        return alumno.aproboTP(this);
    }

}
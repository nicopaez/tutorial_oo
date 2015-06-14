package nicopaez.tutoriales.oo.notas;

/**
 * Created by nicopaez on 6/13/15.
 */
public class Solucion {

    private final Alumno autor;
    private int nota;
    private TrabajoPractico trabajoPractico;

    public Solucion(Alumno autor, TrabajoPractico tp) {
        this.autor = autor;
        this.autor.agregarSolucion(this);
        this.trabajoPractico = tp;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public boolean estaAprobada() {
        return this.nota >= 4;
    }

    public boolean perteneceA(TrabajoPractico tp) {
        return this.trabajoPractico.equals(tp);
    }
}

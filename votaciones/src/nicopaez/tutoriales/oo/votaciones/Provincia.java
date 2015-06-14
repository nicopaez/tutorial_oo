package nicopaez.tutoriales.oo.votaciones;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nicopaez on 6/13/15.
 */
public class Provincia {
    private List<Voto> votos;

    public Provincia(String nombre) {
        votos = new ArrayList<Voto>();
    }

    public int votosTotales() {
        return votos.size();
    }

    public void registrarVoto(Voto voto) {
        votos.add(voto);
    }

    public List<Voto> getVotos() {
        return votos;
    }
}

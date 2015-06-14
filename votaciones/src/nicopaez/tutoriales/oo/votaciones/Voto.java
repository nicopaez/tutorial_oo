package nicopaez.tutoriales.oo.votaciones;

/**
 * Created by nicopaez on 6/13/15.
 */
public class Voto {
    private Candidato candidato;

    public Voto(Candidato candidato, Provincia provincia) {
        provincia.registrarVoto(this);
        this.candidato = candidato;
    }

    public Candidato getCandidato() {
        return candidato;
    }
}

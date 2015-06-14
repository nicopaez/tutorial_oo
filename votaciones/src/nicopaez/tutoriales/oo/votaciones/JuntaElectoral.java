package nicopaez.tutoriales.oo.votaciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by nicopaez on 6/13/15.
 */
public class JuntaElectoral {

    private List<Partido> partidos;
    private List<Candidato> candidatos;
    private List<Provincia> provincias;

    public JuntaElectoral() {
        partidos = new ArrayList<Partido>();
        candidatos = new ArrayList<Candidato>();
        provincias = new ArrayList<Provincia>();
    }
    public void agregarPartido(Partido partido) {
        partidos.add(partido);
    }

    public void agregarCandidato(Candidato candidato) {
        candidatos.add(candidato);
    }

    public void agregarProvincia(Provincia provincia) {
        provincias.add(provincia);
    }

    public Candidato obtenerCandidatoGanadorEn(Provincia provincia) {

        HashMap<Candidato, Integer> contadorDeVotos =  new HashMap<Candidato, Integer>();
        for(Voto v : provincia.getVotos()){
            Integer cantidad = contadorDeVotos.get(v.getCandidato());
            if (cantidad != null) {
                cantidad++;
            }
            else {
                cantidad = 1;
            }
            contadorDeVotos.put(v.getCandidato(), cantidad);
        }
        Candidato masVotado = this.candidatos.get(0);
        int cantidadMasVotado = contadorDeVotos.get(masVotado);
        for (Candidato c : this.candidatos) {
            int cantidad = contadorDeVotos.get(c);
            if (cantidad >= cantidadMasVotado) {
                masVotado = c;
                cantidadMasVotado = cantidad;
            }
        }
        return masVotado;
    }
}

package avparcial2paagrafo;

import java.util.ArrayList;

public class Grafo {

    private ArrayList<Aresta> arestas;
    
    public Grafo() {

        arestas = new ArrayList<>();
    }

    public void addArestas(Aresta aresta) {

        arestas.add(aresta);
    }

    public ArrayList<Aresta> listaDeArestas() {
        
        return arestas;
    }
}

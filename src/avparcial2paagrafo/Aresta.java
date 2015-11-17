package avparcial2paagrafo;

public class Aresta {

    Vertice vertice1, vertice2;

    public Aresta(String vertice1, String vertice2) {
        this.vertice1 = new Vertice(vertice1);
        this.vertice2 = new Vertice(vertice2);

    }

    public String getVertice1() {
        return vertice1.getVertice();
    }

    public String getVertice2() {
        return vertice2.getVertice();
    }
   
}

package avparcial2paagrafo;

public class Aresta {

    private Vertice v1, v2;

    public Aresta(String vertice1, String vertice2) {
        this.v1 = new Vertice(vertice1);
        this.v2 = new Vertice(vertice2);

    }

    public String getVertice1() {
        return v1.getVertice();
    }

    public String getVertice2() {
        return v2.getVertice();
    }
   
}

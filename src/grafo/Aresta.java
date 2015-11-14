package grafo;

public class Aresta {

    String verticeA, verticeB;

    public Aresta(String verticeA, String verticeB, int peso) {
        this.verticeA = verticeA;
        this.verticeB = verticeB;

    }

    public String getVerticeA() {
        return verticeA;
    }

    public String getVerticeB() {
        return verticeB;
    }

//public static void main(String[] args)
//    {
// List <Aresta> arestas = new ArrayList<Aresta>(); 
//
//
//        arestas.add(new Aresta("0", "1", 2)); 
//        arestas.add(new Aresta("0", "3", 1)); 
//        arestas.add(new Aresta("1", "2", 3)); 
//        arestas.add(new Aresta("2", "3", 5)); 
//        arestas.add(new Aresta("2", "4", 7)); 
//        arestas.add(new Aresta("3", "4", 6)); 
//        arestas.add(new Aresta("4", "5", 4));
//        arestas.add(new Aresta("4", "6", 8));
//
//}
}

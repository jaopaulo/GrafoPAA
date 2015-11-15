package avparcial2paagrafo;

import java.util.ArrayList;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList <Aresta> Grafo; 
        Grafo = new ArrayList<>();

        Grafo.add(new Aresta("A", "B")); 
        Grafo.add(new Aresta("A", "D")); 
        Grafo.add(new Aresta("B", "C")); 
        Grafo.add(new Aresta("C", "D")); 
        Grafo.add(new Aresta("C", "E")); 
        Grafo.add(new Aresta("D", "E")); 
        Grafo.add(new Aresta("E", "F"));
        Grafo.add(new Aresta("E", "G"));
        
        listVertex(Grafo);
    }
//    vertice(): listagem dos vertices
    private static void listVertex(ArrayList<Aresta> grafo){
        for(Aresta aresta: grafo ){
            System.out.println("Vertice : "+aresta.getVerticeA());
        }
    }
//numVertices(): numero de arestas
    private static void numArestas(ArrayList<Aresta> grafo){
        
    }
//edges():listagem das arestas
    private static void listArestas(){
        
    }
//nunedges():numero de arestas
//degree(v):grau do vertice v (a quantidade de arestas que ele possui)
//adjacentVertices(v):listagem de arestas que pertencem ao vertice v
//G = (V,E)
//	V: vertices
//	E: arestas, relacionada a dois vertices
//	
//Add
//addVertex(v): adição de um novo vertice ao grafo
//removeVertex(v):remoção de um vertice exixtente do grafo
//isTree(G):informa se um grafo é também um arvore
//isLine(G):informa se um grafo é de linha
//path(V1,V2): informar se existe um caminho entre V1 e V2. Se sim apresentar caminho
    

}

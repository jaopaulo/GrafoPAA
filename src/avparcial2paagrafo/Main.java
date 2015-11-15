package avparcial2paagrafo;

import java.util.ArrayList;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Grafo Grafo = new Grafo();

        Grafo.addArestas(new Aresta("A", "B")); 
        Grafo.addArestas(new Aresta("A", "D")); 
        Grafo.addArestas(new Aresta("B", "C")); 
        Grafo.addArestas(new Aresta("C", "D")); 
        Grafo.addArestas(new Aresta("C", "E")); 
        Grafo.addArestas(new Aresta("D", "E")); 
        Grafo.addArestas(new Aresta("E", "F"));
        Grafo.addArestas(new Aresta("E", "G"));
        
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

package avparcial2paagrafo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Grafo Grafo = new Grafo();
        Scanner sc = new Scanner(System.in);
        int menu;

        Grafo.addArestas(new Aresta("A", "B"));
        Grafo.addArestas(new Aresta("A", "D"));
        Grafo.addArestas(new Aresta("B", "C"));
        Grafo.addArestas(new Aresta("C", "D"));
        Grafo.addArestas(new Aresta("C", "E"));
        Grafo.addArestas(new Aresta("D", "E"));
        Grafo.addArestas(new Aresta("E", "F"));
        Grafo.addArestas(new Aresta("E", "G"));

        System.out.println("Menu\n"
                + "1 - vertice(): listagem dos vertices\n"
                + "2 - numVertices(): numero de vertices\n"
                + "3 - edges():listagem das arestas\n"
                + "4 - nunedges():numero de arestas\n"
                + "5 - degree(v):grau do vertice v (a quantidade de arestas que ele possui)\n"
                + "6 - adjacentVertices(v):listagem de arestas que pertencem ao vertice v");
        System.out.print("Escolha um opcao : ");
        menu = sc.nextInt();
        switch (menu) {
            case 1://lista todos os vertices
                listVertices(Grafo);
                break;
            case 2://lista todos os vertices
                numVertices(Grafo);
                break;
            case 3://lista todos os vertices
                listArestas(Grafo);
                break;
            case 4://lista todos os vertices
                numArestas(Grafo);
                break;
            case 5://lista todos os vertices
                listVertices(Grafo);
                break;
            case 6://lista todos os vertices
                listVertices(Grafo);
                break;
            default:
                break;
        }

    }
//    vertice(): listagem dos vertices

    private static void listVertices(Grafo grafo) {
        ArrayList<String> aux = new ArrayList<>();
        for (Aresta arestas : grafo.listaDeArestas()) {
            if (!aux.contains(arestas.vertice1.getValor())) {
                aux.add(arestas.vertice1.getValor());
            }
            if (!aux.contains(arestas.vertice2.getValor())) {
                aux.add(arestas.vertice2.getValor());
            }
        }
        for (String vertice : aux) {
            System.out.println("Vertice:" + vertice);
        }
        aux.clear();
    }
//numVertices(): numero de vertices

    private static void numVertices(Grafo grafo) {
        ArrayList<String> aux = new ArrayList<>();
        for (Aresta arestas : grafo.listaDeArestas()) {
            if (!aux.contains(arestas.vertice1.getValor())) {
                aux.add(arestas.vertice1.getValor());
            }
            if (!aux.contains(arestas.vertice2.getValor())) {
                aux.add(arestas.vertice2.getValor());
            }
        }
        System.out.println("numero de Vertices : " + aux.size());
    }
//edges():listagem das arestas

    private static void listArestas(Grafo grafo) {
        System.out.println("Arestas");
        for (Aresta arestas : grafo.listaDeArestas()) {
            System.out.println("( " + arestas.vertice1.getValor() + " )--------( " + arestas.vertice2.getValor() + " )");
        }
    }
//nunedges():numero de arestas

    private static void numArestas(Grafo grafo) {
        ArrayList<Aresta> aux = grafo.listaDeArestas();

        System.out.println("Numero de Arestas : " + aux.size());

    }
//degree(v):grau do vertice v (a quantidade de arestas que ele possui)

    private static void degree(Grafo grafo, Vertice vertice) {

    }
//adjacentVertices(v):listagem de arestas que pertencem ao vertice v

    private static void adjacentVertices(Grafo grafo, Vertice vertice) {

    }

//G = (V,E)
//	V: vertices
//	E: arestas, relacionada a dois vertices
//addVertex(v): adição de um novo vertice ao grafo
//removeVertex(v):remoção de um vertice exixtente do grafo
//isTree(G):informa se um grafo é também um arvore
//isLine(G):informa se um grafo é de linha
//path(V1,V2): informar se existe um caminho entre V1 e V2. Se sim apresentar caminho
}

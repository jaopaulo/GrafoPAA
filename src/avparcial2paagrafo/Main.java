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
        String va;

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
                + "6 - adjacentVertices(v):listagem de arestas que pertencem ao vertice v\n"
                + "0 - Sair");
        System.out.print("Escolha um opcao : ");
        menu = Integer.parseInt(sc.nextLine());
        switch (menu) {
            case 1://lista de vertices
                listVertices(Grafo);
                break;
            case 2://numero de vertices
                numVertices(Grafo);
                break;
            case 3://lista de arestas
                listArestas(Grafo);
                break;
            case 4://numero de arestas
                numArestas(Grafo);
                break;
            case 5://grau do vertice v
                System.out.print("Digite o vertice para saber seu Grau: ");
                va = sc.nextLine();
                degree(Grafo, va);
                break;
            case 6://vertices adjaventes ao vertice v
                System.out.print("Digite o vertice para ver seus Adjacentes: ");
                va = sc.nextLine();
                adjacentVertices(Grafo, va);
                break;
            default:
                break;
        }

    }
//    vertice(): listagem dos vertices

    private static void listVertices(Grafo grafo) {
        ArrayList<String> aux = new ArrayList<>();
        for (Aresta arestas : grafo.listaDeArestas()) {
            if (!aux.contains(arestas.getVertice1())) {
                aux.add(arestas.getVertice1());
            }
            if (!aux.contains(arestas.getVertice2())) {
                aux.add(arestas.getVertice2());
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
            if (!aux.contains(arestas.getVertice1())) {
                aux.add(arestas.getVertice1());
            }
            if (!aux.contains(arestas.getVertice2())) {
                aux.add(arestas.getVertice1());
            }
        }
        System.out.println("numero de Vertices : " + aux.size());
        aux.clear();
    }
//edges():listagem das arestas

    private static void listArestas(Grafo grafo) {
        System.out.println("Arestas");
        for (Aresta arestas : grafo.listaDeArestas()) {
            System.out.println("( " + arestas.getVertice1() + " )--------( " + arestas.getVertice2() + " )");
        }
    }
//nunedges():numero de arestas

    private static void numArestas(Grafo grafo) {
        ArrayList<Aresta> aux = grafo.listaDeArestas();

        System.out.println("Numero de Arestas : " + aux.size());

    }
//degree(v):grau do vertice v (a quantidade de arestas que ele possui)

    private static void degree(Grafo grafo, String vDegree) {
        //ArrayList<Aresta> aux = new ArrayList<>();
        int cont = 0;
        for (Aresta arestas : grafo.listaDeArestas()) {
            if (vDegree.equals(arestas.getVertice1())) {
                //aux.add(arestas);
                cont++;
            } else if (vDegree.equals(arestas.getVertice2())) {
                //aux.add(arestas);
                cont++;
            }
        }
//        if(aux.isEmpty()){
//            System.out.println("Vertice ( " + vAdjacente + " )não existe no Grafo");
//            return;
//        }
//        for (Aresta adjacentes : aux) {
//            System.out.println("( " + adjacentes.getVertice1()+" )-------( " + adjacentes.getVertice2() + " )");
//        }
        System.out.println("Grau( "+ vDegree +" ) = " + cont );
//        aux.clear();
    }
//adjacentVertices(v):listagem de arestas que pertencem ao vertice v

    private static void adjacentVertices(Grafo grafo, String vAdjacente) {
        ArrayList<Aresta> aux = new ArrayList<>();
        for (Aresta arestas : grafo.listaDeArestas()) {
            if (vAdjacente.equals(arestas.getVertice1())) {
                aux.add(arestas);
            } else if (vAdjacente.equals(arestas.getVertice2())) {
                aux.add(arestas);
            }
        }
        if (aux.isEmpty()) {
            System.out.println("Vertice ( " + vAdjacente + " )não existe no Grafo");
            return;
        }
        for (Aresta adjacentes : aux) {
            System.out.println("( " + adjacentes.getVertice1() + " )-------( " + adjacentes.getVertice2() + " )");
        }
        aux.clear();
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

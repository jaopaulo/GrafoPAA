package avparcial2paagrafo;

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
                //listVertices(Grafo);
                break;
            case 2://numero de vertices
                // numVertices(Grafo);
                break;
            case 3://lista de arestas
                //listArestas(Grafo);
                break;
            case 4://numero de arestas
                //numArestas(Grafo);
                break;
            case 5://grau do vertice v
                System.out.print("Digite o vertice para saber seu Grau: ");
                va = sc.nextLine();
                //degree(Grafo, va);
                break;
            case 6://vertices adjaventes ao vertice v
                System.out.print("Digite o vertice para ver seus Adjacentes: ");
                va = sc.nextLine();
                //adjacentVertices(Grafo, va);
                break;
            default:
                break;
        }

    }
//    vertice(): listagem dos vertices

}

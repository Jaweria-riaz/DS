import java.util.Scanner;

public class GraphAdjMatrix {
    private int[][] adjMatrix; // Adjacency matrix
    private int vertices;      // Number of vertices

    // Constructor
    public GraphAdjMatrix(int vertices) {
        this.vertices = vertices;
        adjMatrix = new int[vertices][vertices];
    }

    // Add edge
    public void addEdge(int src, int dest) {
        adjMatrix[src][dest] = 1; // Add edge
        adjMatrix[dest][src] = 1; // For undirected graph
    }

    // Print adjacency matrix
    public void printMatrix() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Check connection between two vertices
    public boolean isConnected(int src, int dest) {
        return adjMatrix[src][dest] == 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of vertices: ");
        int vertices = scanner.nextInt();

        GraphAdjMatrix graph = new GraphAdjMatrix(vertices);

        System.out.print("Enter the number of edges: ");
        int edges = scanner.nextInt();

        System.out.println("Enter the edges (source and destination):");
        for (int i = 0; i < edges; i++) {
            int src = scanner.nextInt();
            int dest = scanner.nextInt();
            graph.addEdge(src, dest);
        }

        graph.printMatrix();

        System.out.print("Enter two vertices to check connection: ");
        int src = scanner.nextInt();
        int dest = scanner.nextInt();

        System.out.println("Connected: " + graph.isConnected(src, dest));
    }
}

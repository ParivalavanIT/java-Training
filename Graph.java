import java.util.*;

public class Graph {
    private int vertices;
    private int[][] adjacencyMatrix;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencyMatrix = new int[vertices][vertices];
    }

    public void addEdge(int source, int destination) {
        adjacencyMatrix[source][destination] = 1;
    }

    public void bfs(int startVertex) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.add(startVertex);

        boolean isFirst = true;
        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            if (isFirst) {
                System.out.print(currentVertex);
                isFirst = false;
            } else {
                System.out.print("->" + currentVertex);
            }

            for (int neighbor = 0; neighbor < vertices; neighbor++) {
                if (adjacencyMatrix[currentVertex][neighbor] == 1 && !visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    public void dfs(int startVertex) {
        boolean[] visited = new boolean[vertices];
        Stack<Integer> stack = new Stack<>();

        visited[startVertex] = true;
        stack.push(startVertex);

        boolean isFirst = true;
        while (!stack.isEmpty()) {
            int currentVertex = stack.pop();
            if (isFirst) {
                System.out.print(currentVertex);
                isFirst = false;
            } else {
                System.out.print("->" + currentVertex);
            }

            for (int neighbor = 0; neighbor < vertices; neighbor++) {
                if (adjacencyMatrix[currentVertex][neighbor] == 1 && !visited[neighbor]) {
                    visited[neighbor] = true;
                    stack.push(neighbor);
                }
            }
        }
        System.out.println();
    }

    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + " is connected to: ");
            for (int j = 0; j < vertices; j++) {
                if (adjacencyMatrix[i][j] == 1) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of vertices: ");
        int vertices = sc.nextInt();
        System.out.println();
        Graph graph = new Graph(vertices);
        System.out.println("Enter the source and destination vertex, or -1 to exit: ");
        while (true) {
            int source = sc.nextInt();
            if (source == -1) {
                break;
            }
            int destination = sc.nextInt();
            graph.addEdge(source, destination);
        }
        graph.printGraph();
        System.out.println("Enter the start index for BFS:");
        graph.bfs(sc.nextInt());

        System.out.println("Enter the start index for DFS:");
        graph.dfs(sc.nextInt());

        sc.close();
    }
}

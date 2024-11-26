import java.util.ArrayList;
import java.util.Scanner;

public class DFStransitiveClosure {
    static class Graph {
        private int vertices; 
        private ArrayList<Integer>[] adjList;
        private int[][] tc;

        public Graph(int vertices) {
            this.vertices = vertices; 
            this.tc = new int[this.vertices][this.vertices];
            initAdjList(); 
        }

        // @SuppressWarnings("unchecked")
        private void initAdjList() {
            adjList = new ArrayList[vertices];
            for (int i = 0; i < vertices; i++) {
                adjList[i] = new ArrayList<>();
            }
        }

        public void addEdge(int u, int v) {
            adjList[u].add(v); 
        }

        public void transitiveClosure() {
            for (int i = 0; i < vertices; i++) {
                dfsUtil(i, i);
            }
        }

        private void dfsUtil(int s, int v) {
            tc[s][v] = 1;
            for (int adj : adjList[v]) {            
                if (tc[s][adj] == 0) {
                    dfsUtil(s, adj);
                }
            }
        }

        public void printTransitiveClosure() {
            for (int i = 0; i < vertices; i++) {
                for (int j = 0; j < vertices; j++) {
                    System.out.print(tc[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            Graph graph = new Graph(n);

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int val = scanner.nextInt();
                    if (val == 1) {
                        graph.addEdge(i, j);
                    }
                }
            }

            graph.transitiveClosure();
            graph.printTransitiveClosure();
        }

        scanner.close();
    }
}

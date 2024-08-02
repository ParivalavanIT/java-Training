import java.util.*;

public class PrimsAlgorithm {
    private static final int INF = Integer.MAX_VALUE;

    public static void primMST(int[][] graph) {
        int vertices = graph.length;
        int[] parent = new int[vertices];
        int[] key = new int[vertices];
        boolean[] visited = new boolean[vertices];

        Arrays.fill(key, INF);
        Arrays.fill(visited, false);

        key[0] = 0;
        parent[0] = -1;

        for (int i = 0; i < vertices - 1; i++) {
            int minKey = findMinKey(key, visited);
            visited[minKey] = true;

            for (int j = 0; j < vertices; j++) {
                if (graph[minKey][j] != 0 && !visited[j] && graph[minKey][j] < key[j]) {
                    parent[j] = minKey;
                    key[j] = graph[minKey][j];
                }
            }
        }

        printMST(parent, graph);
    }

    private static int findMinKey(int[] key, boolean[] visited) {
        int min = INF;
        int minIndex = -1;

        for (int i = 0; i < key.length; i++) {
            if (!visited[i] && key[i] < min) {
                min = key[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

    private static void printMST(int[] parent, int[][] graph) {
        System.out.println("Edge \tWeight");
        for (int i = 1; i < graph.length; i++) {
            System.out.println(parent[i] + " - " + i + "\t" + graph[i][parent[i]]);
        }
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0, 2, 0, 6, 0},
            {2, 0, 3, 8, 5},
            {0, 3, 0, 0, 7},
            {6, 8, 0, 0, 9},
            {0, 5, 7, 9, 0}
        };

        primMST(graph);
    }
}
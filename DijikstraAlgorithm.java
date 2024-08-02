import java.util.*;
class Edge {
    int vertex;
    int weight;

    Edge(int vertex, int weight) {
        this.vertex = vertex;
        this.weight = weight;
    }
}
public class DijikstraAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int V = scanner.nextInt();
        int E = scanner.nextInt();


        Edge[][] graph = new Edge[V][];
        int[] edgeCount = new int[V]; 
        int[][] tempEdges = new int[E][3];
        for (int i = 0; i < E; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w = scanner.nextInt();
            tempEdges[i][0] = u;
            tempEdges[i][1] = v;
            tempEdges[i][2] = w;
            edgeCount[u]++;
            edgeCount[v]++;
        }

        for (int i = 0; i < V; i++) {
            graph[i] = new Edge[edgeCount[i]];
        }


        Arrays.fill(edgeCount, 0);


        for (int i = 0; i < E; i++) {
            int u = tempEdges[i][0];
            int v = tempEdges[i][1];
            int w = tempEdges[i][2];
            graph[u][edgeCount[u]++] = new Edge(v, w);
            graph[v][edgeCount[v]++] = new Edge(u, w);      
         }

    
        int S = scanner.nextInt();


        int[] distances = dijkstra(V, graph, S);

        for (int i = 0; i < V; i++) {
            System.out.print(distances[i] + " ");
        }
    }

    public static int[] dijkstra(int V, Edge[][] graph, int S) {
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[S] = 0;

        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(edge -> edge.weight));
        pq.add(new Edge(S, 0));

        while (!pq.isEmpty()) {
            Edge current = pq.poll();
            int u = current.vertex;
            int currentDist = current.weight;

            if (currentDist > dist[u]) {
                continue;
            }

            for (Edge neighbor : graph[u]) {
                int v = neighbor.vertex;
                int weight = neighbor.weight;
                int distance = currentDist + weight;

                if (distance < dist[v]) {
                    dist[v] = distance;
                    pq.add(new Edge(v, distance));
                }
            }
        }

        return dist;
    }
}



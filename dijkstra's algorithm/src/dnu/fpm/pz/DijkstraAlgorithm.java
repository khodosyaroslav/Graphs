package dnu.fpm.pz;

import java.util.Arrays;

public class DijkstraAlgorithm {
    private static final int INF = Integer.MAX_VALUE;

    public static void dijkstra(int[][] graph, int start) {
        int n = graph.length;
        int[] dist = new int[n];
        boolean[] visited = new boolean[n];
        int[] parent = new int[n];

        Arrays.fill(dist, INF);
        dist[start] = 0;
        parent[start] = -1;

        for (int i = 0; i < n - 1; i++) {
            int u = getMinimumDistanceVertex(dist, visited);
            visited[u] = true;

            for (int v = 0; v < n; v++) {
                if (!visited[v] && graph[u][v] != 0 && dist[u] != INF && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                    parent[v] = u;
                }
            }
        }

        printDistancesAndPaths(dist, parent, start);
    }

    private static int getMinimumDistanceVertex(int[] dist, boolean[] visited) {
        int minIndex = 0;
        int minValue = INF;

        for (int i = 0; i < dist.length; i++) {
            if (!visited[i] && dist[i] < minValue) {
                minIndex = i;
                minValue = dist[i];
            }
        }

        return minIndex;
    }

    private static void printDistancesAndPaths(int[] dist, int[] parent, int start) {
        System.out.println("Shortest paths from vertex " + (start + 1) + ":");
        for (int i = 0; i < dist.length; i++) {
            if (i != start) {
                System.out.print("Vertex " + (i + 1) + ": ");
                if (dist[i] == INF) {
                    System.out.println("No path exists.");
                } else {
                    printPath(parent, i);
                    System.out.println(" (distance = " + dist[i] + ")");
                }
            }
        }
    }

    private static void printPath(int[] parent, int v) {
        if (v == -1) {
            return;
        }

        printPath(parent, parent[v]);
        System.out.print((v + 1) + " ");
    }
}

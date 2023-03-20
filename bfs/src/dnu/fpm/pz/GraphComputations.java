package dnu.fpm.pz;

import java.util.*;

import static dnu.fpm.pz.Solution.N;
import static dnu.fpm.pz.Utils.calculateDistance;

public class GraphComputations {
    public static List<Edge> calculateEdges(double[][] distanceMatrix, int d) {
        List<Edge> edges = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (distanceMatrix[i][j] < d) {
                    edges.add(new Edge(i, j));
                }
            }
        }

        return edges;
    }

    public static double[][] calculateDistanceMatrix(Vertex[] vertices) {
        double[][] distanceMatrix = new double[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    distanceMatrix[i][j] = 0;
                } else {
                    distanceMatrix[i][j] = calculateDistance(vertices[i], vertices[j]);
                }
            }
        }

        return distanceMatrix;
    }

    public static int calculateDForCompleteGraph(double[][] distanceMatrix) {
        int d = 0;
        while (true) {
            int[][] adjacencyMatrix = calculateAdjacencyMatrix(distanceMatrix, d);
            if (isGraphComplete(adjacencyMatrix)) {
                return d;
            }
            d++;
        }
    }

    private static boolean isGraphComplete(int[][] adjacencyMatrix) {
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (adjacencyMatrix[i][j] == 0)
                    return false;
            }
        }
        return true;
    }

    public static int[][] calculateAdjacencyMatrix(double[][] distanceMatrix, int d) {
        int[][] adjacencyMatrix = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    adjacencyMatrix[i][j] = 0;
                } else {
                    if (distanceMatrix[i][j] < d) {
                        adjacencyMatrix[i][j] = 1;
                    } else {
                        adjacencyMatrix[i][j] = 0;
                    }
                }
            }
        }

        return adjacencyMatrix;
    }

    public static List<List<Integer>> calculateAdjacencyList(int[][] adjacencyMatrix) {
        List<List<Integer>> adjacencyList = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (adjacencyMatrix[i][j] == 1) {
                    adjacencyList.get(i).add(j);
                }
            }
        }

        return adjacencyList;
    }

    public static int[][] calculateIncidenceMatrix(List<Edge> edges) {
        int[][] incidenceMatrix = new int[N][edges.size()];

        for (int j = 0; j < edges.size(); j++) {
            incidenceMatrix[edges.get(j).vertex1Index][j] = 1;
            incidenceMatrix[edges.get(j).vertex2Index][j] = 1;
        }

        return incidenceMatrix;
    }

    public static Node bfs(int startVertex, List<List<Integer>> adjacencyList) {
        boolean[] visited = new boolean[N];
        Queue<Node> queue = new LinkedList<>();

        visited[startVertex] = true;
        Node head = new Node(startVertex);
        queue.add(head);

        while (queue.size() != 0) {
            Node currentNode = queue.poll();

            for (int v : adjacencyList.get(currentNode.data)) {
                if (!visited[v]) {
                    visited[v] = true;

                    Node node = new Node(v);
                    queue.add(node);
                    currentNode.children.add(node);
                }
            }
        }

        return head;
    }
}

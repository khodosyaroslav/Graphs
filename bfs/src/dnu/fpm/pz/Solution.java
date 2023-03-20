package dnu.fpm.pz;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Solution {
    public static final int N = 8;
    public static Random rand = new Random();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Vertex[] vertices = Utils.generateVertices(-10, 20, -20, 20);
        Utils.printVertices(vertices);

        int d = -1, edgesCount = -1;
        double[][] distanceMatrix = new double[N][N];
        List<Edge> edges = new ArrayList<>();

        while (edgesCount < 10 || edgesCount > 13) {
            System.out.print("\nEnter d: ");
            d = in.nextInt();

            distanceMatrix = GraphComputations.calculateDistanceMatrix(vertices);
            edges = GraphComputations.calculateEdges(distanceMatrix, d);
            Utils.printEdges(edges);
            System.out.println("\nDistance matrix: ");
            Utils.printMatrix(distanceMatrix);
            System.out.println("If d will be: " + GraphComputations.calculateDForCompleteGraph(distanceMatrix)
                    + ", then graph becomes complete");

            edgesCount = edges.size();
            if (edgesCount < 10 || edgesCount > 13)
                System.out.println("[INFO]: Incorrect count of edges");
        }

        System.out.println("\nAdjacency matrix: ");
        int[][] adjacencyMatrix = GraphComputations.calculateAdjacencyMatrix(distanceMatrix, d);
        Utils.printMatrix(adjacencyMatrix);
        Utils.printMatrixForCopy(adjacencyMatrix);

        System.out.println("\nAdjacency list: ");
        List<List<Integer>> adjacencyList = GraphComputations.calculateAdjacencyList(adjacencyMatrix);
        Utils.printAdjacencyList(adjacencyList);

        System.out.println("\nIncidence matrix: ");
        int[][] incidenceMatrix = GraphComputations.calculateIncidenceMatrix(edges);
        Utils.printIncidenceMatrix(incidenceMatrix);

        System.out.println("\nEnter start vertex from 0 to 7: ");
        int vertexIndex = in.nextInt();
        Node node = GraphComputations.bfs(vertexIndex, adjacencyList);
        System.out.println("\nBFS tree: ");
        Utils.printTree(node);
    }
}
package dnu.fpm.pz;


import java.util.List;

import static dnu.fpm.pz.Solution.N;
import static dnu.fpm.pz.Solution.rand;

public class Utils {
    public static Vertex[] generateVertices(int xMin, int xMax, int yMin, int yMax) {
        Vertex[] vertices = new Vertex[N];

        for (int i = 0; i < N; i++) {
            vertices[i] = new Vertex(randInt(xMin, xMax), randInt(yMin, yMax));
        }

        return vertices;
    }

    public static int randInt(int min, int max) {
        return rand.nextInt((max - min) + 1) + min;
    }

    public static double calculateDistance(Vertex v1, Vertex v2) {
        double distance = Math.sqrt((v2.x - v1.x) * (v2.x - v1.x) + (v2.y - v1.y) * (v2.y - v1.y));
        return Math.ceil(distance * 10) / 10;
    }

    public static void printVertices(Vertex[] vertices) {
        for (int i = 0; i < vertices.length; i++)
            System.out.println("V" + i + ": (" + vertices[i].x + ", " + vertices[i].y + ")");
    }

    public static void printEdges(List<Edge> edges) {
        System.out.println("\nEdges(" + edges.size() + "):");
        for (int i = 0; i < edges.size(); i++)
            System.out.println("E" + i + ": (" + edges.get(i).vertex1Index + " - " + edges.get(i).vertex2Index + ")");
    }

    public static void printMatrix(double[][] matrix) {
        System.out.print("        ");
        for (int i = 0; i < N; i++) {
            System.out.printf(String.format("%-8s", "V" + i));
        }
        System.out.println();

        for (int i = 0; i < N; i++) {
            System.out.printf(String.format("%-8s", "V" + i));
            for (int j = 0; j < N; j++) {
                System.out.printf(String.format("%-8.1f", matrix[i][j]));
            }
            System.out.println();
        }
    }

    public static void printMatrix(int[][] matrix) {
        System.out.print("        ");
        for (int i = 0; i < N; i++) {
            System.out.printf(String.format("%-8s", "V" + i));
        }
        System.out.println();

        for (int i = 0; i < N; i++) {
            System.out.printf(String.format("%-8s", "V" + i));
            for (int j = 0; j < N; j++) {
                System.out.printf(String.format("%-8d", matrix[i][j]));
            }
            System.out.println();
        }
    }

    public static void printMatrixForCopy(int[][] matrix) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printAdjacencyList(List<List<Integer>> adjacencyList) {
        for (int i = 0; i < adjacencyList.size(); i++) {
            System.out.print(i + " -> ");
            for (int j = 0; j < adjacencyList.get(i).size(); j++) {
                System.out.print(adjacencyList.get(i).get(j) + " -> ");
            }
            System.out.print("/\n");
        }
    }

    public static void printIncidenceMatrix(int[][] incidenceMatrix) {
        System.out.print("        ");
        for (int i = 0; i < incidenceMatrix[0].length; i++) {
            System.out.printf(String.format("%-8s", "E" + i));
        }
        System.out.println();

        for (int i = 0; i < N; i++) {
            System.out.printf(String.format("%-8s", "V" + i));
            for (int j = 0; j < incidenceMatrix[0].length; j++) {
                System.out.printf(String.format("%-8d", incidenceMatrix[i][j]));
            }
            System.out.println();
        }
    }

    public static void printTree(Node node){
        if(node != null){
            printTree(node, "", true);
        } else {
            System.out.println("Tree is empty");
        }
    }

    private static void printTree(Node node, String indent, boolean isLast) {
        System.out.print(indent + "+--" + node.data + "\n");
        indent += isLast ? "   " : "|  ";

        List<Node> children = node.children;
        for (int i = 0; i < children.size(); i++) {
            printTree(children.get(i), indent, i + 1 == children.size());
        }
    }
}
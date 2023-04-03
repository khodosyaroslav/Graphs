package dnu.fpm.pz;

import java.util.Scanner;

public class Solution {
    static final int[][] GRAPH = {
            {0, 0, 14, 9, 0, 13, 0},
            {0, 0, 0, 18, 14, 0, 0},
            {14, 10, 0, 0, 12, 0, 0},
            {9, 0, 0, 0, 0, 0, 3},
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 25, 0, 0, 0},
            {0, 0, 0, 3, 7, 19, 0}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of the starting vertex from 1 to 7: ");
        int start = scanner.nextInt();

        if (start > 0 && start < 8)
            DijkstraAlgorithm.dijkstra(GRAPH, start - 1);
    }
}
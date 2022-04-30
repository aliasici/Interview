package southwest;

import java.util.Scanner;

public class MaxPathSum {

    static int maxPathSum(int input[][], int n) {
        // start from row above bottom row
        // since the bottom row cells are the answers themselves
        for (int i = n - 2; i >= 0; i--) {
            // start from left to right in column
            for (int j = 0; j <= i; j++) {
                if (input[i + 1][j] > input[i + 1][j + 1])
                    input[i][j] += input[i + 1][j];
                else
                    input[i][j] += input[i + 1][j + 1];
            }
        }
        return input[0][0];
    }

    public static void main(String[] args) {
        int tri[][] = { {1, 0, 0},
                        {4, 8, 0},
                        {1, 5, 3} };
        System.out.println ( maxPathSum(tri, 3));

    }
}
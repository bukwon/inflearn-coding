package inflearn.myAlgorithmn.section2;

import java.util.Scanner;

public class step09 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        System.out.println(maxSum(n));
    }

    private static int maxSum(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int max = Math.max(diagonal(matrix, n), perpendicular(matrix, n));
        max = Math.max(max, horizontality(matrix, n));
        return max;
    }

    private static int diagonal(int[][] matrix, int n) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
        }
        max = sum;
        sum = 0;
        for (int i = n - 1; i >= 0; i--) {
            sum += matrix[i][i];
        }
        if (max < sum) max = sum;
        return max;
    }

    private static int perpendicular(int[][] matrix, int n) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += matrix[j][i];
            }
            if (max < sum) max = sum;
            sum = 0;
        }
        return max;
    }

    private static int horizontality(int[][] matrix, int n) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += matrix[i][j];
            }
            if (max < sum) max = sum;
            sum = 0;
        }
        return max;
    }
}

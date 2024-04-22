package inflearn.myAlgorithmn.section2;

import java.util.Scanner;

public class step09Edit {
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

        int sumPer, sumHor;
        int sumDia01 = 0;
        int sumDia02 = 0;
        int answer = 0;
        for (int i = 0; i < n; i++) {
            sumPer = sumHor = 0;
            sumDia01 += matrix[i][i];
            sumDia02 += matrix[i][n - i - 1];
            for (int j = 0; j < n; j++) {
                sumPer += matrix[i][j];
                sumHor += matrix[j][i];
            }
            answer = Math.max(answer, sumPer);
            answer = Math.max(answer, sumHor);
        }
        answer = Math.max(answer, sumDia01);
        answer = Math.max(answer, sumDia02);
        return answer;
    }
}
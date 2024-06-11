package inflearn.myAlgorithmn.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class no1351 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(matrix));
    }

    private static int solution(int[][] matrix) {
        int answer = 0;
        for (int i = 0; i < matrix.length; i++) {
            Arrays.sort(matrix[i]);
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] >= 0) break;
                answer ++;
            }
        }
        return answer;
    }
}

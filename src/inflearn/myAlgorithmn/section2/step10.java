package inflearn.myAlgorithmn.section2;

import java.util.Scanner;

public class step10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mt = new int[n + 2][n + 2];
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                mt[i][j] = sc.nextInt();
            }
        }
        System.out.println(mountain(mt, n));
    }

    private static int mountain(int[][] mt, int n) {
        int answer = 0;
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (mt[i][j] > mt[i - 1][j] && mt[i][j] > mt[i + 1][j] && mt[i][j] > mt[i][j - 1] && mt[i][j] > mt[i][j + 1])
                    answer ++;
            }
        }
        return answer;
    }
}

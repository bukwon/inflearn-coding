package inflearn.myAlgorithmn.section8;

import java.util.Scanner;

public class step07 {
    static int[][] xy = new int[35][35];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(solution(n, r));
    }

    private static int solution(int n, int r) {
        if (xy[n][r] > 0) return xy[n][r];
        if (n == r || r == 0) return 1;
        else return xy[n][r] = solution(n - 1, r - 1) + solution(n - 1, r);
    }
}

package inflearn.inflearn.inflearn.section8;

import java.util.Scanner;

public class step07 {
    static int answer = 0;
    static int[][] dy = new int[35][35];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(Memoization(n, r));
    }

    private static int Memoization(int n, int r) {
        if (dy[n][r] > 0) return dy[n][r];
        if (r == 0 || n == r) return 1;

        else return dy[n][r] = Memoization(n - 1, r - 1) + Memoization(n - 1, r);
    }
}

package inflearn.myAlgorithmn.section8;

import java.util.Scanner;

public class step07 {
    static int answer = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(Memoization(n, r));
    }

    private static int Memoization(int n, int r) {
        if (r == 0 || n == r) return 1;

        else return Memoization(n - 1, r - 1) + Memoization(n - 1, r);
    }
}

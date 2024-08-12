package inflearn.myAlgorithmn.section8;

import java.util.Scanner;

public class step05 {
    static int answer = Integer.MAX_VALUE, tmp = 0, calc = 0;
    static int N, M;
    static int[] coin;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        coin = new int[N];
        for (int i = 0; i < N; i++) coin[i] = sc.nextInt();
        M = sc.nextInt();
        backTracking(0);
        System.out.println(answer);
    }

    private static void backTracking(int v) {
        if (tmp > answer) return;

        if (calc >= M) {
            if (calc == M) answer = tmp;
            return;
        }

        while (v < N) {
            calc += coin[v];
            tmp++;
            backTracking(v);
            calc -= coin[v];
            tmp--;
            v++;
        }
    }
}

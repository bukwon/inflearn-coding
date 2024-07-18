package inflearn.inflearn.inflearn.section8;

import java.util.Scanner;

public class step03 {
    static int N;
    static int M;
    static int answer = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        DFS(0, 0, 0, a, b);
        System.out.println(answer);
    }

    private static void DFS(int L, int sum, int time, int[] ps, int[] pt) {
        if (time > M) return;
        if (L == N) {
            answer = Math.max(answer, sum);
        }
        else {
            DFS(L + 1, sum + ps[L], time + pt[L], ps, pt);
            DFS(L + 1, sum, time, ps, pt);
        }
    }
}

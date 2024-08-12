package inflearn.inflearn.inflearn.section8;

import java.util.Scanner;

public class step09 {
    static int[] combi;
    static int n, m;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        combi = new int[m];
        DFS(0, 1);
    }

    private static void DFS(int L, int s) {
        if (L == m) {
            for (int i: combi) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        else {
            for (int i = s; i <= n; i++) {
                combi[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }
}

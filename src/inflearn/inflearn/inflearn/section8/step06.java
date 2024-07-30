package inflearn.inflearn.inflearn.section8;

import java.util.Scanner;

public class step06 {
    static int n, m;
    static int[] pm, ch, arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        ch = new int[n];
        pm = new int[m];
        DFS(0);
    }

    private static void DFS(int start) {
        if (start == m) {
            for (int i: pm) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        else {
            for (int i = 0; i < n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    pm[start] = arr[i];
                    DFS(start + 1);
                    ch[i] = 0;
                }
            }
        }
    }
}

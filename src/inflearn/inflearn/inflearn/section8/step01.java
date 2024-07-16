package inflearn.inflearn.inflearn.section8;

import java.util.Arrays;
import java.util.Scanner;

public class step01 {
    static int[] array;
    static int n;
    static int total = 0;
    static boolean flag = false;
    static String answer = "NO";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            total += array[i];
        }
        DFS(0, 0);
        System.out.println(answer);
    }

    private static void DFS(int L, int sum) {
        if (flag) return;
        if (L == n) {
            if ((total - sum) == sum) {
                answer = "YES";
                flag = true;
            }
        }
        else {
            DFS(L+1, sum + array[L]);
            DFS(L+1, sum);
        }
    }
}

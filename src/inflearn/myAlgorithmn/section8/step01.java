package inflearn.myAlgorithmn.section8;

import java.util.Arrays;
import java.util.Scanner;

public class step01 {
    static int[] array;
    static int n;
    static int num1 = 0, num2 = 0;
    static boolean[] visit;
    static String answer = "NO";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        array = new int[n];
        visit = new boolean[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);
        num2 = Arrays.stream(array).sum();
        DFS(0);
        System.out.println(answer);
    }

    private static void DFS(int v) {
        if (answer.equals("YES") || num1 > num2) return;

        if (num1 == num2) {
            answer = "YES";
            return;
        }

        for (int i = v; i < n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                num1 += array[i];
                num2 -= array[i];
                DFS(i + 1);
                visit[i] = false;
                num2 += array[i];
                num1 -= array[i];
            }
        }
    }
}

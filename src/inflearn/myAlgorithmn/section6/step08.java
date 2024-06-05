package inflearn.myAlgorithmn.section6;

import java.util.Arrays;
import java.util.Scanner;

public class step08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) array[i] = sc.nextInt();
        System.out.println(solution(n, m, array));
    }

    private static int solution(int n, int m, int[] array) {
        int answer = 0;
        Arrays.sort(array);

        for (int i = 0; i < n; i++) {
            if (array[i] == m) return i + 1;
        }
        return 0;
    }
}

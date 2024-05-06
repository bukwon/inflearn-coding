package inflearn.myAlgorithmn.baekjoon;

import java.util.Scanner;

public class no12847 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n, m, arr));
    }

    private static long solution(int n, int m, int[] arr) {
        long benefit = Integer.MIN_VALUE, max = 0;
        int p1 = 0, p2 = m;
        for (int i = 0; i < m; i++) {
            max += arr[i];
        }
        benefit = Math.max(benefit, max);
        while(p2 < n) {
            max -= arr[p1++];
            max += arr[p2++];
            if (max > benefit) benefit = max;
        }
        return benefit;
    }
}

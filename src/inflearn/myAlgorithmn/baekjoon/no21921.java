package inflearn.myAlgorithmn.baekjoon;

import java.util.Scanner;

public class no21921 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] visit = new int[n];
        for (int i = 0; i < n; i++) {
            visit[i] = sc.nextInt();
        }
        solution(n, x, visit);
    }

    private static void solution(int n, int x, int[] visit) {
        int answer = 0;
        int max = 0, sum = 0, p1 = 0, p2 = x - 1, count = 1;
        for (int i = 0; i < x; i++) sum += visit[i];
        max = sum;
        answer = max;
        while(p2 < n - 1) {
            sum -= visit[p1++];
            sum += visit[++p2];
            if (max < sum) {
                max = sum;
                answer = sum;
                count = 1;
            } else if (max == sum) count++;
        }
        if (max == 0) System.out.println("SAD");
        else System.out.println(answer + "\n" + count);
    }
}

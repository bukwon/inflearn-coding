package inflearn.myAlgorithmn.section3;

import java.util.Scanner;

public class step03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println(solution(n, k, num));
    }

    private static int solution(int n, int k, int[] num) {
        int answer = 0;
        int p1 = 0, p2 = k - 1;
        int max = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += num[i];
        }
        while(p2 < n - 1) {
            if (sum > max) {
                max = sum;
                answer = max;
            }
            sum -= num[p1++];
            sum += num[++p2];
        }
        return answer;
    }
}
package inflearn.inflearn.inflearn.section3;

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
        int answer = 0, sum = 0;
        for (int i = 0; i < k; i++) sum += num[i];
        answer = sum;
        for (int i = k; i < n; i++) {
            sum += (num[i] - num[i - k]);
            answer = Math.max(answer, sum);
        }
        return answer;
    }
}

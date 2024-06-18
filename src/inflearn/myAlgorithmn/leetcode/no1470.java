package inflearn.myAlgorithmn.leetcode;

import java.util.Scanner;

public class no1470 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] nums = new int[m];
        for (int i = 0; i < m; i++) {
            nums[i] = sc.nextInt();
        }
        int n = sc.nextInt();

        for (int i: solution(nums, n)) {
            System.out.print(i + " ");
        }
    }

    private static int[] solution(int[] nums, int n) {
        int[] answer = new int[nums.length];
        int j = 0;
        for (int i = 0; i < n; i ++) {
            answer[i + j + 1] = nums[n + j];  // 홀수 자리 집어넣기
            answer[i + j] = nums[i];    // 짝수 자리 집어넣기
            j++;
        }
        return answer;
    }
}

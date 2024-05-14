package inflearn.myAlgorithmn.baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class no12789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(arr, n));
    }

    private static String solution(int[] arr, int n) {
        String answer = "Nice";
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int[] person = new int[n + 1];
        int i = 0;  // arr 검사용
        int j = 0;  // person 칸 횟수
        while (true) {
            if (arr[i] == 0) {
                while (!stack.empty()) person[j++] = stack.pop();
                break;
            }
            if (arr[i] == j + 1) {
                person[j++] = arr[i++];
            } else {
                if (stack.peek() == j + 1) {
                    person[j] = stack.pop();
                    j++;
                } else stack.push(arr[i++]);
            }
        }
        for (int k = 0; k < n; k++) {
            if (person[k] != k + 1) {
                answer = "Sad";
                break;
            }
        }
        return answer;
    }
}
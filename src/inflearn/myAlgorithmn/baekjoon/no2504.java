package inflearn.myAlgorithmn.baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class no2504 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solution(s));
    }

    private static int solution(String s) {
        int answer = 0;
        int num = 1;
        Stack<Character> stack = new Stack<>();    // 괄호 검사용
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
                num *= 2;
            } else if (s.charAt(i) == '[') {
                stack.push(s.charAt(i));
                num *= 3;
            } else if (s.charAt(i) == ')') {
                if (stack.isEmpty() || stack.peek() != '(') return 0;
                else if (s.charAt(i - 1) == '(') {
                    answer += num;
                }
                stack.pop();
                num /= 2;
            } else if (s.charAt(i) == ']') {
                if (stack.isEmpty() || stack.peek() != '[') return 0;
                else if (s.charAt(i - 1) == '[') {
                    answer += num;
                }
                stack.pop();
                num /= 3;
            } else return 0;
        }
        if (!stack.isEmpty()) answer = 0;
        return answer;
    }
}

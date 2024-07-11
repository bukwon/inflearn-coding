package inflearn.myAlgorithmn.leetcode;

import java.util.Scanner;
import java.util.Stack;

public class no921 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solution(s));
    }

    private static int solution(String s) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for (char c: s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) answer ++;
                else stack.pop();
            }
        }
        return answer += stack.size();
    }
}

package inflearn.myAlgorithmn.section5;

import java.util.Scanner;
import java.util.Stack;

public class step04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solution(s));
    }

    private static int solution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (char c: s.toCharArray()) {
            if (Character.isDigit(c)) {
                int tmp = c - '0';
                stack.push(tmp);
            } else {
                int rt = stack.pop(), lt = stack.pop();
                if (c == '+') answer = rt + lt;
                else if (c == '-') answer = lt - rt;
                else if (c == '*') answer = rt * lt;
                else answer = lt / rt;

                stack.push(answer);
            }
        }
        return answer;
    }
}

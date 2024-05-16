package inflearn.myAlgorithmn.section5;

import java.util.Scanner;
import java.util.Stack;

public class step05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solution(s));
    }

    private static int solution(String s) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        String tmp = " " + s;
        char[] c = tmp.toCharArray();
        for (int i = 1; i < tmp.length(); i++) {
            if(c[i] == '(') {
                stack.push(c[i]);
            } else if (c[i] == ')') {
                stack.pop();
                if (c[i - 1] == '(') answer += stack.size();
                else answer++;
            }
        }
        return answer;
    }
}

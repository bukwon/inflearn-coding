package inflearn.myAlgorithmn.section5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class step02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solution(s));
    }

    private static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
            if(s.charAt(i) == ')') {
                while(stack.peek() != '(') stack.pop();
                stack.pop();
            }
        }

        while(!stack.isEmpty()) sb.append(stack.pop());
        sb.reverse();

        return String.valueOf(sb);
    }
}

package inflearn.myAlgorithmn.baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class no17413 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(solution(s));
    }

    private static String solution(String s) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        boolean check1 = false;
        s += ' ';
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '<') {
                while(!stack.isEmpty()) sb.append(stack.pop());
                sb.append(s.charAt(i));
                check1 = true;
            } else if(s.charAt(i) == '>') {
                sb.append(s.charAt(i));
                check1 = false;
            }
            else if(check1) {
                sb.append(s.charAt(i));
            } else{
                if(s.charAt(i) == ' ' || i == s.length()-1) {
                    while(!stack.isEmpty()) sb.append(stack.pop());
                    if(s.charAt(i) == ' ') sb.append(' ');
                    continue;
                }
                stack.add(s.charAt(i));
            }
        }
        return String.valueOf(sb);
    }
}

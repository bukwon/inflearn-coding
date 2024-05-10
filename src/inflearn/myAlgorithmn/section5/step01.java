package inflearn.myAlgorithmn.section5;

import java.util.Scanner;
import java.util.Stack;

public class step01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        System.out.println(soulution(s));
    }

    private static String soulution(String s) {
        Stack<Character> stack = new Stack<>();
        char[] c = s.toCharArray();
        for (char tmp: c) {
            if (tmp == '(') stack.push(tmp);
            else {
                if (stack.empty()) return "NO";
                stack.pop();
            }
        }
        if (stack.empty()) return "YES";
        else return "NO";
    }
}

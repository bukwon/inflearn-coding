package inflearn.myAlgorithmn.baekjoon;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class no4949 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<String> answer = new ArrayList<>();
        while(true) {
            String s = sc.nextLine();
            if(s.equals(".") && s.length() <= 1) break;
            arr.add(s);
        }
        for (String string : arr) {
            Stack<Character> stack = new Stack<>();
            String s = String.valueOf(string);
            String tmp = "yes";
            for (char c : s.toCharArray()) {
                if (c == '(') stack.push(c);
                else if (c == '[') stack.push(c);
                else if (c == ')') {
                    if (stack.empty() || stack.pop() != '(') {
                        tmp = "no";
                        break;
                    }
                } else if (c == ']') {
                    if (stack.empty() || stack.pop() != '[') {
                        tmp = "no";
                        break;
                    }
                }
            }
            if (!stack.empty()) tmp = "no";
            answer.add(tmp);
        }
        for (String s: answer) {
            System.out.println(s);
        }
    }
}

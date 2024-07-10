package inflearn.myAlgorithmn.leetcode;

import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Collectors;

public class no2390 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(removeStars(s));
    }

    private static String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()) {
            if (c == '*') stack.pop();
            else stack.add(c);
        }

        return stack.stream().map(String::valueOf).collect(Collectors.joining());
    }
}

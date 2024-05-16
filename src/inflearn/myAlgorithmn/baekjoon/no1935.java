package inflearn.myAlgorithmn.baekjoon;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class no1935 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        HashMap<Character, Double> map = new HashMap<>();
        double[] num = new double[n + 1];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        int i = 0;
        for (char c: s.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                if (map.containsKey(c)) continue;
                map.put(c, num[i++]);
            }
        }
        String answer = String.format("%.2f", solution(n, s, map));
        System.out.println(answer);
    }

    private static double solution(int n, String s, HashMap<Character, Double> map) {
        double answer = 0, lt = 0, rt = 0;;
        Stack<Double> stack = new Stack<>();
        for (char c: s.toCharArray()) {
            double tmp = 0;
            if(Character.isAlphabetic(c)) {
                stack.push(map.get(c));
            }
            else {
                rt = stack.pop(); lt = stack.pop();
                if (c == '+') tmp = lt + rt;
                else if (c == '-') tmp = lt - rt;
                else if (c == '*') tmp = lt * rt;
                else if (c == '/') tmp = lt / rt;
                stack.push(tmp);
            }
        }

        answer = stack.get(0);
        return answer;
    }
}

package inflearn.myAlgorithmn.leetcode;

import java.util.Scanner;

public class reNo1221 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solution(s));
    }

    private static int solution(String s) {
        int answer = 0;
        int tmp = 0;
        for (char c: s.toCharArray()) {
            if (c == 'L') tmp ++;
            else tmp --;

            if(tmp == 0) answer ++;
        }
        return answer;
    }
}

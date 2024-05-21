package inflearn.inflearn.inflearn.section5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class step07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(solution(s1, s2));
    }

    private static String solution(String s1, String s2) {
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();
        for (char x: s1.toCharArray()) Q.offer(x);
        for (char x: s2.toCharArray()) {
            if (Q.contains(x)) {
                if (x != Q.poll()) return "NO";
            }
        }
        if (!Q.isEmpty()) answer = "NO";
        return answer;
    }
}

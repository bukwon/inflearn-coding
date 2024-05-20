package inflearn.myAlgorithmn.section5;

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
        Queue<Character> queue = new LinkedList<>();
        char[] array = s2.toCharArray();
        for (char c: s1.toCharArray()) queue.offer(c);

        char tmp = queue.remove();
        for (int i = 0; i < array.length; i++) {
            if (queue.contains(array[i])) {
                answer = "NO";
                break;
            } else if (tmp == array[i]) {
                if (queue.isEmpty()) break;
                tmp = queue.remove();
            }
            if (i == array.length - 1) answer = "NO";
        }
        return answer;
    }
}

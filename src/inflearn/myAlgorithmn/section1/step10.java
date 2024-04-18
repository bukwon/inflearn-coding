package inflearn.myAlgorithmn.section1;

import java.util.ArrayList;
import java.util.Scanner;

public class step10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char t = sc.next().charAt(0);

        System.out.println(shortDistance(s, t));
    }

    private static String shortDistance(String s, char t) {
        ArrayList<Integer> answer = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        char[] c = s.toCharArray();
        int count = 1000;
        for (int i = 0; i < s.length(); i++) {
            count++;
            if (c[i] == t) count = 0;
            answer.add(count);
        }
        count = 1000;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (c[i] == t) {
                count = 0;
            } else {
                count++;
            }
            if (count < answer.get(i) || count == 0) answer.set(i, count);
        }
        for (int i: answer) {
            sb.append(i).append(" ");
        }
        return String.valueOf(sb);
    }
}

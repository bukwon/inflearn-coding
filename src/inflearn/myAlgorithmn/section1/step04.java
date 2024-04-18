package inflearn.myAlgorithmn.section1;

import java.util.ArrayList;
import java.util.Scanner;

public class step04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        for (String answer : reverse(s, n)) {
            System.out.println(answer);
        }
    }

    private static ArrayList<String> reverse(String[] s, int n) {
        ArrayList<String> answer = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            char[] c = s[i].toCharArray();
            while (count < s[i].length() / 2) {
                char tmp = c[count];
                c[count] = c[s[i].length() - 1 - count];
                c[s[i].length() - 1 - count] = tmp;
                count++;
            }
            answer.add(String.valueOf(c));
            count = 0;
        }
        return answer;
    }
}

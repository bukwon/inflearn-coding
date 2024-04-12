package inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class step04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for(int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        for(String answer: reverse(s)) {
            System.out.println(answer);
        }
    }
    static ArrayList<String> reverse(String[] s) {
        ArrayList<String> answer = new ArrayList<>();
        for(String x: s) {
            char[] c = x.toCharArray();
            int start = 0; int end = x.length()-1;
            while(start < end) {
                char tmp = c[start];
                c[start] = c[end];
                c[end] = tmp;
                start++;
                end--;
            }
            String tmp = String.valueOf(c);
            answer.add(tmp);
        }
        return answer;
    }
}

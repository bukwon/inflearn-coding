package inflearn.myAlgorithmn.section1;

import java.util.Scanner;

public class step06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(duplication(s));
    }

    private static String duplication(String s) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {  //indexOf(charAt())
            if (s.indexOf(s.charAt(i)) == i) answer += s.charAt(i);
        }
        return answer;
    }
}

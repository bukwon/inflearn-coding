package inflearn.inflearn.section1;

import java.util.Scanner;

public class step07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(check(str));
    }

    private static String check(String str) {
        String answer = "YES";
        String tmp = new StringBuilder(str).reverse().toString();
        if (!str.equalsIgnoreCase(tmp)) return "NO";
        /*str = str.toUpperCase();
        int len = str.length();
        for (int i = 0; i < len/2; i++) {
            if(str.charAt(i) != str.charAt(len -1 -i)) return "NO";
        }*/
        return answer;
    }
}

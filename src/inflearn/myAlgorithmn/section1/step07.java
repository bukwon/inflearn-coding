package inflearn.myAlgorithmn.section1;

import java.util.Scanner;

public class step07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(palindrome(s));
    }

    private static String palindrome(String s) {
        s= s.toLowerCase();
        char[] c = s.toCharArray();
        int start = 0; int end = s.length()-1;
        while(start < end) {
            if(c[start] != c[end]) return "NO";
            start++;
            end--;
        }
        return "YES";
    }
}

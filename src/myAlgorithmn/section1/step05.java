package myAlgorithmn.section1;

import java.util.Scanner;

public class step05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(special(s));
    }

    private static String special(String s) {
        char[] c = s.toCharArray();
        int start = 0; int end = s.length() - 1;
        while(start < end) {
            if(!Character.isAlphabetic(c[start])) start++;
            else if (!Character.isAlphabetic(c[end])) end--;
            else {
                char tmp = c[end];
                c[end] = c[start];
                c[start] = tmp;
                start ++;
                end --;
            }
        }
        return String.valueOf(c);
    }
}

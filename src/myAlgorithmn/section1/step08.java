package myAlgorithmn.section1;

import java.util.Scanner;

public class step08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(palindrome(s));
    }

    private static String palindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z]", "");
        StringBuilder sb = new StringBuilder(s).reverse();
        if (s.equals(String.valueOf(sb))) return "YES";
        return "NO";
    }
}

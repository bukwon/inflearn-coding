package myAlgorithmn.section1;

import java.util.Scanner;

public class step09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(onlyNumber(s));
    }

    private static Integer onlyNumber(String s) {
        s = s.replaceAll("[^0-9]", "");
        return Integer.parseInt(s);
    }
}

package inflearn.inflearn.inflearn.section1;

import java.util.Scanner;

public class step09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(onlyNumber(str));
    }

    private static int onlyNumber(String str) {
        String answer = "";
        for (char x: str.toCharArray()) {
            if (Character.isDigit(x)) answer += x;//answer = answer * 10 + (x-48);
        }
        return Integer.parseInt(answer);
    }
}

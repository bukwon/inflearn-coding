package inflearn.inflearn.inflearn.section1;

import java.util.Scanner;

public class step06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(redundancy(str));
    }

    private static String redundancy(String str) {
        String answer = "";
        for (int i = 0; i < str.length() ; i++) {
            if(str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
        }
        return answer;
    }
}

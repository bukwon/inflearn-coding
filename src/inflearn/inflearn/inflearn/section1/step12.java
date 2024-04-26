package inflearn.inflearn.inflearn.section1;

import java.util.Scanner;

public class step12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(password(n, str));
    }

    private static String password(int n, String str) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp,2);
            System.out.println(tmp + " " + num);
            answer += (char)num;
            str = str.substring(7);
        }
        return answer;
    }
}
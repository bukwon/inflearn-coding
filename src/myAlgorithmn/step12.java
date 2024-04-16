package myAlgorithmn;

import java.util.Scanner;

public class step12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String s = sc.next();
        System.out.println(password(s, num));
    }

    private static String password(String s, int num) {
        String[] tmp = new String[num];
        StringBuilder sb = new StringBuilder();
        int calc = 0;
        for (int i = 0; i < num; i++) {
            tmp[i] = s.substring(i*7, (i+1)*7);
        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 7; j++) {
                if(tmp[i].charAt(j) == '#') calc += (int) Math.pow(2, 6-j);
            }
            sb.append((char) calc);
            calc = 0;
        }
        return String.valueOf(sb);
    }
}
package myAlgorithmn;

import java.util.Scanner;

public class step11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(compression(s));
    }

    private static String compression(String s) {
        StringBuilder sb = new StringBuilder();
        char[] c = s.toCharArray();
        char tmp = '1';
        int count = 0;
        boolean flag;
        for (int i = 0; i < s.length(); i++) {
            if(tmp == c[i]) {
                count ++;
                flag = false;
            }else {
                if (count > 1) sb.append(count);
                count = 1;
                flag = true;
            }
            if(!flag) continue;
            tmp = c[i];
            sb.append(tmp);
        }
        if (count > 1) sb.append(count);
        return String.valueOf(sb);
    }
}

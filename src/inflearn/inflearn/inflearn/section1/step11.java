package inflearn.inflearn.inflearn.section1;

import java.util.Scanner;

public class step11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(compression(s));
    }

    private static String compression(String s) {
        String answer="";
        s=s+" ";
        int cnt = 1;
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i) == s.charAt(i+1)) cnt++;
            else {
                answer += s.charAt(i);
                if (cnt > 1) answer += String.valueOf(cnt);
                cnt = 1;
            }
        }
        return answer;
    }
}

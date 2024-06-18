package inflearn.myAlgorithmn.leetcode;

import java.util.Scanner;

public class no1529 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String target = sc.next();
        System.out.println(solution(target));
    }

    private static int solution(String target) {
        int answer = 0;
        char[] tmp = new char[target.length()];
        String check = "";  // while 문에서 target과 같은지 확인하는 용도
        for (int i = 0; i < target.length(); i++) {
            tmp[i] += '0';
            check += "0";
        }
        while(!check.equals(target)) {
            boolean flag = false; // 끝 값이 서로 다른 경우
            if (check.charAt(target.length() - 1) == target.charAt(target.length() - 1)) flag = true;
            for (int i = target.length() - 1; i >= 0; i--) {
                if (flag) {
                    if (check.charAt(i) != target.charAt(i)) flag = false;

                    if (check.charAt(i) == '0') tmp[i] = '1';
                    else tmp[i] = '0';

                    if (!flag) break;
                } else {
                    if (check.charAt(i) == '0') tmp[i] = '1';
                    else tmp[i] = '0';

                    if (i > 0 && check.charAt(i - 1) == target.charAt(i - 1)) break;
                }
            }
            check = "";
            for (char c: tmp) {
                check += c;
            }
            answer ++;
        }
        return answer;
    }
}

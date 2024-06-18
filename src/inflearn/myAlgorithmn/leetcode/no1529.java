package inflearn.myAlgorithmn.leetcode;

import java.util.Scanner;

public class no1529 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String target = sc.next();
        System.out.print(solution(target));
    }

    private static int solution(String target) {
        int answer = 0;
        char check = '0';
        for (int i = 0; i < target.length(); i++) {
            if (target.charAt(i) != check) {
                answer ++;
                check = target.charAt(i);
            }
        }
        return answer;
    }



    /*private static int solution(String target) {
        int answer = 0;
        int countNum = 0;   // 연속적인 1의 수를 세기 위함
        boolean flag = true; // 1과 0 교차 바꾸기 위한 변수 (false일 때 0, true면 1)
        char[] tmp = new char[target.length()];
        String check = "";  // while 문에서 target과 같은지 확인하는 용도

        for (int i = 0; i < target.length(); i++) {
            tmp[i] = '0';
            check += "0";
            if (target.charAt(target.length() - i - 1) == '1') countNum = target.length() - i - 1;
        }

        int j = 0;  // 0과 1의 자리 추적
        while (!target.equals(check)) {
            check = "";
            for (int i = target.length() - 1; i >= countNum; i--) {
                if (flag) {
                    tmp[i] = '1';
                    if (target.charAt(i) == '0') j = i;
                }
                else {
                    tmp[i] = '0';
                    if (target.charAt(i) == '1') j = i;
                }
            }

            for (char c: tmp) check += c;

            flag = !flag;
            countNum = j;
            answer ++;
        }
        return answer;
    }*/
}


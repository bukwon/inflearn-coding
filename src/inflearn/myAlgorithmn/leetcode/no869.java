package inflearn.myAlgorithmn.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class no869 {
    static boolean c[];
    static int a[];
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(reorederedPowerOf2(n));
    }

    private static boolean reorederedPowerOf2(int n) {
        char[] num = String.valueOf(n).toCharArray();
        Arrays.sort(num);
        for (int i = 0; i < 30; i++) {
            int tmp = (int) Math.pow(2, i);
            char[] tmpNum = String.valueOf(tmp).toCharArray();
            Arrays.sort(tmpNum);
            if (Arrays.equals(tmpNum, num)) return true;
        }
        return false;
    }

    /*public boolean reorderedPowerOf2(int n) {
        boolean answer = false;
        int tmp;
        // n을 입력받은 걸 하나씩 다 떼어놓은 다음에 하나 씩 존재하는지 여부 확인

        StringBuilder sb = new StringBuilder(String.valueOf(n));
        if (sb.toString().contains("0")) return false;

        int i = 0;
        String s = "";

        while((int)Math.pow(2.0, (double) i) <= 1000000000 && !answer) {
            tmp = (int)Math.pow(2.0, (double) i);
            s = String.valueOf(tmp);
            i ++;
            boolean flag = true;
            if (sb.toString().length() < s.length()) break;
            else {
                for (char c: String.valueOf(n).toCharArray()) {
                    if (!s.contains(String.valueOf(c))) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) answer = true;
        }
        return answer;
    }*/
}



package inflearn.inflearn.inflearn.section6;

import java.util.Arrays;
import java.util.Scanner;

public class step05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] number = new int[n];
        for (int i = 0; i < n; i++) number[i] = sc.nextInt();
        Arrays.sort(number);
        System.out.println(solution(number, n));
    }

    private static String solution(int[] number, int n) {
        String answer = "U";
        for (int i = 0; i < n - 1; i++) {
            if (number[i] == number[i + 1]) return "D";
        }
        return answer;
    }
}

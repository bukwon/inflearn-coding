package inflearn.reTest.section2;

import java.util.Scanner;

public class step02Re {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] student = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            student[i] = sc.nextInt();
        }
        System.out.println(height(student, n));
    }

    private static int height(int[] student, int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            boolean flag = true;
            for (int j = 0; j < i; j++) {
                if (student[i] <= student[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) answer++;
        }
        return answer;
    }
}

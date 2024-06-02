package inflearn.myAlgorithmn.section6;

import java.util.Arrays;
import java.util.Scanner;

public class step06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] student = new int[n];
        int[] tmp = new int[n];
        for (int i = 0; i < n; i++) {
            student[i] = sc.nextInt();
            tmp[i] = student[i];
        }
        Arrays.sort(student);
        System.out.println(solution(n, student, tmp));
    }

    private static String solution(int n, int[] student, int[] tmp) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n; i++) if (student[i] != tmp[i]) answer.append(String.valueOf(i + 1)).append(" ");
        return answer.toString();
    }
}

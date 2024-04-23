package inflearn.myAlgorithmn.section2;

import java.util.Scanner;

public class step11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] student = new int[n][5];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                student[i][j] = sc.nextInt();
            }
        }
        System.out.println(classMonitor(student, n));
    }

    private static int classMonitor(int[][] student, int n) {
        int answer = 1;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 5; k++) {
                    if (i == j) break;
                    if (student[i][k] == student[j][k]) {
                        count ++;
                        break;
                    }
                }
            }
            if (max < count) {
                answer = i + 1;
                max = count;
            }
        }
        return answer;
    }
}

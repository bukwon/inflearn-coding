package inflearn.myAlgorithmn.section6;

import java.util.Scanner;

public class step02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        solution(num, n);
        for (int i: num) {
            System.out.print(i + " ");
        }
    }

    private static void solution(int[] num, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (num[j] > num[j + 1]) {
                    int tmp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = tmp;
                }
            }
        }
    }
}

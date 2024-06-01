package inflearn.myAlgorithmn.section6;

import java.util.Scanner;

public class step03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] sort = new int[n];
        for (int i = 0; i < n; i++) sort[i] = sc.nextInt();
        solution(n, sort);
        for (int i: sort) {
            System.out.print(i + " ");
        }
    }

    private static void solution(int n, int[] sort) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j >= 1; j--) {
                if (sort[j] < sort[j - 1]) {
                    int tmp = sort[j];
                    sort[j] = sort[j - 1];
                    sort[j - 1] = tmp;
                }
            }
        }
    }
}

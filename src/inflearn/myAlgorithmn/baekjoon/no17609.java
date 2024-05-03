package inflearn.myAlgorithmn.baekjoon;

import java.util.Scanner;

public class no17609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        for (int i: solution(n, arr)) {
            System.out.println(i);
        }
    }

    private static int[] solution(int n, String[] arr) {

        return new int[0];
    }
}

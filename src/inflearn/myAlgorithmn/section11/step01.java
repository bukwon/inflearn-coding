package inflearn.myAlgorithmn.section11;

import java.util.Scanner;

public class step01 {
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        arr = new int[N];
        Fibo(N);
        int answer = arr[N - 1];
        System.out.println(answer);
    }

    private static void Fibo(int n) {
        arr[0] = 1;
        arr[1] = 2;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
    }
}
// 1 2 3 5 8 13 21
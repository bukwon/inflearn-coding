package inflearn.myAlgorithmn.section11;

import java.util.Scanner;

public class step02 {
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n + 1];

        Fibo(n);

        System.out.println(arr[n]);
    }

    private static void Fibo(int n) {
        arr[0] = 1;
        arr[1] = 2;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
    }
}

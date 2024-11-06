package inflearn.myAlgorithmn.section11;

import java.util.Scanner;

public class step02_1 {
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n + 1];
        int answer = Fibo(n);
        System.out.println(answer);
    }

    private static int Fibo(int n) {
        if (n == 0) return 1;
        if (n == 1) return 2;
        return Fibo(n - 1) + Fibo(n - 2);
    }
}

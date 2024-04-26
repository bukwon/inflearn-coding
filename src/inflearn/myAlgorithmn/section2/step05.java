package inflearn.myAlgorithmn.section2;

import java.util.Scanner;

public class step05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Eratosthenes(n));
    }

    private static int Eratosthenes(int n) {
        int answer = 0;
        int[] tmp = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            if(tmp[i] == 0) answer++;   // 2,3 배수 처리 후 5 처리 가능
            for (int j = i; j <= n; j+=i) {
                tmp[j] = 1;
            }
        }
        return answer;
    }
}

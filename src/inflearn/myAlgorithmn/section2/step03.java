package inflearn.myAlgorithmn.section2;

import java.util.Scanner;

public class step03 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        for (char c: rspGame(n)) {
            System.out.println(c);
        }
    }

    private static char[] rspGame(int n) {
        int[] A = new int[n];
        int[] B = new int[n];
        char[] result = new char[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
            if((A[i] == 1 && B[i] == 3) || (A[i] == 2 && B[i] == 1) || (A[i] == 3 && B[i] == 2)) result[i] = 'A';
            else if (A[i] == B[i]) result[i] = 'D';
            else result[i] = 'B';
        }
        return result;
    }
}

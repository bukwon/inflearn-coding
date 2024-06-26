package inflearn.reTest.section2;

import java.util.Scanner;

public class step03re {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }
        for (char s: solution(A, B, n)) {
            System.out.println(s);
        }
    }

    private static char[] solution(int[] A, int[] B, int n) {
        char[] answer = new char[n];
        for (int i = 0; i < n; i++) {
            if((A[i] == 1 && B[i] == 3) || (A[i] == 2 && B[i] == 1) || (A[i] == 3 && B[i] == 2)) answer[i] = 'A';
            else if((A[i] == 3 && B[i] == 1) || (A[i] == 2 && B[i] == 3) || (A[i] == 1 && B[i] == 2)) answer[i] = 'B';
            else answer[i] = 'D';
        }
        return answer;
    }
}
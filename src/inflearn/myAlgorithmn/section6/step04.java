package inflearn.myAlgorithmn.section6;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class step04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] work = new int[m];

        for (int i = 0; i < m; i++) {
            work[i] = sc.nextInt();
        }

        for (int i: solution(n, m, work)) {

        }
    }

    private static int[] solution(int n, int m, int[] work) {
        int[] answer = new int[n];
        Deque<Integer> Q = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = answer.length - 1; j >= 0; j--) {
                if (answer[j] == work[i]) {
                    for (int k = j; k < m; k++) {

                    }
                }
            }
        }


        return new int[0];
    }
}

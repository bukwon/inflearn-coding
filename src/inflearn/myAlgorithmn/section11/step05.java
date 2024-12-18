package inflearn.myAlgorithmn.section11;

import java.util.*;

public class step05 {
    static Integer[] coin;
    static int answer = Integer.MAX_VALUE, check = 0;
    static int N, M;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        coin = new Integer[N];

        for (int i = 0; i < N; i++) {
            coin[i] = sc.nextInt();
        }

        M = sc.nextInt();
        Arrays.sort(coin, Comparator.reverseOrder());

        solution(0);

        System.out.println(answer);
    }

    private static void solution(int limit) {
        for (int i = 0; i < N; i++) {
            while(limit < M) {
                limit += coin[i];
                check++;
            }
            if (limit == M) answer = Math.min(answer, check);

        }
    }
}

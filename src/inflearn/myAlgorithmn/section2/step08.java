package inflearn.myAlgorithmn.section2;

import java.util.Scanner;

public class step08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] score = new int[n];
        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
        }
        for (int i : rank(score, n)) {
            System.out.print(i + " ");
        }
    }

    private static int[] rank(int[] score, int n) {
        int[] answer = new int[n];
        int count = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (score[i] < score[j]) count++;
            }
            answer[i] = count;
            count = 1;
        }
        return answer;
    }
}

// 이따 강의 듣기
package inflearn.myAlgorithmn.section9;

import java.util.Scanner;

public class step01 {
    static int[][] athlete;
    static boolean flag;
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        athlete = new int[N][2];
        for (int i = 0; i < N; i++) {
            athlete[i][0] = sc.nextInt();
            athlete[i][1] = sc.nextInt();
        }
        System.out.println(greedy());
    }

    private static int greedy() {
        int answer = 0;
        for (int i = 0; i < N; i++) {
            flag = false;
            for (int j = 0; j < N; j++) {
                if (i != j && athlete[i][0] < athlete[j][0] && athlete[i][1] < athlete[j][1]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) answer ++;
        }
        return answer;
    }
}

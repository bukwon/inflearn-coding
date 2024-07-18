package inflearn.myAlgorithmn.section8;

import java.util.Scanner;

public class step02 {
    static int answer = 0;
    static int MaxWeight = 0;
    static int C;
    static int N;
    static Integer[] weight;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        C = sc.nextInt();
        N = sc.nextInt();
        weight = new Integer[N];
        for (int i = 0; i < N; i++) weight[i] = sc.nextInt();

        DFS(0);

        System.out.println(MaxWeight);
    }

    private static void DFS(int v) {

        if (answer > C) return;
        if (MaxWeight < answer) MaxWeight = answer;;

        for (int i = v; i < N; i++) {
            answer += weight[i];
            DFS(i + 1);
            answer -= weight[i];
        }
    }
}

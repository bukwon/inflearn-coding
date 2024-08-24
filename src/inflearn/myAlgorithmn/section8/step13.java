package inflearn.myAlgorithmn.section8;

import java.util.Scanner;

public class step13 {
    static int[][] island;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, -1, -1, -1, 0, 1, 1, 1};
    static int answer = 0;
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        island = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                island[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (island[i][j] == 0) continue;
                answer ++;
                DFS(i, j);
            }
        }

        System.out.println(answer);
    }

    private static void DFS(int x, int y) {
        for (int i = 0; i < 8; i++) {
            int cx = x + dx[i];
            int cy = y + dy[i];
            if (cx >= 0 && cx < N && cy >= 0 && cy < N && island[cx][cy] == 1) {
                island[cx][cy] = 0;
                DFS(cx, cy);
            }
        }
    }
}

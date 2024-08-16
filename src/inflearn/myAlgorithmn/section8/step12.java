package inflearn.myAlgorithmn.section8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class step12 {
    static Queue<Point> queue = new LinkedList<Point>();
    static int checkTomato = 0, answer = 0;
    static int M, N;
    static int[][] tomato;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();
        N = sc.nextInt();
        boolean rotten = false;
        tomato = new int[N + 1][M + 1];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                tomato[i][j] = sc.nextInt();
                if (tomato[i][j] == 1) {
                    queue.add(new Point(i, j));
                    rotten = true;
                }
            }
        }
        if (!queue.isEmpty()) BFS();
        if (!rotten) answer = -1;
        System.out.println(answer);
    }

    private static void BFS() {
        while (true) {
            int count = 0;
            int endPoint = queue.size();

            while (count < endPoint) {
                Point tmp = queue.remove();
                count++;

                for (int i = 0; i < 4; i++) {
                    int nx = tmp.x + dx[i];
                    int ny = tmp.y + dy[i];
                    if (nx >= 0 && nx < N && ny >= 0 && ny < M && tomato[nx][ny] == 0) {
                        tomato[nx][ny] = 1;
                        queue.add(new Point(nx, ny));
                    }
                }
                if (queue.isEmpty()) return;
            }
            answer++;
        }
    }
}

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

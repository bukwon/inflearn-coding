package inflearn.myAlgorithmn.section9;

import java.util.Scanner;

public class step02 {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {-1, 0, 1, 0};
    static int hor;
    static int ver;
    static int answer = 0;
    static int[] standard = {0, 0};
    static int come = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        Solution(grid, a, b);
    }

    private static void Solution(int[][] grid, int a, int b) {
        int nx = 0, ny = 0;
        boolean flag = false;
        hor = grid[0].length;
        ver = grid.length;
        for (int i = 0; i < ver; i++) {
            for (int j = 0; j < hor; j++) {
                if (grid[i][j] == 1) {
                    nx = j;
                    ny = i;
                    standard[0] = nx;
                    standard[1] = ny;
                    DFS(nx, ny, grid, a, b);
                    flag = true;
                    break;
                }
            }
            if (flag) break;
        }
        System.out.println(answer - come);
    }

    private static void DFS(int nx, int ny, int[][] grid, int a, int b) {
        for (int i = 0; i < 4; i++) {
            int x = nx + dx[i];
            int y = ny + dy[i];
            if (x >= 0 && x < ver && y >= 0 && y < hor && grid[y][x] > 1) {
                int count = Math.abs(x + y - standard[0] - standard[1]);
                if (grid[y][x] == 2) {
                    come = (a * count);
                    answer += (b * count) + come;
                }
                grid[y][x] = 0;
                DFS(x, y, grid, a, b);
            }
        }
        grid[ny][nx] = 3;
    }
}

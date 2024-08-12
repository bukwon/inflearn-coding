package inflearn.myAlgorithmn.section8;

import java.util.Scanner;

public class step10 {
    static int answer = 0;
    static int[][] miro = new int[9][9];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i == 0 || i == 8 || j == 0 || j == 8) {
                    miro[i][j] = 1;
                    continue;
                }
                miro[i][j] = sc.nextInt();
            }
        }
        DFS(1, 1);
        System.out.println(answer);
    }

    private static void DFS(int x, int y) {
        if (x == 7 && y == 7) answer ++;
        else {
            if (miro[x][y + 1] == 0) { // 우 확인
                miro[x][y] = 1;
                DFS(x, y + 1);
                miro[x][y] = 0;
            }
            if (miro[x + 1][y] == 0) { // 하 확인
                miro[x][y] = 1;
                DFS(x + 1, y);
                miro[x][y] = 0;
            }
            if (miro[x][y - 1] == 0) { // 좌 확인
                miro[x][y] = 1;
                DFS(x, y - 1);
                miro[x][y] = 0;
            }
            if (miro[x - 1][y] == 0) { // 상 확인
                miro[x][y] = 1;
                DFS(x - 1, y);
                miro[x][y] = 0;
            }
        }
    }
}
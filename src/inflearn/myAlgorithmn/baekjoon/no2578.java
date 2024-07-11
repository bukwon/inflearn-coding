package inflearn.myAlgorithmn.baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class no2578 {
    static StringTokenizer st;
    static BufferedReader bf;
    static BufferedWriter bw;
    static int[][] bingo;
    static int pass = 0;
    static boolean flag;

    public static void main(String[] args) throws IOException {
        bf = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bingo = new int[5][5];

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(bf.readLine());
            for (int j = 0; j < 5; j++) {
                bingo[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(bingoGame());
    }

    private static int bingoGame() throws IOException {
        int answer = 0;

        do {
            for (int i = 0; i < 5; i++) {
                st = new StringTokenizer(bf.readLine());
                int num;
                for (int j = 0; j < 5; j++) {
                    num = Integer.parseInt(st.nextToken());

                    check(num);
                    answer++;
                    if (flag) break;
                }
                if (flag) break;
            }
        } while (!flag);
        return answer;
    }

    private static void check(int num) {
        for (int k = 0; k < 5; k++) {
            for (int l = 0; l < 5; l++) {
                if (bingo[k][l] == num) {
                    bingo[k][l] = 0;
                    flag = true;
                    break;
                }
            }
            if (flag) break;
        }
        flag = false;
        checkLine();
    }

    private static void checkLine() {
        int axis1 = 0, axis2 = 0;

        for (int i = 0; i < 5; i++) {
            int vertical = 0, horizontal = 0;
            for (int j = 0; j < 5; j++) {
                if (i == j && bingo[i][j] == 0) axis1++;
                if (5 - i - 1 == j && bingo[i][j] == 0) axis2++;
                if (bingo[i][j] == 0) vertical++;
                if (bingo[j][i] == 0) horizontal++;
            }
            if (vertical == 5 && horizontal == 5) pass++;
            if (pass >= 3) return;
        }
        if (axis1 == 5) pass++;
        if (axis2 == 5) pass++;
    }
}

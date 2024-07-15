package inflearn.myAlgorithmn.baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class no2578 {
    static StringTokenizer st;
    static BufferedReader bf;
    static BufferedWriter bw;
    static int[][] bingo;
    static int pass = 0;
    static boolean flag;
    static ArrayList<Integer> total = new ArrayList<>();

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
        checkVertical();
        checkHorizontal();
        checkAxis1();
        checkAxis2();
        if (pass >= 3) flag = true;
        else pass = 0;
    }

    private static void checkVertical() {
        for (int i = 0; i < 5; i++) {
            int check = 0;
            for (int j = 0; j < 5; j++) {
                if (bingo[i][j] == 0) {
                    check ++;
                }
            }
            if (check == 5) pass++;
        }
    }
    private static void checkHorizontal() {
        for (int i = 0; i < 5; i++) {
            int check = 0;
            for (int j = 0; j < 5; j++) {
                if (bingo[j][i] == 0) {
                    check ++;
                }
            }
            if (check == 5) pass++;
        }
    }
    private static void checkAxis1() {
        int check = 0;
        for (int i = 0; i < 5; i++) {
            if (bingo[i][i] == 0) {
                check ++;
            }
        }
        if (check == 5) pass++;
    }
    private static void checkAxis2() {
        int check = 0;
        for (int i = 0; i < 5; i++) {
            if (bingo[i][4 - i] == 0) {
                check ++;
            }
        }
        if (check == 5) pass++;
    }
}

/*private static void checkLine() {
        ArrayList<Integer> axis1 = new ArrayList<>();
        ArrayList<Integer> axis2 = new ArrayList<>();
        ArrayList<Integer> vertical; ArrayList<Integer> horizontal;

        for (int i = 0; i < 5; i++) {
            vertical = new ArrayList<>(); horizontal = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                if (i == j && bingo[i][j] == 0) {
                    if (!axis1.contains(bingo[i][j])) axis1.add(bingo[i][j]);
                }
                if (5 - i - 1 == j && bingo[i][j] == 0) {
                    if (!axis2.contains(bingo[i][j])) axis2.add(bingo[i][j]);
                }
                if (bingo[i][j] == 0) {
                    if (!total.contains(bingo[i][j])) vertical.add(bingo[i][j]);
                    if (vertical.size() == 5) {
                        total.addAll(vertical);
                        pass++;
                    }
                }
                if (bingo[j][i] == 0) {
                    if (!horizontal.contains(bingo[j][i])) horizontal.add(bingo[j][i]);
                    if (horizontal.size() == 5) {
                        total.addAll(horizontal);
                        pass++;
                    }
                }
            }
            if (pass >= 3) {
                flag = true;
                return;
            }
        }
        if (axis1.size() == 5) {
            total.addAll(axis1);
            pass++;
        }
        if (axis2.size() == 5) {
            total.addAll(axis2);
            pass++;
        }
        if (pass >= 3) flag = true;
    }*/
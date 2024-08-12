package inflearn.inflearn.inflearn.section8;

import java.util.Scanner;

public class step10 {
    static int answer = 0;
    static int[][] miro = new int[7][7];
    static int[][] tmpMiro = new int[7][7];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                miro[i][j] = sc.nextInt();
            }
        }
        tmpMiro = miro;
        tmpMiro[0][0] = 1;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(miro[i][j] + " ");
            }
            System.out.println();
        }
    }
}
package inflearn.myAlgorithmn.baekjoon;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class no16918 {
    static char[][] afterMap, answerMap;
    static int R, C, N;
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        R = sc.nextInt();
        C = sc.nextInt();
        N = sc.nextInt();
        char[][] beforeMap = new char[R + 2][C + 2];
        afterMap = new char[R + 2][C + 2];
        answerMap = new char[R + 2][C + 2];

        for (int i = 1; i <= R; i++) {
            String s = sc.next();
            for (int j = 1; j <= C; j++) {
                afterMap[i][j] = s.charAt(j - 1);
                beforeMap[i][j] = 'O';
            }
        }

        Bomb(beforeMap);

        for (int i = 1; i <= R; i++) {
            for (int j = 1; j <= C; j++) {
                System.out.print(answerMap[i][j]);
            }
            System.out.println();
        }
    }

    private static void Bomb(char[][] beforeMap) {
        int time = 0;
        if (N % 2 == 0) {
            for (int i = 0; i < beforeMap.length; i++) {
                answerMap[i] = beforeMap[i].clone();
            }
        } else {
            while (time < N / 2) {
                char[][] tmpArray = new char[beforeMap.length][];
                for (int i = 0; i < beforeMap.length; i++) {
                    tmpArray[i] = beforeMap[i].clone();
                }
                for (int i = 1; i <= R; i++) {
                    for (int j = 1; j <= C; j++) {
                        if (afterMap[i][j] == 'O') {
                            tmpArray[i][j] = '.';
                            tmpArray[i - 1][j] = '.';
                            tmpArray[i + 1][j] = '.';
                            tmpArray[i][j - 1] = '.';
                            tmpArray[i][j + 1] = '.';
                        }
                    }
                }
                afterMap = new char[tmpArray.length][];
                for (int i = 0; i < tmpArray.length; i++) {
                    afterMap[i] = tmpArray[i].clone();
                }
                time++;
            }
            answerMap = new char[afterMap.length][];
            for (int i = 0; i < afterMap.length; i++) {
                answerMap[i] = afterMap[i].clone();
            }
        }
    }
}

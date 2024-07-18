package inflearn.myAlgorithmn.section8;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class step03 {
    static int N;
    static int M;
    static int[][] problem;
    static int answer = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        problem = new int[N][2];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(bf.readLine());
            problem[i][0] = Integer.parseInt(st.nextToken());
            problem[i][1] = Integer.parseInt(st.nextToken());
        }
        DFS(0, 0, 0);
        bw.write(answer + "");
        bw.flush(); bw.close(); bf.close();
    }

    private static void DFS(int v, int score, int time) {
        if (time > M) return;
        if (v == N) answer = Math.max(answer, score);
        else {
            DFS(v + 1, score + problem[v][0], time + problem[v][1]);
            DFS(v + 1, score, time);
        }
    }
}

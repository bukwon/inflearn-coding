package inflearn.myAlgorithmn.baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class no22858 {
    static int[] S;
    static int[] D;
    static int n;
    static int k;
    static int[] answer;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(bf.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        S = new int[n];
        D = new int[n];
        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(bf.readLine());
            for (int j = 0; j < n; j++) {
                if (i == 0) S[j] = Integer.parseInt(st.nextToken());
                else D[j] = Integer.parseInt(st.nextToken());
            }
        }
        solution();
        StringBuilder sb = new StringBuilder();
        for (int i: answer) sb.append(i).append(" ");
        bw.write(sb + "");
        bw.flush(); bw.close(); bf.close();
    }

    private static void solution() {
        answer = S.clone();
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                answer[D[j] - 1] = S[j];
            }
            S = answer.clone();
        }
    }
}

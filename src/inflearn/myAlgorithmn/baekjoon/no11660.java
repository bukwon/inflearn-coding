package inflearn.myAlgorithmn.baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class no11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] table = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(bf.readLine());
            for (int j = 1; j <= n; j++) {
                table[i][j] = Integer.parseInt(st.nextToken()) + table[i][j - 1];
            }
        }

        int answer = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(bf.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            int num3 = Integer.parseInt(st.nextToken());
            int num4 = Integer.parseInt(st.nextToken());
            answer = 0;
            for (int j = num1; j <= num3; j++) {
                answer = answer + (table[j][num4]) - table[j][num2 - 1];
            }
            sb.append(answer).append("\n");
        }
        bw.write(sb + "\n");
        bw.flush(); bw.close(); bf.close();
    }
}

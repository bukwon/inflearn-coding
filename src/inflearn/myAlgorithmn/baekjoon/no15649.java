package inflearn.myAlgorithmn.baekjoon;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class no15649 {
    static boolean[] visit;
    public static int[] arr;
    static BufferedReader bf;
    static BufferedWriter bw;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        bf = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        visit = new boolean[n];
        arr = new int[m];
        dfs(n, m, 0);
        bw.write(sb + "");
        bw.flush();
        bf.close();
        bw.close();
    }

    private static void dfs(int n, int m, int depth) {   // num1은 배열 체크, num2는 개수 체크
        if (depth == m) {
            for (int val: arr) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[depth] = i + 1;
                dfs(n, m, depth + 1);
                visit[i] = false;
            }

        }
    }
}

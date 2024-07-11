package inflearn.myAlgorithmn.baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class no15651 {
    static int[] arr;
    static boolean[] visit;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        sb = new StringBuilder();
        arr = new int[m];
        visit = new boolean[n];
        backTracking(n, m, 0, 0);

        bw.write(sb + "");
        bw.flush(); bw.close(); bf.close();
    }

    private static void backTracking(int n, int m, int depth, int startIdx) {
        if (depth == m) {
            for (int i: arr) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
        }

        for (int i = startIdx; i < n; i++) {
            arr[depth] = i + 1;
            backTracking(n , m, i + 1, i + 1);
        }
    }
}

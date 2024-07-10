package inflearn.myAlgorithmn.baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no15657 {
    static int[] sequence;
    static int[] arr;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        sequence = new int[n];
        arr = new int[m];
        sb = new StringBuilder();
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) sequence[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(sequence);

        backTracking(n, m, 0, 0);
        bw.write(sb + "");
        bw.flush(); bw.close(); bf.close();
    }

    private static void backTracking(int n, int m, int depth, int startIdx) {
        if (depth == m) {
            Arrays.sort(arr);
            for (int i: arr) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = startIdx; i < n; i++) {
            arr[depth] = sequence[i];
            backTracking(n, m, depth + 1, i);
        }
    }
}

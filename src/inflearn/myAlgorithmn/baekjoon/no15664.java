package inflearn.myAlgorithmn.baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class no15664 {
    static int[] sequence;
    static int[] arr;
    static boolean[] visit;
    static LinkedHashSet<String> LHS;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new int[m];
        sequence = new int[n];
        visit = new boolean[n];
        LHS = new LinkedHashSet<String>();

        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) sequence[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(sequence);

        backTracking(n, m, 0, 0);

        for (String s: LHS) {
            bw.write(s + "\n");
        }
        bw.flush(); bw.close(); bf.close();
    }

    private static void backTracking(int n, int m, int depth, int startIdx) {
        if (depth == m) {
            String s = "";
            for (int i: arr) {
                s += i + " ";
            }
            LHS.add(s);
            return;
        }

        for (int i = startIdx; i < n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[depth] = sequence[i];
                backTracking(n, m, depth + 1, i);
                visit[i] = false;
            }
        }
    }
}

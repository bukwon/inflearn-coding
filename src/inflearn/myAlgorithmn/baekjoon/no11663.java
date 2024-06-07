package inflearn.myAlgorithmn.baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no11663 {
    static int[] dot;
    static int n;
    static int m;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(bf.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bf.readLine());
        dot = new int[n];
        for (int i = 0; i < n; i++) dot[i] = Integer.parseInt(st.nextToken());

        int[][] line = new int[m][2];
        Arrays.sort(dot);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(bf.readLine());
            line[i][0] = Integer.parseInt(st.nextToken());
            line[i][1] = Integer.parseInt(st.nextToken());
            sb.append(solution(line[i][0], line[i][1])).append("\n");
        }

        bw.write(sb + "");
        bw.flush(); bw.close(); bf.close();
    }

    private static int solution(int left, int right) {
        int lt = 0, rt = n - 1;

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (dot[mid] > right) {
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }
        int endIndex = rt + 1;

        lt = 0;
        rt = n - 1;

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (dot[mid] < left) {
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }
        int startIndex = lt;

        return endIndex - startIndex;
    }
}

// 이따 다녀와서 다시 풀어보기
// 내일 다시 분석
package inflearn.myAlgorithmn.baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class no21318 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int[] music = new int[100001];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 1; i <= n; i++) {
            music[i] = Integer.parseInt(st.nextToken());
        }
        int q = Integer.parseInt(bf.readLine());
        int[] prefix_sum = new int[100001];
        int tmp = 0;
        for (int i = 1; i <= n; i++) {
            if(music[i - 1] > music[i]) tmp++;

            prefix_sum[i] = tmp;
        }
        int[] answer = new int[q];
        int start, end;
        for (int i = 0; i < q; i++) {
            String[] num = bf.readLine().split(" ");
            start = Integer.parseInt(num[0]);
            end = Integer.parseInt(num[1]);
            answer[i] = prefix_sum[end] - prefix_sum[start];
        }
        for (int i: answer) {
            bw.write(i + "\n");
        }
        bw.flush(); bw.close(); bf.close();
    }
}
